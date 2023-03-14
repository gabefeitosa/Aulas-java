package br.com.fiap;

import java.util.Scanner;

public class AreaTrianguloScanner {
	
	public static void main(String[] args) {
		float base, altura, area;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.print("Digite quanto vale a base: ");
			base = scan.nextFloat();
			System.out.print("Digite quanto vale a altura: ");
			altura = scan.nextFloat();
			
			area = base * altura / 2;
			
			System.out.println("Área do triângulo = " + area);
			
		} catch (Exception e) {
			System.out.println("Valor incompatível!");
		}
	}
}
