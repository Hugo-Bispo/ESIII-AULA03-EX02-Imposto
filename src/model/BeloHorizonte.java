package model;

public class BeloHorizonte extends Cidades {
	private int qtd_quartos;

	public int getQtd_quartos() {
		return qtd_quartos;
	}

	public void setQtd_quartos(int qtd_quartos) {
		this.qtd_quartos = qtd_quartos;
	}

	public String toString() {
		return "Belo Horizonte [imposto=" + getImposto() + ", area=" + getArea() + ", qtd_quartos=" + qtd_quartos + "]";
	}

}
