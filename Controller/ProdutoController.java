package Controller;

import java.util.ArrayList;

import Menu.CoresMenu;
import Menu.model.Produto;
import Produto.repository.ProdutoRepository;


public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	public void procurarID(int id) {
		var produto = buscarNaCollection(id);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO Produto com ID: " + id + " não foi encontrado!");

	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto com ID: " + produto.getId() + " foi criado com sucesso!\n");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto com ID: " + produto.getId() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO produto com ID: " + produto.getId() + " não foi encontrado!");
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);
		
		if (produto != null) {
			if(listaProdutos.remove(produto) == true)
				System.out.println(CoresMenu.TEXT_WHITE_BOLD+"\nProduto: " + id +" deletada com sucesso.");
		}else
			System.out.println(CoresMenu.TEXT_RED_BOLD+"\nProduto: " + id +" não localizada no sistema.");

	}

	
	int numero;
	public int gerarNumero() {
		return ++numero;
	}

	public Produto buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}

		return null;
	}

}