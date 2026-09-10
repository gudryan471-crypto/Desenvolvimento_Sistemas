package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double MaiorT;
		double MenorT;
		
		double[] temperatura = new double[7];
		
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("Informe a " + (i + 1)+ "° temperatura");
			temperatura[i] = leia.nextDouble();
		}
		MaiorT = temperatura[0];
		MenorT = temperatura[0];
		
		System.out.println("Temperaturas solicitadas: ");
		for(int i = 0; i < temperatura.length; i++) {
			
			if (temperatura[i] > MaiorT) {
				MaiorT = temperatura[i];
			}
			
			if (temperatura[i] < MenorT) {
				MenorT = temperatura[i];
			}
		    System.out.println(temperatura[i]+ "\n");
		}
		
		System.out.println("Maior temperatura: "+ MaiorT);
		System.out.println("Menor temperatura: "+ MenorT);
		
		
 
	}

}
