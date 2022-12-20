package model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	//Atributos da Loja
	private String nome;
	private List<Produto> produtos;
	
	//Construtor da Loja
	public Loja(String nome) {
		this.nome = nome;
		this.produtos = new ArrayList<Produto>();
	}
	
	//Métodos da Loja
	public void adicionaProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public int getQuantidadeProdutos() {
		return produtos.size();
	}
}
