package ExecíciosJava01;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String args[])
	{
		double salario, abono, valorfinal;
		
		
		Scanner leia = new Scanner(System.in);
		

		System.out.println("Insira o valor do salário:");
		salario = leia.nextDouble();
		System.out.println("Insira o valor do abono:");
		abono = leia.nextDouble();
		
		valorfinal = salario+abono;
		
		System.out.println("O novo valor do salário:"+valorfinal);
	}
}
