package Main;

import java.util.HashMap;
import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		HashMap<String, String> capitais = new HashMap<>();
		
		// Cadastro das cidades
		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("São Paulo", "São Paulo");
		capitais.put("Minas Gerais", "Belo Horizonte");
		capitais.put("Bahia", "Salvador");
		capitais.put("Paraná", "Curitiba");
		
		
		System.out.println("Informe um estado: ");
		String estados = input.nextLine();
		input.nextLine();
		
		if (capitais.containsKey(estados)) {
			
			String nome = capitais.get(estados);
			System.out.println("Capital encontrada " + nome);
			
		} else {
			System.out.println("Capital não encontrada.");
			
		}
		
		input.close();

	}

}
