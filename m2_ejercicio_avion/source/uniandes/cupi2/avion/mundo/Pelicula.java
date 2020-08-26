package uniandes.cupi2.avion.mundo;
/*
 * Peliculas asistidas por los pasajeros
 */

import sun.net.www.content.text.plain;

public class Pelicula {
	// constantes Generos de peliculas
	public static final String COMEDIA = "Comedia";
	public static final String ACCION = "Accion";
	public static final String DRAMA = "Drama";
	public static final String INFANTIL = "Infantil";
	public static final String ROMANCE = "Romance";
	// atributos
	private String nombre;
	private String genero;
	private int duracion;
	private String director;
	
	// contructor para la pelicula
	public Pelicula(String pNombre, String pGenero, int pDuracion, String pDirector) {
		nombre = pNombre;
		genero = pGenero;
		duracion = pDuracion;
		director = pDirector;		
	}
	// getters
	public String darNombre() {
		return nombre;		
	}
	public String darGenero() {
		return genero;
	}
	public int darDuracion() {
		return duracion;
	}
	public String darDirector() {
		return director;
	}
	
	/*
	 * Cambiar los atributos de la clase
	 */
	public void cambiarNombre(String pNombre) {
		
	}
	public void cambiarGenero(String pGener) {
		
	}
	public void cambiarDuracion(int pDuracion) {
		
	}
	public void cambiarDirector(String pDirector) {
		
	}
	 /**
	  * Retorna una cadena de texto con la información de la película 
	  * siguiendo el siguiente formato:
	  * <nombre> (<genero>). <duracion> minutos - director.
	  * @return La cadena de texto con el formato definido. 
	  */
	public String toString() {
		return nombre + " " + genero + " " + duracion + " " + director;
	}
}
