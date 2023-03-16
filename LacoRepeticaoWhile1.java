package ExercicioJava02;

import java.util.Scanner;

public class LacoRepeticaoWhile1 {
	
	public static void main(String[] args) {
		//main - ctrl+space |public static void main(String[] args)
		
		int idade=0, totalMenor=0, totalMaior=0;
		
		Scanner leia = new Scanner(System.in);
		//importar scanner - ctrl+space+enter
		
		while (idade>=0) {
		System.out.println("Digite uma idade");
		idade = leia.nextInt();
		if (idade<21 && idade>0) {
			totalMenor++;
		}
		else if(idade>50) {
			totalMaior++;
		}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: "+totalMenor);
		System.out.println("Total de pessoas maiores de 50 anos: "+totalMaior);

	}

}

