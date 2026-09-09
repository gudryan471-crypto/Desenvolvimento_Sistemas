package praticando;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int contador = 1;
		int n;
		
		do {
			System.out.println("Informe o "+ contador+ "° numero: ");
			n = leia.nextInt();
			contador++;
			
			double raizQuadrada = Math.sqrt(n);
			
			System.out.println("Valor ditado; "+ n);
			System.out.println("O quadrado do número; "+ n * n);
			System.out.println("O cubo do número; "+ n * n * n);
			System.out.println("A raiz quadrada do número: "+ (raizQuadrada ));
			
			
		} while (n > 0);
		
		
		
		

	}

}
