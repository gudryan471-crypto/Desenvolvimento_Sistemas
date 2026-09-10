package exercicio5;

import java.util.Scanner;

public class ParesEImpares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int QtdPares = 0;
		int QtdImpares = 0;
		
		int[] numeros = new int[8];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o" + (i + 1) + "° valor: ");
			numeros[i] = leia.nextInt();
			
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i]%2 == 0) {
				System.out.println("Número " + numeros[i] + ": par.\n");
				QtdPares++;
			}
			
			else {
				System.out.println("Número " + numeros[i] + ": ímpar.\n");
				QtdImpares++;
			}
		}
		
		System.out.println("Quantidades de números pares: " + QtdPares);
		System.out.println("Quantidades de números de ímpares: "+ QtdImpares);

	}

}
