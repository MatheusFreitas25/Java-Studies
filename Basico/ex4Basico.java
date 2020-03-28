/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
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
