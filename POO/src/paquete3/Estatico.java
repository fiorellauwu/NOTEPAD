package paquete3;

public class Estatico {
	
		private static String frase = "Primera frase";
		
			
		public static int sumar(int n1,int n2) {
				int suma = n1+n2;
				return suma;
			}
			
		public static void main (String[]args) {
			System.out.println("La suma es: "+Estatico.sumar(3,4));
			System.out.println(Estatico.frase);
			
		}
}
