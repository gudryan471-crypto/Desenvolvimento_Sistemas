package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = Integer.parseInt(leia.nextLine());
		
		System.out.println("Digete18 seu nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Idade :" + idade);
		System.out.println("Nome18 :" + nome);
		
	}

}
