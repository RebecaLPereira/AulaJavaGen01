package ExecíciosJava01;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String args[]) {
		
		double sbruto, hextra, anoturno, desconto, sliquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o salário bruto");
		sbruto = leia.nextDouble();
		
		System.out.println("Insira o valor das horas extras:");
		hextra = leia.nextDouble();
		
		System.out.println("Insira o adicional noturno:");
		anoturno = leia.nextDouble();
		
		System.out.println("Insira o valor dos descontos");
		desconto = leia.nextDouble();
		
		sliquido = (sbruto+anoturno (hextra*5)-desconto);
		
		System.out.println("Salário Líquido:"+sliquido);
		
		
	
		
		
		
		
	}
	

}
