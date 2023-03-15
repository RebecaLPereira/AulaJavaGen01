package ExecíciosJava01;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String args[])
	{
	float valor1, valor2, valor3, valor4, media;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Insira a nota 1:");
	valor1 = leia.nextFloat();
	
	System.out.println("Insira a nota 2:");
	valor2 = leia.nextFloat();
	
	System.out.println("Insira a nota 3:");
	valor3 = leia.nextFloat();
	
	System.out.println("Insira a nota 4:");
	valor4 = leia.nextFloat();

	media = (valor1+valor2+valor3+valor4)/4;
			
	System.out.println("Insira a Média final:"+media);
			
			
	}
}
