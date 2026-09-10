package exercicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double soma = 0;
		double media = 0;
		
		double[] notas = new double[4];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Informe a " + (i + 1) + "° nota: ");
			notas[i] = leia.nextInt();
			
			soma += notas[i];
			
		}
		System.out.println("Notas cadastradas:");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		media = soma / notas.length;
		
		System.out.printf("\nMédia: %.2f%n ", media);

	}

}
