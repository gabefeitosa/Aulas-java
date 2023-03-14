package br.com.fiap;

import javax.swing.JOptionPane;

public class AreaRetanguloJOptionPane {
	public static void main(String[] args) {
		float base, altura, area;
		String aux;
		
		
		try {
			aux = JOptionPane.showInputDialog("Digite quanto vale a base: ");
			base = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite quanto vale a altura");
			altura = Float.parseFloat(aux);
			
			area = base * altura;
			
			JOptionPane.showMessageDialog(null, "Área do retangulo = " + area);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor incompatível!");
		}
		
	}
}
