package ExercicioJava02;

import java.util.Scanner;

public class LacoCondicionalIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
	
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		numero = leia.nextInt();
		
		if (numero%2==0 && numero>0) {
			System.out.println("O Número "+numero+" é par e positivo!");
		}
		else if (numero%2!=0 && numero<0) {
			System.out.println("O Número "+numero+" é ímpar e negativo!");
		}
		else if (numero%2==0 && numero<0) {
			System.out.println("O Número "+numero+" é par e negativo!");
		}
		else {
			System.out.println("O Número "+numero+" é ímpar e positivo!");
		}
		
	}

}
