package br.com.fiap;

import java.util.Scanner;

public class AreaRetanguloScanner {
	
	public static void main(String[] args) {
		float base, altura, area;
		Scanner scan;
		
		try {
			scan = new Scanner (System.in);
			System.out.print("Digite quanto vale a base: ");
			base = scan.nextFloat();
			System.out.print("Digite quanto vale a altura: ");
			altura = scan.nextFloat();
			
			area = base * altura;
			
			System.out.println("Área do retangulo = " + area);
			
		} catch (Exception e) {
			System.out.println("Valor incompatível!");
		}
		
	}
}
