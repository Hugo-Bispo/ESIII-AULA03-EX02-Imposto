package model;

public class Curitiba extends Cidades {
	private int idade_imovel;

	public int getIdade_imovel() {
		return idade_imovel;
	}

	public void setIdade_imovel(int idade_imovel) {
		this.idade_imovel = idade_imovel;
	}

	public String toString() {
		return "Curitiba [imposto=" + getImposto() + ", area=" + getArea() + ", idade_imovel=" + idade_imovel + "]";
	}
}
