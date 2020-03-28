/*Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.*/

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
