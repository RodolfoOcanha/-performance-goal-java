package Menu.model;

public class SistemaOperacional extends Produto {

	private String tipoProduto;

	public SistemaOperacional(int id, String nomeProduto, float valor , String tipoProduto) {
		
		super(id, nomeProduto, valor);
		this.setTipoProduto(tipoProduto);
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

}
