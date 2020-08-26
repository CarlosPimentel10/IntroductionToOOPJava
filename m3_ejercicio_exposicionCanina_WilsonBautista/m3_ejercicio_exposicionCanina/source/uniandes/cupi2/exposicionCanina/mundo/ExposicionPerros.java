/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: ExposicionPerros.java,v 1.5 2006/08/04 15:12:57 da-romer Exp $ 
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_exposicionCanina 
 * Autor: Mario S�nchez - 26/08/2005 
 * Modificado por: Daniel Romero- 30/06/2006
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.exposicionCanina.mundo;

import java.util.*;

/**
 * Es la clase que se encarga de manejar, organizar, cargar y salvar los perros. <br>
 * <b>inv: </b> <br>
 * perros != null <br>
 * no hay dos perros con el mismo nombre
 */
public class ExposicionPerros
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es el vector que contiene todos los perros
     */
    private ArrayList perros;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo manejador de perros vac�o.
     */
    public ExposicionPerros( )
    {
        perros = new ArrayList( );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna una lista de perros. La lista que se retorna no es la misma que la almacenada en esta clase, pero si tiene el mismo orden.
     * @return Lista de perros
     */
    public ArrayList darPerros( )
    {
        ArrayList copiaLista = new ArrayList( perros );
        return copiaLista;
    }

    /**
     * TODO:
     * Organiza la lista de perros por raza usando el algoritmo de burbuja. <br>
     * <b>post: </b>La lista de perros est� ordenada por raza (orden ascendente).
     */
    public void ordenarPorRaza( )
    {
    	//TODO
    	ArrayList<Perro> listaPerros = perros;
    	Perro temp;
    	for (int n = perros.size(); n > 0; n--)
    	{
    		for (int m = 0; m < n - 1; m++)
    		{
    			if ( listaPerros.get(m).darRaza().compareTo(listaPerros.get(m+1).darRaza()) > 0)
    			{
    				temp = listaPerros.get(m);
    				perros.set(m, listaPerros.get(m + 1));
					perros.set(m + 1, temp);
    			}
    		}
    	}
    }

    /**
     * TODO:
     * Organiza la lista de perros por nombre usando el algoritmo de inserci�n<br>
     * <b>post: </b>La lista de perros est� ordenada por nombre (orden ascendente).
     */
    public void ordenarPorNombre( )
    {
    	//TODO
    	ArrayList<Perro> listaPerros = perros;
    	
    	for(int n = 1; n < perros.size(); n++)
    	{
    		for(int m = n; m > 0; m--)
    		{
    			Perro perro1 = listaPerros.get (m-1);
				Perro perro2 = listaPerros.get(m);
				if(perro1.darNombre().compareTo(perro2.darNombre())> 0) 
				{
					Perro temp = perro2;
					listaPerros.set(m, perro1);
					listaPerros.set(m-1, temp);
				}
    		}
    	}
    	
    }
    /**
     * TODO:
     * Organiza la lista de perros por puntos usando el algoritmo de burbuja<br>
     * <b>post: </b>La lista de perros est� ordenada por puntos (orden ascendente).
     */
    public void ordenarPorPuntos( )
    {
    	//TODO
    	ArrayList<Perro> listaPerros = perros;
    	Perro temp;
    	for (int n = perros.size(); n > 0; n--)
    	{
    		for (int m = 0; m < n - 1; m++)
    		{
    			if ( listaPerros.get(m).darPuntos() > listaPerros.get(m+1).darPuntos())
    			{
    				temp = listaPerros.get(m);
    				perros.set(m, listaPerros.get(m + 1));
					perros.set(m + 1, temp);
    			}
    		}
    	}
    }

    /**
     * TODO:
     * Organiza la lista de perros por edad usando el algoritmo de selecci�n. <br>
     * <b>post: </b>La lista de perros est� ordenada por edad (orden ascendente).
     */
    public void ordenarPorEdad( )
    {
    	//TODO
    	ArrayList<Perro> listaPerros = perros;
    	
    	for (int n = 0; n < perros.size() ; n++) {
    		Perro perroMenor = listaPerros.get(n);
        	int edadMenor = perroMenor.darEdad();
        	int pos = n;
			for (int m = n + 1 ; m < listaPerros.size(); m++) {
				if (listaPerros.get(m).darEdad() < edadMenor) {
					perroMenor = listaPerros.get(m);
					edadMenor = listaPerros.get(m).darEdad();
					pos = m;
				}
			}
			Perro temp = listaPerros.get(n);
			listaPerros.set(n,perroMenor);
			listaPerros.set(pos, temp);
		}
    }

    /**
     * Busca un perro seg�n su nombre y retorna la posici�n en la que se encuentra.
     * @param nombre es el nombre del perro buscado - nombre!=null
     * @return Retorna la posici�n donde se encuentra un perro con el nombre dado. Si no se encuentra ning�n perro con ese nombre retorna -1
     */
    public int buscarPerro( String nombre )
    {
        int posicion = -1;
        boolean termine = false;

        for( int i = 0; i < perros.size( ) && !termine; i++ )
        {
            Perro perroPosicion = ( Perro )perros.get( i );
            String nombrePerro = perroPosicion.darNombre( );

            // Los nombres son iguales
            if( nombrePerro.equalsIgnoreCase( nombre ) )
            {
                posicion = i;
                termine = true;
            }
        }

        return posicion;
    }

    /**
     * Busca un perro utilizando una b�squeda binaria. <br>
     * <b>pre: </b> La lista de perros se encuentra ordenada por nombre.
     * @param nombre es el nombre del perro que se va a buscar - nombre!=null
     * @return La posici�n del perro con el nombre dado. Si el perro no existe se retorna -1.
     */
    public int buscarBinarioPorNombre( String nombre )
    {
        int posicion = -1;
        int inicio = 0;
        int fin = perros.size( ) - 1;
        Perro aBuscar = new Perro( nombre, "", "", 1, 1 );
        while( inicio <= fin && posicion == -1 )
        {
            int medio = ( inicio + fin ) / 2;
            Perro mitad = ( Perro )perros.get( medio );
            if( mitad.compararPorNombre( aBuscar ) == 0 )
            {
                posicion = medio;
            }
            else if( mitad.compararPorNombre( aBuscar ) > 0 )
            {
                fin = medio - 1;
            }
            else
            {
                inicio = medio + 1;
            }
        }
        return posicion;
    }

    /**
     * Agrega un nuevo perro a la exposici�n. <br>
     * <b>post: </b> El perro fue agregado a la exposici�n si no existe otro perro con el mismo nombre.
     * @param nombreP es el nombre del perro - nombreP != null
     * @param razaP es la raza del perro - razaP != null
     * @param imagenP es la ruta a la imagen del perro - imagenP != null
     * @param puntosP son Los puntos del perro en la exposici�n - puntosP >= 0
     * @param edadP es la edad en meses del perro - edadP >= 0
     * @return True si el perro fue adicionado o false de lo contrario
     */
    public boolean agregarPerro( String nombreP, String razaP, String imagenP, int puntosP, int edadP )
    {
        int perroBuscado = buscarPerro( nombreP );
        boolean agregado = false;
        if( perroBuscado == -1 )
        {
            Perro nuevoPerro = new Perro( nombreP, razaP, imagenP, puntosP, edadP );
            perros.add( nuevoPerro );
            agregado = true;
        }

        verificarInvariante( );

        return agregado;
    }

    /**
     * Busca el perro que tenga el mayor puntaje en la exposici�n.
     * @return Retorna la posici�n donde se encuentra el perro con el mayor puntaje. Si no hay perros en la exposici�n se retorna -1
     */
    public int buscarPerroMayorPuntaje( )
    {
        int posicion = -1;

        if( perros.size( ) > 0 )
        {
            Perro pMayorPuntaje = ( Perro )perros.get( 0 );
            posicion = 0;
            for( int i = 1; i < perros.size( ); i++ )
            {
                Perro perroPosicion = ( Perro )perros.get( i );

                // Los nombres son iguales
                if( pMayorPuntaje.compararPorPuntos( perroPosicion ) == -1 )
                {
                    posicion = i;
                    pMayorPuntaje = perroPosicion;
                }
            }
        }

        return posicion;
    }

    /**
     * Busca el perro que tenga el menor puntaje en la exposici�n.
     * @return Retorna la posici�n donde se encuentra el perro con el menor puntaje. Si no hay perros en la exposici�n se retorna -1
     */
    public int buscarPerroMenorPuntaje( )
    {
        int posicion = -1;

        if( perros.size( ) > 0 )
        {
            Perro pMenorPuntaje = ( Perro )perros.get( 0 );
            posicion = 0;
            for( int i = 1; i < perros.size( ); i++ )
            {
                Perro perroPosicion = ( Perro )perros.get( i );

                // Los nombres son iguales
                if( pMenorPuntaje.compararPorPuntos( perroPosicion ) == 1 )
                {
                    posicion = i;
                    pMenorPuntaje = perroPosicion;
                }
            }
        }

        return posicion;
    }

    /**
     * Busca el perro que tenga la mayor edad.
     * @return Retorna la posici�n donde se encuentra el perro con la mayor edad. Si no hay perros en la exposici�n se retorna -1
     */
    public int buscarPerroMayorEdad( )
    {
        int posicion = -1;

        if( perros.size( ) > 0 )
        {
            Perro pMayorEdad = ( Perro )perros.get( 0 );
            posicion = 0;
            for( int i = 1; i < perros.size( ); i++ )
            {
                Perro perroPosicion = ( Perro )perros.get( i );

                // Los nombres son iguales
                if( pMayorEdad.compararPorEdad( perroPosicion ) == -1 )
                {
                    posicion = i;
                    pMayorEdad = perroPosicion;
                }
            }
        }

        return posicion;
    }

    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------

    /**
     * Verifica el invariante de la clase. <br>
     * <b>inv </b> perros != null y no hay dos perros con el mismo nombre
     */
    private void verificarInvariante( )
    {
        assert ( perros != null ) : "La lista de perros no debe ser null";
        assert ( !buscarPerrosConNombresRepetidos( ) ) : "Hay dos perros con el mismo nombre";
    }

    /**
     * Verifica si hay dos perros con el mismo nombre.
     * @return Retorna true si hay dos perros con el mismo nombre, retorna false en caso contrario
     */
    private boolean buscarPerrosConNombresRepetidos( )
    {
        for( int i = 0; i < perros.size( ); i++ )
        {
            Perro perroI = ( Perro )perros.get( i );
            for( int j = 0; j < perros.size( ); j++ )
            {
                if( i != j )
                {
                    Perro perroJ = ( Perro )perros.get( j );
                    if( perroJ.darNombre( ).equals( perroI.darNombre( ) ) )
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * Ejecuta el punto de extensi�n 1.
     * @return respuesta 1
     */
    public void metodo1( )
    {
       ordenarPorNombre();
    }

    /**
     * Ejecuta el punto de extensi�n 2.
     * @return respuesta 2
     */
    public void metodo2( )
    {
    	  //TODO
    }
}