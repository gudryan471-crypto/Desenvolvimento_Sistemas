package praticando;

public class App {

	public static void main(String[] args) {
		
		String numero1 = "10";
		String numero2 = "5";
		String numero3 = "12.50";
		
		
		System.out.println(numero1 + numero2);
		
		System.out.println(Integer.parseInt(numero1));
		System.out.println(Integer.parseInt(numero2));

		
		int n1 = Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2);
		
		System.out.println((n1 + n2));
		System.out.println((n1 - n2));
		System.out.println((n1 * n2));
		
		
		System.out.println(Double.parseDouble(numero3));
		
		double preco_Convertido = Double.parseDouble(numero3);
		
		System.out.println((preco_Convertido + 5));
		
	}

}
