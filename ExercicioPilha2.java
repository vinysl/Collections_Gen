package Collections;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int op;
		Stack<String> pilha = new Stack<String>();
		
		for (int i=0; i<pilha.size(); i++) {
			
		}
		
		do {
			System.out.println("\n\t\tBem vindo ao menu da biblioteca: ");
			System.out.println("\n\t\t(1) Adicionar livro na pilha: ");
			System.out.println("\n\t\t(2) Listar todos os livros: ");
			System.out.println("\n\t\t(3) Retirar livro da pilha: ");
			System.out.println("\n\t\t(0) Sair: ");
			op = leia.nextInt();
			leia.nextLine();
			
			switch (op) {
			case 1:
				System.out.println("\nAdicionar livro na pilha: ");
				System.out.println("\nInforme o nome do livro: ");
				String nomeLivro = leia.nextLine();
				pilha.push(nomeLivro);
				System.out.println("\nLivro adicionado");
				break;
				
			case 2:
				System.out.println("\nListar todos os livro: ");
				System.out.println(pilha);
				break;
				
			case 3:
				System.out.println("\nRetirar livro da pilha: ");
				if (! pilha.isEmpty()) {
					String livroRemovido = pilha.pop();
					System.out.println("\nO livro "+livroRemovido+" foi removido! ");
				}else {
					System.out.println("\nA pilha está vazia!!! ");
					break;
				}
				
			case 0:
				System.out.println("\nPrograma Finalizado!!! ");
				break;
				default:
					System.out.println("\nOpção inválida!!! ");
					
				System.out.println(pilha);
				break;
			}
			
		}while (op != 0);

	}

}
