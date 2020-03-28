/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/

//import java.util.Locale;
import java.util.Scanner;

public class ex2Basico {

	public static void main(String[] args) {
		 
		double pi = 3.14159;
		double raio;
		double area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio : ");
		raio = sc.nextInt();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f",area);
		
		sc.close();
	}

}
