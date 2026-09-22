package estoque;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		HashMap<String, Integer> estoque = new HashMap<>();
		
		estoque.put( "Teclado", 10);
		estoque.put( "Mouse", 15);
		estoque.put( "Monitor", 6);
		estoque.put( "Notebook", 4);

		System.out.println("Todos os produtos: ");
		for (Map.Entry<String, Integer> estoques : estoque.entrySet()) {
			System.out.println(estoques.getKey() + " | Quantidade de estoque: " +  estoques.getValue());
			;
		}
		System.out.println("\n");
		
		System.out.println("Pesquise a quantidade de determinado produto.");
		
		System.out.println("Informe o produto: ");
		String produto = leia.nextLine();
		
		// Consulta pela chave
		
		if (estoque.containsKey(produto)) {
			int estoques = estoque.get(produto);
			System.out.println("Quantidade de estoque: " + estoques);
			
		} else {
			System.out.println("Produto não cadastrado.");
		}
		
		System.out.println("\n");

		System.out.println("Altere a quantidade de um produto.");
		
		System.out.println("Informe o produto: ");
		String novaQtd = leia.next();
		leia.nextLine();
		
		// Verificar se o produto existe
		if (estoque.containsKey(novaQtd)) {
			System.out.println("Estoque atual: " + estoque.get(novaQtd));
			
			System.out.println("Digite a nova quantidade de estoque: ");
			String novoEstoque = leia.nextLine();
				
		// Alterar o valor associado à chave
			
		estoque.put(novaQtd, 10);
		
		System.out.println("Estoque alterado!");
		System.out.println("Novo Estoque: " + estoque.get(novaQtd));
		
		} else {
			System.out.println("Matrícula não encontrada.");
		
		
		
		}
		System.out.println("\n");
		System.out.println("Remova um produto do estoque.");
		
		System.out.println("Informe o produto que deseja remover: ");
		
		if (estoque.containsKey(novaQtd)) {
			
			String nomeRemovido = 
		}
	}

}
