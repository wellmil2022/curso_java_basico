package sec8_objects.retangulo;

public class Rectangule {
	private double altura;
	private double largura;
	/**
	 * @return the largura
	 */
	public double getLargura() {
		return largura;
	}
	/**
	 * @param largura the largura to set
	 */
	public void setLargura(double largura) {
		this.largura = largura;
	}
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double areaRetangulo() {
		return this.altura * this.largura;
	}
	
	public double perimeterRetangulo() {
		return this.largura * 2 + this.altura *2;
	}
	
	public double diagonalretangulo() {
		return Math.sqrt(Math.pow(getLargura(), 2) + Math.pow(getAltura(), 2.0));
	}
	
}
