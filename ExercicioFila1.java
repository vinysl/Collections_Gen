package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila1 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int op,nome;
		
		for (int i=0; i<=fila.size(); i++) {
			
		}
		
		do {
			System.out.println("\n\t\tMenu da Fila: ");
			System.out.println("\n\t(1) Adicionar cliente na fila: ");
			System.out.println("\n\t(2) Listar todos os clientes: ");
			System.out.println("\n\t(3) Retirar cliente da fila:");
			System.out.println("\n\t(0) Sair: ");
			op = leia.nextInt();
			leia.nextLine();
			
			switch (op) {
			case 1:
				System.out.println("\nAdicionar cliente na fila: ");
				System.out.println("\nInforme o nome do cliente: ");
				String nomeCliente = leia.nextLine();
				fila.add(nomeCliente);
				System.out.println("\nCliente adicionado");
				break;
				
			case 2:
				System.out.println("\nListar todos os clientes: ");
				System.out.println(fila);
				break;
				
			case 3:
				System.out.println("\nRetirar cliente da fila: ");
				if (! fila.isEmpty()) {
					String clienteRemovido = fila.poll();
					System.out.println("\nO cliente "+clienteRemovido+" foi chamado! ");
				}else {
					System.out.println("\nA fila está vazia!!! ");
				}
					
				System.out.println(fila);
				break;
				
			case 0:
				System.out.println("\nPrograma Finalizado!!! ");
				break;
				default:
					System.out.println("\nOpção inválida!!! ");
			}
		} while (op!=0);

	}

}
