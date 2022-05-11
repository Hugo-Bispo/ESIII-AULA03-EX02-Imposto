package model;

public class Cidades {
	private double imposto;
	private double area;

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String toString() {
		return "Cidades [imposto=" + imposto + ", area=" + area + "]";
	}

}
