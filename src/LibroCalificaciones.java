/*Actividad del libro, ver pagina 73
Fig. 3.1 */
//La clase LibroCalificaciones contiene una variable de instancia nombreDelCurso,
//ahora tiene metodos para obtener y establecer su valor.
//calcula promedio de la clase usando un ciclo controlado
import java.util.Scanner;



public class LibroCalificaciones 
{
	private String nombreDelCurso; //nombre del curso para este LibroCalificaciones
	
	//Contructor para el objeto LibroCalificaciones
	public LibroCalificaciones(String nombre)
	{
		nombreDelCurso = nombre;
	}//fin constructor LibroCalificaciones
	
	//Metodos para establecer el nombre del curso
	public void establecerNombreDelCurso(String nombre)
	{
		nombreDelCurso = nombre; //almacenar nombre del curso
	}//fin del metodo establecerNombreDelCurso
	
	// Metodo para obtener el nombre del curso
	public String obtenerNombreDelCurso()
	{
		return nombreDelCurso;
	}// fin del metodo obtenerNombreDelCurso
	
	// Muestra un mensaje de bienvenida al usuario
	public void mostrarMensaje()
	{
		// esta instruccion llama a obtenerNombreDelCurso
		// que representa este LibroCalificaciones
		System.out.printf("Bienvenido al libro de calificaciones para \n%s!\n", 
							obtenerNombreDelCurso() );
	}// fin del metodo mostrar mensaje
	
	
	//------------------------------------------------------------------------
	//Determina el promedio de la clase, con base en un numero arbitrario
	//de calificaciones introducidas por el usuario.
	public void determinarPromedioClase()
	{
		//crea el objeto Scanner para obtener la entrada 
		//en la ventana de comandos
		Scanner entrada = new Scanner(System.in);
		
		int total; //suma de las calificaciones ingresadas por usuario
		int contadorCalificaciones; //numero de la siguiente calificacion
		int calificacion; //valor de la calificacion de 0 100
		double promedio = 0; //guarda el promedio
		
		//inicializacion de variables
		total = 0;
		contadorCalificaciones = 1;
		
		System.out.print("Escriba la calificación ó (-1) para finalizar: "); //indicador
		calificacion = entrada.nextInt();
		
		//repeticion controlada por contador
		while(calificacion != -1)//itera hasta que se introdusca "-1"
		{
			total = total + calificacion;
			contadorCalificaciones = contadorCalificaciones + 1;
			
			System.out.print("Escriba la calificación ó (-1) para finalizar: "); //indicador
			calificacion = entrada.nextInt();
		}//fin del ciclo while
		
		if(total == 0)
		{
			System.out.print("No se ingresaron calificaciones");
		}
		else
		{
		promedio = (double) total / contadorCalificaciones; //calculo del promedio
		
		//muestra el total y el promedio de las calificaciones
		System.out.printf("\nEl total de las calificaciones es: %d\n", total);
		System.out.printf("\nEl promedio de las calificaciones es: %.2f\n", promedio);
		}
		
	}//fin del metodo determinarPromedioClase
	

}//fin de la clase LibroCalificaciones
