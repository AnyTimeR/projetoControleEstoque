package view;

import model.Estoque;
import model.Produto;

public class MainTeste {
	public static void main(String[] args) {
		
		// Cria um novo estoque
	    Estoque estoque = new Estoque(null);
	    
	    // Adiciona alguns produtos ao estoque
	    estoque.adicionaProduto(new Produto(1, "Cerveja Brahma (LATA)", 9.00, 10));
	    estoque.adicionaProduto(new Produto(2, "Energético Monster (LATA)", 7.50, 5));
	    estoque.adicionaProduto(new Produto(3, "Água (GARRAFA)", 5.00, 8));
	    
	    // Imprime o número de produtos no estoque
	    System.out.println("|||||||||||||||NÚMERO DE PRODUTOS NO ESTOQUE: " + estoque.getQuantidadeProdutos());
	    System.out.println();
	    
	    // Imprime a lista de produtos no estoque
	    System.out.println("PRODUTOS NO ESTOQUE: ");
		    for (Produto produto : estoque.getTotalProdutos()) {
		    	System.out.println("Código " + produto.getCodigo() + " - " + produto.getNome() + " - R$" + produto.getPreco() + " - " + produto.getQuantidade() + " unidades");
		    }
		    System.out.println();
	    
	    // Atualiza a quantidade de cervejas no estoque
	    estoque.atualizaQuantidadeProduto("Cerveja Brahma (LATA)", 20);
	    
	    // Imprime a quantidade atual de cervejas no estoque
	    Produto cerveja = estoque.getProdutoPorNome("Cerveja Brahma (LATA)");
		    if (cerveja != null) {
		      System.out.println("Número de cervejas Brahma (LATA) no estoque atualizado: " + cerveja.getQuantidade());
		    }
		    System.out.println();
		    
		// Imprime a lista de produtos no estoque
		System.out.println("PRODUTOS NO ESTOQUE: ");
			for (Produto produto : estoque.getTotalProdutos()) {
				System.out.println("Código " + produto.getCodigo() + " - " + produto.getNome() + " - R$" + produto.getPreco() + " - " + produto.getQuantidade() + " unidades");
		}
		System.out.println();
			
		// Adiciona alguns produtos ao estoque
		estoque.adicionaProduto(new Produto(4, "Suco Del Vale (LATA)", 4.00, 11));
		System.out.println("Novo produto adicionado!");
		
		// Imprime o número de produtos no estoque
	    System.out.println("|||||||||||||||NÚMERO DE PRODUTOS NO ESTOQUE: " + estoque.getQuantidadeProdutos());
	    System.out.println();
	    
	    // Imprime a lista de produtos no estoque
	    System.out.println("PRODUTOS NO ESTOQUE: ");
		    for (Produto produto : estoque.getTotalProdutos()) {
		    	System.out.println("Código " + produto.getCodigo() + " - " + produto.getNome() + " - R$" + produto.getPreco() + " - " + produto.getQuantidade() + " unidades");
		    }
		System.out.println();
		
		// Remove a quantidade de produto por código
		estoque.removeProdutoPorCodigo(3, 3);
		// Remove a quantidade de produto por nome
	    estoque.removeProdutoPorNome("Energético Monster (LATA)", 2);
		
		// Imprime a lista de produtos no estoque
	    System.out.println("PRODUTOS NO ESTOQUE: ");
		    for (Produto produto : estoque.getTotalProdutos()) {
		    	System.out.println("Código " + produto.getCodigo() + " - " + produto.getNome() + " - R$" + produto.getPreco() + " - " + produto.getQuantidade() + " unidades");
		    }
		System.out.println();
		
		
	}
}
