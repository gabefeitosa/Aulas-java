package br.com.fiap;

import java.util.Scanner;

public class MediaAritmeticaScanner {

	public static void main(String[] args) {
		int prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0, media = 0;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite as notas das 4 provas: ");
			prova1 = scan.nextInt();
			prova2 = scan.nextInt();
			prova3 = scan.nextInt();
			prova4 = scan.nextInt();
			
			media = (prova1 + prova2+ prova3 + prova4) / 4;
			
			System.out.println("Média =  " + media);
			
			
					
		} catch (Exception e) {
			System.out.println("O formato do número é incompativel");
		}

	}

}
