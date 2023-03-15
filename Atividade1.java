package ExecíciosJava01;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String args[])
	{
		float salario, abono, valorfinal;
		
		
		Scanner leia = new Scanner(System.in);
		

		System.out.println("Insira o valor do salário:");
		salario = leia.nextFloat();
		System.out.println("Insira o valor do abono:");
		abono = leia.nextFloat();
		
		valorfinal = salario+abono;
		
		System.out.println("O novo valor do salário:"+valorfinal);
	}
}
