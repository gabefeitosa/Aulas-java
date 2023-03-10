package br.com.fiap;

import java.util.Scanner;

public class CircunferenciaScanner {

	public static void main(String[] args) {
		int raio = 0;
		double area = 0;
		final double PI = 3.1415;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.print("Digite o valor do raio: ");
			raio = scan.nextInt();
			
			area = PI * (raio * raio);
			System.out.print("Área = " + area);
			
		} catch (Exception e) {
			System.out.println("Valor imcompativel!");
		}
				
		
	}

}
