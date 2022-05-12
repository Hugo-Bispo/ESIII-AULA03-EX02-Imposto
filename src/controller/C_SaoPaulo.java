package controller;

import javax.swing.JOptionPane;

import model.Cidades;
import model.SaoPaulo;

public class C_SaoPaulo extends Controller_Imposto implements Imposto {

	public SaoPaulo calculoimposto(Cidades cidade) {
		SaoPaulo sp = new SaoPaulo();
		sp.setArea(Double.parseDouble(JOptionPane.showInputDialog("Digite Area do Imovel:")));
		sp.setQtd_comodos(Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de cômodos do Imovel:")));
		sp.setImposto((sp.getArea() * 10) + (sp.getQtd_comodos() * 2));
		return sp;
	}
}
