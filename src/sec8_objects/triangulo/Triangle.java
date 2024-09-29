package sec8_objects.triangulo;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double areaTriangulo() {
		double p = (a + b + c)/2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
