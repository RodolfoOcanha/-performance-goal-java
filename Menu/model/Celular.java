package Menu.model;

import Produto.repository.ProdutoRepository;

public class Celular extends Produto implements ProdutoRepository{

 
    private int sistemaOperacional;

	public Celular(int id, String nomeProduto, float valor, int sistemaOperacional) {
       
    	super(id, nomeProduto, valor);
    	this.sistemaOperacional = sistemaOperacional;
    	
    }

	public int getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(int sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	@Override
	public void procurarID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}
}