package ExercicioJava02;

import java.util.Scanner;

public class LacoRepeticaoFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digita ai");
		x = leia.nextInt();
		System.out.println("digita ai dnv");
		y = leia.nextInt();
		
		if (y<x) {
			System.out.println("Intervalo Inválido");
		}
		
		else {
		
		for(int i=x;i<y;i++) {
		if(i%3==0 && i%5==0) {
			System.out.println(i+" é multiplo de "+x+" e "+y);
		}
		}
		}
	}

}
