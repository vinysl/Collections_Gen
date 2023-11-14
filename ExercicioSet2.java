package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		Set<Integer> valores = new HashSet<Integer>();
		
		valores.add(5);
		valores.add(10);
		valores.add(15);
		valores.add(20);
		valores.add(25);
		valores.add(30);
		valores.add(35);
		valores.add(40);
		valores.add(45);
		valores.add(50);
		
		System.out.println(valores);
		
		System.out.println("\nDigite um número: ");
		num = leia.nextInt();
		
		if(valores.contains(num)) {
			System.out.println("O número "+num+" foi encontrado! ");
		} else {
			System.out.println("\nO número "+num+" não foi encontrado! ");
		}
		
		

	}

}
