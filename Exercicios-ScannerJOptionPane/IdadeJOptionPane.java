package br.com.fiap;

import javax.swing.JOptionPane;

public class IdadeJOptionPane {             // Programa para saber a idade do usuário 

	public static void main(String[] args) {
		int anoAtual = 0, anoNascimento = 0, idade = 0;
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite o ano atual: ");       // O usuario digita em que ano está e o ano que nasceu
			anoAtual = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite em que ano nasceu: ");
			anoNascimento = Integer.parseInt(aux);
			
			idade = anoAtual - anoNascimento;                            // Subtraindo o ano atual e o ano que nasceu, o programa mostra a idade do usuario
			
			JOptionPane.showMessageDialog(null,"Você tem " + idade + " anos");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Digite um ano compativel!");
		}

	}

}
