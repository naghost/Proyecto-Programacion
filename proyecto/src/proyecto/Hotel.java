package proyecto;
import java.util.*;
public class Hotel {

	public static void main(String[] args) {
		/*Declaracion de Scanner y variables generales*/
		Scanner cadenas = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);
		int canthabitaciones= 0;
		int i;
		String confirmacion,confirmacion2;
		double[] habitaciones;
		String[] nombres;
				/*Variables*/
		/*Setup del programa*/		
		System.out.println("Vamos a realizar los primeros ajustes para usar su programa");
		System.out.println("¿Cuantas habitaciones tiene su hotel?");
		canthabitaciones = numeros.nextInt();
		
			habitaciones = new double[canthabitaciones];
			nombres = new String[canthabitaciones];
		
				for(i=0;i<canthabitaciones;i++){
					int o = i+1;
					System.out.println("¿Que nombre quieres que tenga la habitacion "+o+"?");
					nombres[i] = cadenas.nextLine();
					
					System.out.println("¿Que precio quieres que tenga la habitacion "+o+"?");
					habitaciones[i] = numeros.nextDouble();
													}

				
				System.out.println("Lista de las habitacionces creadas:");
				
					for(i = 0;i<canthabitaciones; i++){
						System.out.println(i+". "+"Nombre: "+nombres[i]+" Precio: "+habitaciones[i]+"€");
					}
				
				System.out.println("¿Todo esta correcto(si o no)?");
				confirmacion = cadenas.nextLine();
				
					if(confirmacion.equals("no")){
									do{
									System.out.println("¿que habitacion esta erronea? (usa los numeros que estaban delante de Nombre)");
									int seleccion = numeros.nextInt();
									
										System.out.println("¿Que quieres cambiar el precio o el nombre");
											String error = cadenas.next();
											
													switch(error){
													case "nombre": 
															System.out.println("Introduzca el nuevo nombre ( actual: "+nombres[seleccion]+")");
															nombres[seleccion] = cadenas.nextLine();
																break;
													case "precio":
															System.out.println("Introduzca el nuevo precio ( actual: "+habitaciones[seleccion]+")");
															habitaciones[seleccion]= cadenas.nextDouble();
																break;
													default: System.out.println("Error");
																break;
													}
										System.out.println("¿Quieres cambiar algun dato mas?");
										confirmacion2 = cadenas.next();
									
									}while(confirmacion2.equals("si"));
												}
					/*Fin Setup*/
		
		/*Inicio del programa*/
					System.out.println("¿Que quieres realizar una reserva, una modificacion o borrar una reserva?");
						
	}

}
