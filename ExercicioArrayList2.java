package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioArrayList2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		List<Integer> valores = new ArrayList<Integer>();
		
		valores.add(3); // adiciona elementos dentro do ArrayList
		valores.add(6);
		valores.add(9);
		valores.add(12);
		valores.add(15);
		valores.add(18);
		valores.add(21);
		valores.add(24);
		valores.add(27);
		valores.add(30);
		
		for (Integer listaValores : valores) {
			System.out.println(listaValores);
		}
		
		System.out.println("\nDigite um número: ");
		num = leia.nextInt();
		
		if(valores.contains(num)) {
			System.out.println("\nO número "+num+" está localizado na posição "+valores.indexOf(num)); // indexOf mostra a posição onde o número digitado pelo usúario se encontra.
		}else {
			System.out.println("\nO número "+num+" não foi encontrado!!! ");
		}

	}

}
