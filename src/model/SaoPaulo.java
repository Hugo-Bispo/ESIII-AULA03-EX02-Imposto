package model;

public class SaoPaulo extends Cidades {
	private int qtd_comodos;

	public int getQtd_comodos() {
		return qtd_comodos;
	}

	public void setQtd_comodos(int qtd_comodos) {
		this.qtd_comodos = qtd_comodos;
	}

	public String toString() {
		return "Sao Paulo [imposto=" + getImposto() + ", area=" + getArea() + ", qtd_comodos=" + qtd_comodos + "]";
	}

}
