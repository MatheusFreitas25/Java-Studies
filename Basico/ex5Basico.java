/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago */

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
