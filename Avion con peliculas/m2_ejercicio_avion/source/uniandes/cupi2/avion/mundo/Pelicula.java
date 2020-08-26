package uniandes.cupi2.avion.mundo;

public class Pelicula {
	
	// Atributos 

	
	public final static String COMEDIA = "Comedia"; 
	public final static String ACCION = "Acción"; 
	public final static String DRAMA = "Drama"; 
	public final static String INFANTIL= "Infantil"; 
	public final static String ROMANCE = "Romance";
  
    
    private int duracion; 
    private String nombre;
    private String genero;
    private String director;
    
    
    //Contructores 
    
    public Pelicula( String pNombre, String pGenero,int pDuracion, String pDirector ) {
    	
    	 
    	nombre =  pNombre;
    	genero = pGenero; 
    	director  = pDirector; 
    	duracion = pDuracion;
    	
    }
    
    //Métodos 
    
    public String darNombre() {
    	
    	return nombre;     	    }
    
    public String darGenero() {
    	
    	return genero;     	
    }
    
    public int darDuracion() {
    	
    	return duracion;     	
    }
    public String darDirector() {
    	
    	return director;    	 }
    
    
    public void cambiarNombre(String pNombre) {
    	   	
    	nombre = pNombre;    	
    }
    
    
    public void cambiarDirector(String pDirector) {
	   	
    	director = pDirector;    	
    }
      
    public void cambiarGenero(String pGenero) {
	   	
    	genero = pGenero;    	
    }
    
    
    
    public void cambiarDuracion(int pDuracion) {
	   	
    	duracion = pDuracion;    	
    }
    
    
    public String toString() {
    	
    	String frase = nombre + genero + duracion + director; 
    	
    	return frase; 
    }
    
    
    
}



