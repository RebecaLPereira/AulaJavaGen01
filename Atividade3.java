package ExecíciosJava01;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String args[]) {
		
		float sbruto, hextra, anoturno, desconto, sliquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o salário bruto");
		sbruto = leia.nextFloat();
		
		System.out.println("Insira o valor das horas extras:");
		hextra = leia.nextFloat();
		
		System.out.println("Insira o adicional noturno:");
		anoturno = leia.nextFloat();
		
		System.out.println("Insira o valor dos descontos");
		desconto = leia.nextFloat();
		
		sliquido = sbruto+anoturno+(hextra*5)-desconto;
		
		System.out.println("Salário Líquido:"+sliquido);
		
		//SALÁRIO LÍQUIDO = SALÁRIO BRUTO + ADICIONAL NOTURNO + (HORAS EXTRAS * 5) - DESCONTOS

	
		
		
		
		
	}
	

}
