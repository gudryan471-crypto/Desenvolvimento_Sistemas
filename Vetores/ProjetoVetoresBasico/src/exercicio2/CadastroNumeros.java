package exercicio2;

import java.util.Scanner;

public class CadastroNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int [] numeros = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o número da "+ (i + 1) + "° posição: ");
			numeros[i] = leia.nextInt();
		
		}
		
		 for (int y = 0; y < numeros.length; y++) {
			 System.out.println(numeros[y]);
			 
		 }
		

	}

}
