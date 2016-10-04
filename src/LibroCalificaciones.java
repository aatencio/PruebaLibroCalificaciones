/*Actividad del libro, ver pagina 73
Fig. 3.1 */
//La clase LibroCalificaciones contiene una variable de instancia nombreDelCurso,
//ahora tiene metodos para obtener y establecer su valor.


public class LibroCalificaciones 
{
	private String nombreDelCurso; //nombre del curso para este LibroCalificaciones
	
	//Metodos para establecer el nombre del curso
	public void establecerNombreDelCurso(String nombre)
	{
		nombreDelCurso = nombre; //almacenar nombre del curso
	}//fin del metodo establecerNombreDelCurso
	
	//Metodo para obtener el nombre del curso
	public String obtenerNombreDelCurso()
	{
		return nombreDelCurso;
	}//fin del metodo obtenerNombreDelCurso
	
	//Muestra un mensaje de bienvenida al usuario
	public void mostrarMensaje()
	{
		//esta instruccion llama a obtenerNombreDelCurso
		//que representa este LibroCalificaciones
		System.out.printf("Bienvenido al libro de calificaciones para \n%s!\n", 
							obtenerNombreDelCurso() );
	}// fin del metodo mostrar mensaje

}//fin de la clase LibroCalificaciones
