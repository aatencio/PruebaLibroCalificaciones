/*Clase main para el ejercicio del libro, pag 74 Fig. 3.2*/
// Crea un objeto libroCalificaciones y llama a su metodo

import java.util.Scanner; //usa la clase Scanner

public class PruebaLibroCalificaciones {
	//Aqui inicia la ejecucion del programa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//crea el objeto LibroCalificaciones
	//pasa el nombre del curso al constructor
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("Curso basico de Java");
		
		miLibroCalificaciones.obtenerNombreDelCurso();
		miLibroCalificaciones.determinarPromedioClase();
		
	}// fin de la clase main

}// fin de la clase PruebaLibroCalificaciones
