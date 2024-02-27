package Controller;

import java.util.ArrayList;

import Menu.CoresMenu;
import Menu.model.Produto;
import Produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	@Override
	public void procurarPorID(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id) {
         
            	return;
            }
        }
        System.out.println("Produto não encontrado com o ID: " + id);
    }


	@Override
	public void listarTodas() {
		 for (Produto produto : listaProdutos) {
	            System.out.println(produto);
	        }
	    }

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("Produto cadastrado com sucesso!");

	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id) {
                listaProdutos.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado com o ID: " + id);
    }

	@Override
	public void tipoProduto(int tipoProduto) {
		// TODO Auto-generated method stub

	}

}
