/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

import java.util.Scanner;

public class ex6Basico {

	public static void main(String[] args) {
		
		double A,B,C,X,pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		X = (A*C)/2;
		
		System.out.printf("TRIANGULO = %.3f\n",X);
		
		X = pi * Math.pow(C, 2);
		
		System.out.printf("CIRCULO = %.3f\n",X);
		
		X = ((A+B)*C)/2;
		
		System.out.printf("TRAPEZIO = %.3f\n",X);
		
		X= Math.pow(B, 2);
		
		System.out.printf("QUADRADO = %.3f\n",X);
		
		X= A*B;
		
		System.out.printf("RETANGULO = %.3f\n",X);
		
		
		sc.close();
	}

}
