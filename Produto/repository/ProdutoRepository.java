package Produto.repository;

import Menu.model.Produto;

public interface ProdutoRepository {
	
	// CRUD de conta
	public void procurarPorID(int id);
	public void listarTodas();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto); 
	public void deletar(int id);
	public void tipoProduto (String tipoProduto);
	
	
}
