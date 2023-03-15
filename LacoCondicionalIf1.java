package ExercicioJava02;

import java.util.Scanner;

public class LacoCondicionalIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A,B,C,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A:");
		A = leia.nextInt();
		System.out.println("Digite o número B:");
		B = leia.nextInt();
		System.out.println("Digite o número C");
		C = leia.nextInt();
		
		
		soma = A+B;
		
		if (soma>C) {
			System.out.println("A soma de A e B é maior que C");
		}
		
		else if (soma<C) {
			System.out.println("A soma de A e B é menor que C");
		}
		else {
			System.out.println("A soma de A e B é igual a C");
		}
		
	}

}
