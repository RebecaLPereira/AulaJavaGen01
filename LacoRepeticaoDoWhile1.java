package ExercicioJava02;

import java.util.Scanner;

public class LacoRepeticaoDoWhile1 {
	
	public static void main(String[] args) {
		
		int numero=0,somaPositivo=0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		if(numero>0) {
			somaPositivo=numero+somaPositivo;
		}
		}while (numero!=0);
		System.out.println("A soma dos números positivos é: "+somaPositivo);
}
}