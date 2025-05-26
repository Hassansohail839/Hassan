package Ejercicio01;
public class Lavadora extends Electrodomestico{

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

//Atributos
	
	private double carga;
	
	private final double CARGA_DEFECTO= 5;
    
 //Constructor por defectp
    public Lavadora() {
    	super();
    	this.carga=CARGA_DEFECTO;
    	
    }
    
 //Constructor con p con precio y peso
    
    public Lavadora(double precioBase, double peso) {
    	super(precioBase, peso);
		this.carga=CARGA_DEFECTO;
		
    }
    
 //Constructor con todos los atributos
    
    public Lavadora( double precioBase, double peso,
	String color, char consumoEnergetico, double carga) {
    	
    	super(precioBase, peso,validateColor(color),consumoEnergetico);
    	this.carga=carga;
    }
    
 //Getter y setter de carga

	public double getcarga() {
		return carga;
	}

	public void setcarga(double carga) {
		this.carga = carga;
	}
    
 //Metodo Precio final	
	
	public double precioFinal() {
		double precioFinal=super.precioFinal();
		if (this.carga > 30) {
	        precioFinal += 50;
	    }
		return precioFinal;
	}
	
}
