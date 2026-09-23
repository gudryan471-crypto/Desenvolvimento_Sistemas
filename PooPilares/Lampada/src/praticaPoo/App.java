package praticaPoo;

public class App {

	public static void main(String[] args) {
		
		Lampadas l1 = new Lampadas();
		Lampadas l2 = new Lampadas();
		
		l1.setNome("GWiluminária");
		l1.getNome();
		l1.setMarca("Fil");
		l1.getMarca();
		l1.setQtdEstoque(100);
		l1.getNome();
		
		
		l2.setMarca("GudryGG");
		l2.getMarca();
		l2.setNome("Claramin");
		l1.getNome();
		l2.setQtdEstoque(150);
		l2.getQtdEstoque();
		
		
		System.out.println("Primeira Lâmpada");
		l1.exibirDados();
		
		System.out.println("\nSegunda Lâmpada");
		l2.exibirDados();

		System.out.println();
		l1.ligar();
		l1.estadoLampada();
		l1.desligar();
		l1.estadoLampada();
		l1.ligar();
		l1.estadoLampada();
	}

}
