package Ejemplo3;
import java.util.Scanner;
public class Principal {
		
	public static int indiceCocheMBarato(Vehiculo coches[]) {
		float precio;
		int indice = 0;
		
		precio = coches[0].getPrecio();
		for(int i=1;i<coches.length;i++) {
		if(coches[1].getPrecio()<precio) {
			precio = coches[1].getPrecio();
			indice = i ;
		  }
	   }
		return indice;	
     }
	
	
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		String marca,modelo;
		float precio;
		int numeroVehiculos;
		
		System.out.print("Digite la cantiad de vehiculos");
		numeroVehiculos =entrada.nextInt();
		
		Vehiculo coches []= new Vehiculo[numeroVehiculos];
		
		
		for(int i=0;i<coches.length; i++) {
			System.out.print("\nDigite las caracteristicas del  coche "+(i+1)+":");
			System.out.print("Introduzca Marca: ");
			marca = entrada.nextLine();
			System.out.print("Intrpduzca Modelo: ");
			modelo = entrada.nextLine();
			System.out.print("Introduzca Precio: ");
			precio = entrada.nextFloat();
		
			coches [i] = new Vehiculo(marca,modelo,precio);
		}
		
		indiceBarato  = indiceCocheMBarato(coches);
		 
		
		}
		
}
