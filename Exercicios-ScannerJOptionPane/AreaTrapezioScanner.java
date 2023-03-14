package br.com.fiap;

import java.util.Scanner;

public class AreaTrapezioScanner {
	
	public static void main(String[] args) {
		float baseMaior, baseMenor, altura, area;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.print("Digite quanto vale as bases: ");
			baseMaior = scan.nextFloat();
			baseMenor = scan.nextFloat();
			System.out.print("Digite quanto vale a altura: ");
			altura = scan.nextFloat();
			
			area = (baseMaior + baseMenor) * altura / 2;
			
			System.out.print("Área do trapézio = " + area);
			
		} catch (Exception e) {
			System.out.print("Valor incompatível!");
		}
		
	}
}
