package uniandes.cupi2.lineasTelefonicas.mundo;

public class LineaVozIP extends LineaTelefonica{
	
	private int numeroMinutosLargaDistancia;
	private int numeroMinutosCelular;
	private double saldoDisponible;
	
	public LineaVozIP() {
		// TODO Auto-generated constructor stub
		super();
		numeroMinutosLargaDistancia = 0;
		numeroMinutosCelular = 0;
		saldoDisponible = 100000;
	}
	
	public void reiniciar( )
    {
        super.reiniciar();
        numeroMinutosLargaDistancia = 0;
        numeroMinutosCelular = 0;
        saldoDisponible = 100000;
    }
    
	public int darNumeroMinutosLargaDistancia() {
		return numeroMinutosLargaDistancia;
	}
	public int darNumeroMinutosCelular() {
		return numeroMinutosCelular;
	}
	public double darSaldoDisponible() {
		return saldoDisponible;
	}
	/*
	public double calcularCostoLlamadasLocal() {
		
		return agregarLlamadaLocal(numeroMinutos);
	}
	*/
	public void agregarLlamadaCelular(int minutos) {
		super.agregarLlamadaCelular(minutos);
		modificarCostoLlamada(darCostoLlamadas() - minutos*992);
		numeroMinutosCelular += minutos;
		saldoDisponible = saldoDisponible - (minutos*7);
	}
	public void agregarLlamadaLargaDistancia(int minutos) {
		super.agregarLlamadaLargaDistancia(minutos);		
		modificarCostoLlamada(darCostoLlamadas()- minutos*300);
		numeroMinutosLargaDistancia += minutos;
		saldoDisponible = saldoDisponible - (minutos*80);
	}
	
}
