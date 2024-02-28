package Produto.repository;

import Menu.model.Produto;

public interface ProdutoRepository {
	
	// CRUD de conta
	public void procurarID(int id);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto); 
	public void deletar(int id);
	
	
	
}
