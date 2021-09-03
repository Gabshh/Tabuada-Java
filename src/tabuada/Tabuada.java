package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int multiplicando;
		int multiplicador;
		int contador = 0;
		
		System.out.println("CONSTRUA SUA TABUADA!!");
		System.out.println(" ");
		
		System.out.print("Qual o multiplicando? ");
		multiplicando = leitor.nextInt();
		System.out.print("Qual o máximo multiplicador? ");
		multiplicador = leitor.nextInt();
		System.out.println(" ");
		
		leitor.close();
		
		System.out.println("TABUADA DO " + multiplicando);
		System.out.println("----------------------");
		
		while (contador <= multiplicador) {
			System.out.println(multiplicando + " x " + contador + " = " + multiplicando * contador);
			
			contador++;
		}
		
		
	}
}
