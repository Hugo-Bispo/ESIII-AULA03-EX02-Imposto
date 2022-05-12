package view;

import controller.C_BeloHorizonte;
import controller.C_Curutiba;
import controller.C_PortoAlegre;
import controller.C_SaoPaulo;
import model.BeloHorizonte;
import model.Curitiba;
import model.PortoAlegre;
import model.SaoPaulo;

public class Principal {
	public static void main(String[] args) {
		C_BeloHorizonte controller_bh = new C_BeloHorizonte();
		C_Curutiba controller_curitiba = new C_Curutiba();
		C_SaoPaulo controller_sp = new C_SaoPaulo();
		C_PortoAlegre controller_pa = new C_PortoAlegre();
		
		BeloHorizonte bh = new BeloHorizonte();
		Curitiba curitiba = new Curitiba();
		SaoPaulo sp = new SaoPaulo();
		PortoAlegre pa = new PortoAlegre();
		
		bh = controller_bh.calculoimposto(bh);
		curitiba = controller_curitiba.calculoimposto(curitiba);
		sp = controller_sp.calculoimposto(sp);
		pa = controller_pa.calculoimposto(pa);
		
		System.out.println(bh.toString());
		System.out.println(curitiba.toString());
		System.out.println(sp.toString());
		System.out.println(pa.toString());
		
	}

}
