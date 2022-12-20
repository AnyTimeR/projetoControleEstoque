package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	//Atributos do Estoque
	private List<Produto> produtos;

	//Construtor do Estoque
	public Estoque(List<Produto> produtos) {
		this.produtos = new ArrayList<Produto>();
	}
	
	//Métodos do Estoque
	public void adicionaProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public int getQuantidadeProdutos() {
		return produtos.size();
	}
	
	public List<Produto> getTotalProdutos() {
		return produtos;
	}
	
	public Produto getProdutoPorNome(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNome().equals(nome)) {
				return produto;
			}
		}
		return null;
	}
	
	public void atualizaQuantidadeProduto(String nome, int novaQuantidade) {
		Produto produto = getProdutoPorNome(nome);
		if (produto != null) {
			produto.setQuantidade(novaQuantidade);
		}
	}

}
