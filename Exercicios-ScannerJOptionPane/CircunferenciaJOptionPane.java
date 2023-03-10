package br.com.fiap;

import javax.swing.JOptionPane;

public class CircunferenciaJOptionPane {

	public static void main(String[] args) {
		double raio = 0,area = 0;
		final double PI = 3.1415;
		String aux;
		
		aux = JOptionPane.showInputDialog("Digite o valor do raio:");
		raio = Double.parseDouble(aux);
		
		area = PI * Math.pow(raio, 2);
		
		JOptionPane.showMessageDialog(null,"Área = " + area);
		

	}

}
