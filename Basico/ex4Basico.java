/* Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
decimais */

import java.util.Scanner;

public class ex4Basico {

	public static void main(String[] args) {
		
		int numero,horas;
		float valor,total;
		
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextFloat();
		
		total = (float) horas * valor;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = $ " + total);
		
		sc.close();
	}

}
