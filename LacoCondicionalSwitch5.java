package ExercicioJava02;

import java.util.Scanner;

public class LacoCondicionalSwitch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codProduto,quantidade,valorTotal;
		
		Scanner leia = new Scanner(System.in);
		//////////////////////////////////////////
		System.out.print("Código do Produto: ");
		codProduto = leia.nextInt();
		
		System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		////////////////////////////////////////////
		switch (codProduto) {
		
		case 1:
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor Total: R$"+quantidade*10.00);
			break;
			
		case 2:
			System.out.println("Produto: X-Salada");
			System.out.println("Valor Total: R$"+quantidade*15.00);
			break;
			
		case 3:
			System.out.println("Produto: Bacon");
			System.out.println("Valor Total: R$"+quantidade*18.00);
			break;
			
		case 4:
			System.out.println("Produto: Bauru");
			System.out.println("Valor Total: R$"+quantidade*12.00);
			break;
			
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor Total: R$"+quantidade*8.00);
			break;
			
		default:
			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor Total: R$"+quantidade*13.00);
		
				
		}
	}

}
