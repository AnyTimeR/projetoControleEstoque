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
	
	private void removeProduto(Produto produto, int quantidade) {
		if (quantidade > produto.getQuantidade()) {
			throw new IllegalArgumentException("Não há estoque suficiente para remover essa quantidade de produtos");
		}
		produto.setQuantidade(produto.getQuantidade() - quantidade);
	}
	
	public void removeProdutoPorCodigo(int codigo, int quantidade) {
		for (Produto produto : produtos) {
			if (produto.getCodigo() == codigo) {
				removeProduto(produto, quantidade);
			} 
		}
	}

	public void removeProdutoPorNome(String nome, int quantidade) {
		for (Produto produto : produtos) {
			if (produto.getNome().equals(nome)) {
				removeProduto(produto, quantidade);
			}
		}
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
