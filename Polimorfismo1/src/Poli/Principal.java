package Poli;

public class Principal {
	public static void main(String[]args) {
		//Vehiculo misVehiculos[] = new Vehiculo[4];
		
	//	misVehiculos[0] = new Vehiculo("GH67","Ferrari","A89");
	//	misVehiculos[1] = new VehiculoDeportivo(400,"JHDF","AUDI","P5");
	//	misVehiculos[2] = new VehiculoFurgoneta(5000, "45JH","Toyota","JHJ");
	//	misVehiculos[3] = new VehiculoTurismo(4, "15FG","Toyota","J9");
		
	//	for(Vehiculo Vehiculos: misVehiculos) {
	//		System.out.println(Vehiculos.mostrarDatos());
	//		System.out.println("");
			
		//}
		
		
		Vehiculo vehiculo = new VehiculoTurismo(4,"GZ67","Ferrari","A89");
		Vehiculo vehiculo1 = new VehiculoDeportivo(0, "65DF", "Toyota", "Yaris");
		
		System.out.println(vehiculo);
	}
	}
