package Herencia2;

public class FiguraCerrada extends Figura {
	private int nLados;
	
	public FiguraCerrada(int nLados, double tama�o) {
		super(tama�o); 
		this.nLados = nLados;
	}
	public void dibujar(){
		System.out.println("Dibujo de una figura cerrada");
	}
	

}
