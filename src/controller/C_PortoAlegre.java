package controller;

import javax.swing.JOptionPane;

import model.Cidades;
import model.PortoAlegre;

public class C_PortoAlegre extends Controller_Imposto implements Imposto {

	public PortoAlegre calculoimposto(Cidades cidade) {
		PortoAlegre pa = new PortoAlegre();
		pa.setArea(Double.parseDouble(JOptionPane.showInputDialog("Digite Area do Imovel:")));
		pa.setArea_garagem(Double.parseDouble(JOptionPane.showInputDialog("Digite Area da Garagem:")));
		if (pa.getArea_garagem() != 0) {
			pa.setImposto((pa.getArea() * 7.5) + (pa.getArea_garagem() * 2.5));
		} else {
			pa.setImposto((pa.getArea() * 8));
		}
		return pa;
	}

}
