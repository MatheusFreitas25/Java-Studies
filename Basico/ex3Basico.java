/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).*/

//import java.util.Locale;
import java.util.Scanner;

public class ex3Basico {

	public static void main(String[] args) {
		int a,b,c,d,diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("Diferenca = " + diferenca);
		
		sc.close();
	}

}
