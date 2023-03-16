package ExecíciosJava01;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String args[]) 
	{

		float n1, n2, n3, n4, resul;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o valor 1:");
		n1 = leia.nextFloat();
		
		System.out.println("Insira o valor 2:");
		n2 = leia.nextFloat();
		
		System.out.println("Insira o valor 3:");
		n3 = leia.nextFloat();
		
		System.out.println("Insira o valor 4:");
		n4 = leia.nextFloat();
		
		resul = (n1*n2)-(n3*n4);
				
		System.out.println("Resultado Final:"+resul);
	
		
	}
	

}
