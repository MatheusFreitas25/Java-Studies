//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

//import java.util.Locale;
import java.util.Scanner;


public class ex1Basico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int resultado;
		
		x = sc.nextInt();
		y = sc.nextInt();
		resultado = x + y;
		
		System.out.println("SOMA = " + resultado);
		
		sc.close();
	}

}
