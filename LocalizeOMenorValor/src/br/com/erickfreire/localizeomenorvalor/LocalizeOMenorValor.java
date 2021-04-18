package br.com.erickfreire.localizeomenorvalor;

import javax.swing.JOptionPane;

/**
 * Program em Java que localiza o menor valor
 * @author Erick Freire
 * @version 1 - Criado em 18-04-2021 as 15:21
 */

public class LocalizeOMenorValor {
	public static void main(String[] args) {
		int numero;
		String menor;
		int menorNumero;
		int res = 0;
		
		JOptionPane.showMessageDialog(null, "Programa que verifica qual o menor valor :");
		
		menor = JOptionPane.showInputDialog("Informe quantos n�meros ser�o inseridos: ");
		numero = Integer.parseInt(menor);
		
		for(int i = 1; i <= numero; i++) {
			menor = JOptionPane.showInputDialog("Informe um n�mero: ");
			menorNumero = Integer.parseInt(menor);
			
			if(i == 1)
				res = menorNumero;
			else
				if(menorNumero < res)
					res = menorNumero;
		}
		
		String msg = String.format("O menor valor � o : %d\n", res);
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
