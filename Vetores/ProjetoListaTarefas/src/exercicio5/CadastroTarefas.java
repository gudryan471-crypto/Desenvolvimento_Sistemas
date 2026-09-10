package exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTarefas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> tarefas = new ArrayList<>();
		String tarefa;
		String continuar;
		
		do {
			System.out.print("Cadastre uma tarefa: ");
			tarefa = leia.nextLine();
			
			tarefas.add(tarefa);
			
			System.out.println("Deseja cadastrar outra tarefa? sim/não");
			continuar = leia.nextLine();
			
		} while (continuar.equalsIgnoreCase("sim"));

		
	}

}
