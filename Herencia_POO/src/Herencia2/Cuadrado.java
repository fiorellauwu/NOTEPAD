package Herencia2;

public class Cuadrado extends FiguraCerrada{
	private double area;
	public Cuadrado(double area, int nLados,double tama�o) {
		super(nLados,tama�o);
		this.area = area;
		
	}
	public void dibujar(){
	System.out.println("Dibujamos un cucadrado");
	}
}
