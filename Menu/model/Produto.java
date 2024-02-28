package Menu.model;

import Menu.CoresMenu;

public abstract class Produto {

 
	private int id;
	private String nomeProduto;
	private float valor;
	
    public Produto() {}
    
	public Produto(int id, String nomeProduto, float valor) {
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void visualizar() {

		System.out.println(CoresMenu.TEXT_RED_BOLD +"\n********************************");
		System.out.println(CoresMenu.TEXT_WHITE_BOLD +"   Produtos cadastrados:        ");
		System.out.println(CoresMenu.TEXT_RED_BOLD +"******************************** " );
		System.out.println(CoresMenu.TEXT_WHITE_BOLD + "ID do produto: " + getId());
		System.out.println(CoresMenu.TEXT_WHITE_BOLD + "Nome do produto: " + getNomeProduto());
		System.out.println(CoresMenu.TEXT_WHITE_BOLD + "Valor do produto: R$" + getValor());
		
	}

	
		
	}
	