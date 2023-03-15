package ExercicioJava02;

import java.util.Scanner;

public class LacoCondicionalSwitch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int codigoCargo;
		float salario;

		Scanner leia = new Scanner(System.in);

		System.out.println("Nome do Colaborador");
		nome = leia.next();
		System.out.println("Cargo:");
		codigoCargo = leia.nextInt();
		System.out.println("Salário");
		salario = leia.nextFloat();
		
		switch (codigoCargo){
		
		case 1:
			System.out.println("Nome do Colaborador"+nome);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário Reajuste:"+salario+(0.1*salario));
			break;
			
		case 2:
			System.out.println("Nome do Colaborador"+nome);
			System.out.println("Cargo: Vendedor");
			System.out.println("Salário Reajuste:"+salario+(0.07*salario));
			break;
			
		case 3:
			System.out.println("Nome do Colaborador"+nome);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário Reajuste:"+salario+(0.09*salario));
			break;
			
		case 4:
			System.out.println("Nome do Colaborador"+nome);
			System.out.println("Cargo: Motorista");
			System.out.println("Salário Reajuste:"+salario+(0.06*salario));
			break;
			
		case 5:
			System.out.println("Nome do Colaborador"+nome);
			System.out.println("Cargo: Estoquista");
			System.out.println("Salário Reajuste:"+salario+(0.05*salario));
			break;
			
		default:
			System.out.println("Nome do Colaborador"+nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Salário Reajuste:"+salario+(0.08*salario));
			
			
			
		}
		
		
		
	}

}
