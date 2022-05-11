package view;

import controller.C_BeloHorizonte;
import controller.C_Curutiba;
import controller.C_PortoAlegre;
import controller.C_SaoPaulo;
import controller.Imposto;

public class Principal {
	public static void main(String[] args) {
		Imposto imposto;
		
		imposto = new C_SaoPaulo();
		imposto.calculoimposto();
		
		imposto = new C_BeloHorizonte();
		imposto.calculoimposto();
		
		imposto = new C_PortoAlegre();
		imposto.calculoimposto();
		
		imposto = new C_Curutiba();
		imposto.calculoimposto();
	}

}
