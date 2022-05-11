package model;

public class PortoAlegre extends Cidades {
	private double area_garagem;

	public double getArea_garagem() {
		return area_garagem;
	}

	public void setArea_garagem(double area_garagem) {
		this.area_garagem = area_garagem;
	}

	public String toString() {
		return "Porto Alegre [imposto=" + getImposto() + ", area=" + getArea() + ", area_garagem=" + area_garagem + "]";
	}
}
