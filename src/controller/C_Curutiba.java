package controller;

import javax.swing.JOptionPane;

import model.Cidades;
import model.Curitiba;

public class C_Curutiba extends Controller_Imposto implements Imposto {

	public Curitiba calculoimposto(Cidades cidade) {
		Curitiba curitiba = new Curitiba();
		curitiba.setArea(Double.parseDouble(JOptionPane.showInputDialog("Digite Area do Imovel:")));
		curitiba.setIdade_imovel(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Imovel:")));
		if (curitiba.getIdade_imovel() < 20) {
			curitiba.setImposto((curitiba.getArea() * 5) + (curitiba.getIdade_imovel() * 2));
		} else if (curitiba.getIdade_imovel() < 50) {
			curitiba.setImposto((curitiba.getArea() * 5) + (curitiba.getIdade_imovel() * 2.5));
		} else {
			curitiba.setImposto((curitiba.getArea() * 5) + (curitiba.getIdade_imovel() * 3));
		}
		return curitiba;
	}

}
