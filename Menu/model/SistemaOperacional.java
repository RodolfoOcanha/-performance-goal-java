package Menu.model;

import Menu.CoresMenu;

public class SistemaOperacional extends Produto {

	private int tipoProduto;


	public SistemaOperacional(int id, String nomeProduto, float valor, int tipoProduto) {
		super(id, nomeProduto, valor);
		this.setTipoProduto(tipoProduto);
	}


	public int getTipoProduto() {
		return tipoProduto;
	}


	public void setTipoProduto(int tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
		

}


