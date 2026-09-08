package condicional;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Informe um número: ");
		int numero = leia.nextInt();
		
		if (numero > 20) 
			System.out.println("Número maior que 20");
		else if (numero == 20)
		System.out.println("Número é 20");
		else 
			System.out.println("Número menor que 20");
	}

}
