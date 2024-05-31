package br.com.prospertech.control;

import br.com.prospertech.model.Produto;
import br.com.prospertech.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // endpoint para adicionar um novo produto
    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    // endpoint para obter todos os produtos
    @GetMapping
    public List<Produto> obterTodosProdutos() {
        return produtoRepository.findAll();
    }

    // endpoint para obter um produto por id
    @GetMapping("/{id}")
    public Produto obterProdutoPorId(@PathVariable Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com o ID: " + id));
    }

    // endpoint para excluir um produto
    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }

    // endpoint para atualizar um produto existente
    @PutMapping("{/id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produtoAtualizado) {
        return produtoRepository.findById(id)
                .map(produto -> {
                    produto.setNome(produtoAtualizado.getNome());
                    produto.setPreco(produtoAtualizado.getPreco());
                    produto.setDescricao(produtoAtualizado.getDescricao());
                    produto.setQuantidade(produtoAtualizado.getQuantidade());
                    return produtoRepository.save(produto);
                })
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com o ID: " + id));
    }

    // endpoint para buscar produtos pelo nome
    @GetMapping("/buscar/nome")
    public List<Produto> buscarProdutosPorNome(@RequestParam String nome) {
        return produtoRepository.findByNome(nome);
    }

    // endpoint para buscar produtos com preço menor que um valor específico
    @GetMapping("/buscar/preco/menor")
    public List<Produto> buscarProdutosPorPrecoMenorQue(@RequestParam Double preco) {
        return produtoRepository.findByPrecoLessThan(preco);
    }

    // endpoint para buscar produtos com preço maior que um valor específico
    @GetMapping("/buscar/preco/maior")
    public List<Produto> buscarProdutosPorPrecoMaiorQue(@RequestParam Double preco) {
        return produtoRepository.findByPrecoGreaterThan(preco);
    }
}
