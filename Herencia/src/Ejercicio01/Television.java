package Ejercicio01;

public class Television extends Electrodomestico{

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	
	//Atributos
	
	private double resolucion;
	private boolean sintonizadorTDT;
	
	
	private final int RESOLUCION_DEFECTO=20;
	private final boolean SINTONIZADORTDT_DEFECTO= false;
	
	
	// Constructor por defecto
	public Television() {
		super();
		this.resolucion=RESOLUCION_DEFECTO;
		this.sintonizadorTDT=SINTONIZADORTDT_DEFECTO;
		
	}
	
   //Constructor con precio y peso
	
	public Television(double precioBase, double peso) {
		super();
		this.resolucion=RESOLUCION_DEFECTO;
		this.sintonizadorTDT=SINTONIZADORTDT_DEFECTO;
	}
	
	// Constructor con todos los atributos
	
	public Television (double precioBase, double peso,
	String color, char consumoEnergetico, double carga, 
	int resolucion, boolean sintonizadorTDT) {
		
		super();
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
		
	}
	
  // getter y setter
	
	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}
	
	
	public boolean getSintonizadorTDT() {
		return this.sintonizadorTDT;
		
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	// Metodo precio final
	
	public double precioFinal() {
		double precioFinal=super.precioFinal();
		if(this.resolucion > 40) {
			precioFinal*=1.30;
		}
		
		if (this.sintonizadorTDT) {
			precioFinal+=50;
		}
		
		return precioFinal;
		
	}
	
}
