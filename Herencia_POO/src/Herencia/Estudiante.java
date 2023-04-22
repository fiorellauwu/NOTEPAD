package Herencia;

public class Estudiante extends Persona{
	private int codigoEstudiante;
	private float notaFinal;
	
	public Estudiante (String nombre,String apellido,int edad, int codigoEstudiante,float notaFinal) {
	super(nombre,apellido,edad);	//Aquí van los inicializados en la clase Persona
	this.codigoEstudiante= codigoEstudiante;
	this.notaFinal = notaFinal;
	
	}
	public void mostrarDatos () {
			System.out.println("Nombre: "+getNombre()+
					"\nApellido: "+getApellido()+
					"\nEdad: "+getEdad()+
					"\nCodigo Edtudiante: "+codigoEstudiante+
					"\nNota: "+notaFinal);
	}
	
			
			
			


}
