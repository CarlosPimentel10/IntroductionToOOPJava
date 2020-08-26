package uniandes.cupi2.avion.mundo;

public class Pelicula {
	
	public final static String COMEDIA ="Comedia";
	public final static String ACCION="Accion";
	public final static String DRAMA="Drama";
	public final static String INFANTIL="Infantil";
	public final static String ROMANCE="Romance";
	private String nombre;
	private String genero;
	private int duracion;
	private String director;
	
	//metodo constructor
	public Pelicula(String pNombre,String pGenero,int pDuracion,String pDirector) {
		//inicializamos las variables
		nombre=pNombre;
		genero=pGenero;
		duracion=pDuracion;
		director=pDirector;	
	}
	
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
	
	public void cambiarNombre(String pNombre) {
		nombre=pNombre;
	}
	
	public void cambiarGenero(String pGenero) {
		genero=pGenero;
	}
	
	public void cambiarDuracion(int pDuracion) {
		duracion=pDuracion;
	}
	
	public void cambiarDirector(String pDirector) {
		director=pDirector;
	}
	
	public String toString() {
		return nombre + "( "+genero+" )"+ duracion+"minutos - "+director;
	}
}
