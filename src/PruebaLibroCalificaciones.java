/*Clase main para el ejercicio del libro, pag 74 Fig. 3.2*/
// Crea un objeto libroCalificaciones y llama a su metodo

import java.util.Scanner; //usa la clase Scanner

public class PruebaLibroCalificaciones {
	//Aqui inicia la ejecucion del programa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea el objeto Scanner para leer los datos de la ventana de comandos
		//Scanner entrada = new Scanner(System.in);
		
		//Crea un objeto libroCalificaciones 
		//usando el constructor
		LibroCalificaciones LibroCalificaciones1 = new LibroCalificaciones("C01 Curso basi de Java");
		
		LibroCalificaciones LibroCalificaciones2 = new LibroCalificaciones("c02 Curso avanzado de Java");
		
				
		System.out.println(LibroCalificaciones1.obtenerNombreDelCurso());
		
		System.out.println(LibroCalificaciones2.obtenerNombreDelCurso());
		
	}// fin de la clase main

}// fin de la clase PruebaLibroCalificaciones
