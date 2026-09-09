package menu;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primerio número: ");
		int n1 = leia.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int n2 = leia.nextInt();
		
		System.out.println("Média dos números é: "+ (n1 + n2)/2 + "\n");
		
		if(n1 < n2)
			System.out.println("Subtração do maior número: " + (n2 - n1)+ "\n");
		
		else
			System.out.println("Subtração do maior número: "+ (n1 - n2)+ "\n");
		
		System.out.println("Multiplicação dos numeros: "+ (n1 * n2)+ "\n");
		
		System.out.println("Multiplicação dos numeros: "+ (n1 / n2)+ "\n");
		
		
		
		
		
		
		
		

	}

}
