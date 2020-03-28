/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago */

import java.util.Scanner;

public class ex5Basico {

	public static void main(String[] args) {
		
		int cod1,cod2,qnt1,qnt2;
		float valor1,valor2,total;

		Scanner sc = new Scanner(System.in);
		
		cod1 = sc.nextInt();
		qnt1 = sc.nextInt();
		valor1 = sc.nextFloat();
		
		cod2 = sc.nextInt();
		qnt2 = sc.nextInt();
		valor2 = sc.nextFloat();
		
		total = (float) qnt1*valor1 + qnt2*valor2;
		
		System.out.printf("VALOR A PAGAR = $ %.2f",total);
		
		
		sc.close();
	}

}
