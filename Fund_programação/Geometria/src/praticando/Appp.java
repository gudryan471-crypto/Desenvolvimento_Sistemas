package praticando;

import java.util.Scanner;

public class Appp {

	public static void main(String[] args) {
		double valorCarlos = 3000;
		double valorJoao = 1000;
		
		int QtdMeses = 0;
		
		while (valorCarlos > valorJoao) {
			valorCarlos = valorCarlos * 1.02;
			valorJoao = valorJoao * 1.05;
			
			QtdMeses++;
		}
		
		System.out.println("Quantidade de meses: "+ QtdMeses);
		System.out.println("Valor Calos: "+ valorCarlos);
		System.out.println("Valor João: "+ valorJoao);

	}

}
