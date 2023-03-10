package br.com.fiap;

import javax.swing.JOptionPane;

public class MediaAritmeticaJOptionPane {

	public static void main(String[] args) {
		int prova1 = 0,prova2 = 0,prova3 = 0,prova4 = 0,media = 0;
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite a nota da primeira prova");
			prova1 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da segunda prova");
			prova2 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da terceira prova");
			prova3 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da quarta prova");
			prova4 = Integer.parseInt(aux);
			
			media = (prova1 + prova2 + prova3 + prova4) / 4;
			
			JOptionPane.showMessageDialog(null,"Média = " + media);
					
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"O formato do número é imcompativel");
		}
		
		
		

	}

}
