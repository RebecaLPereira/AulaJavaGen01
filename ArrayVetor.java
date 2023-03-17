package ExercicioJava02;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] num = {2,5,1,3,4,9,7,8,10,6};
		int x,i;
		
		
		
		System.out.print("Digite o número que você deseja encontrar: ");
		x = leia.nextInt();
		//x == {2,5,1,3,4,9,7,8,10,6};
		
		for (i = 0; i < num.length; i++) {
			
			if (x == num [i]){
				System.out.println("O número "+x+" está localizado na posição: "+i);
				break;
			}
			else if (i == num.length-1){
				System.out.println("O número"+x+" não foi encontrado!");
			}
		
		}
	}
}
