package controller;

import javax.swing.JOptionPane;

import model.BeloHorizonte;
import model.Cidades;

public class C_BeloHorizonte extends Controller_Imposto implements Imposto {

	public BeloHorizonte calculoimposto(Cidades cidade) {
		BeloHorizonte bh = new BeloHorizonte();
		bh.setArea(Double.parseDouble(JOptionPane.showInputDialog("Digite Area do Imovel:")));
		bh.setQtd_quartos(Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de quartos do Imovel:")));
		bh.setImposto((bh.getArea() * 7) + (bh.getQtd_quartos() * 4));
		return bh;
	}

}
