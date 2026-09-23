package praticaPoo;

public class Lampadas {

	private String nome, marca;
	private int qtdEstoque;
	private boolean estadoLampada;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		
		if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Nome inválido");
		}
		else {
			this.nome = nome;
		}
		
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		if (qtdEstoque > 0) {
			this.qtdEstoque = qtdEstoque;
			
		} else {
			System.out.println("Estoque inválido.");
		}
		
	}
	
	void ligar() {
		estadoLampada = true;
		
		
	}
	public boolean isEstadoLampada() {
		return estadoLampada;
	}
	public void setEstadoLampada(boolean estadoLampada) {
		this.estadoLampada = estadoLampada;
	}
	void desligar() {
		estadoLampada = false;
		
	}
	public void exibirDados() {
		System.out.println("Marca: " + marca);
		System.out.println("Nome: " + nome);
		System.out.println("Quantidade de estoque: " + qtdEstoque);
	}
	
	void estadoLampada() {
		if (estadoLampada == true) {
			System.out.println("Ligada");
			
		}
		else {
			System.out.println("desligada");
		}
	}
	
	
}
