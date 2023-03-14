package br.com.fiap;

import javax.swing.JOptionPane;

public class AreaTrapezioJOptionPane {
	
	public static void main(String[] args) {
		float baseMaior, baseMenor, altura, area;
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite quanto vale a base maior: ");
			baseMaior = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite quanto vale a base menor: ");
			baseMenor = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite quanto vale a altura: ");
			altura = Float.parseFloat(aux);
			
			area = (baseMaior + baseMenor) * altura / 2;
			
			JOptionPane.showMessageDialog(null, "Área do trapézio = " + area);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor incompatível!");
		}
	}
}
