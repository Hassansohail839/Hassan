
public class Electrodomestico {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//    
//		validateColor;
//	}

	//Atributos
	private double preciobase;
	private String color;
	private char consumoenergetico;
	private double peso;
	
	
	//Constructor por defecto
	public Electrodomestico() {
		this.color="blanco";
		this.consumoenergetico='F';
		this.preciobase=100;
		this.peso=5;
		
	}
	
	//Constructor con precio y peso
	public Electrodomestico(double preciobase, double peso) {
		this.color="blanco";
		this.consumoenergetico='F';
		this.preciobase=preciobase;
		this.peso=peso;
	
	}
	
	//Constructor con todos los atributos como parametros
	public Electrodomestico(double preciobase, double peso, 
			char consumoenergetico, String color) {
		this.color=validateColor(color);
		this.consumoenergetico=consumoenergetico;
		this.preciobase=preciobase;
		this.peso=peso;
	
	}

	//Metodo para elegir colores
	private String validateColor(String color) {
		String colorValidated=color.toLowerCase();
		if (colorValidated.equals("blanco") || colorValidated.equals("negro") 
				|| colorValidated.equals("rojo") || colorValidated.equals("azul") 
				|| colorValidated.equals("gris"))
		{
			return colorValidated;
		}
		
		else  {
			return null;
		}
	}
	//Getters y Setters
	
	public double getPreciobase() {
		return preciobase;
	}

	public void setPreciobase(double preciobase) {
		this.preciobase = preciobase;
	}

	public String getColor() {
		return color;
	}
	
	
	
	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoenergetico() {
		return consumoenergetico;
	}

	public void setConsumoenergetico(char consumoenergetico) {
		this.consumoenergetico = consumoenergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
