package br.com.fiap;

import java.util.Scanner;

public class IdadeScanner {      // Programa para saber a idade do usuário   
           
	public static void main(String[] args) {
		int anoAtual = 0, anoNascimento = 0, idade = 0;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.print("Digite o ano atual: ");    // O usuario digita em que ano está e o ano que nasceu
			anoAtual = scan.nextInt();
			System.out.print("Digite em que ano nasceu: ");
			anoNascimento = scan.nextInt();
			
			idade = anoAtual - anoNascimento;           // Subtraindo o ano atual e o ano que nasceu, o programa mostra a idade do usuario
			
			System.out.println("Você tem " + idade + " anos");
		} catch (Exception e) {
			System.out.println("Digite um ano compativel!");
		}

	}

}
