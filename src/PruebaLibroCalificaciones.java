/*Clase main para el ejercicio del libro, pag 74 Fig. 3.2*/
// Crea un objeto libroCalificaciones y llama a su metodo

import java.util.Scanner; //usa la clase Scanner

public class PruebaLibroCalificaciones {
	//Aqui inicia la ejecucion del programa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea el objeto Scanner para leer los datos de la ventana de comandos
		Scanner entrada = new Scanner(System.in);
		
		//Crea un objeto libroCalificaciones y lo asigna a
		//miLibroCalificaciones
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
		
		//pide y recibe el nombre del curso como entrada
		System.out.println("Escriba el nombre del curso");
		String nombreDelCurso = entrada.nextLine();//lee una linea de texto
		
		
		//ahora llama al metodo del objeto creado
		miLibroCalificaciones.mostrarMensaje(nombreDelCurso);
		
	}// fin de la clase main

}// fin de la clase PruebaLibroCalificaciones
