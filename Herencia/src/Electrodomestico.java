
public class Electrodomestico {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	// Atributos
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;

//Constructoe por defeecto
	
	public Electrodomestico(){
		this.precioBase=100;
		this.color="blanco";
		this.consumoEnergetico='F';
		this.peso=5;
	}
	
// Constructor con el precio y peso
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase=precioBase;
		this.peso=peso;
		this.color="blanco";
		this.consumoEnergetico='F';
	}
	
	
// Constructor con todos los atributos por para parametros
	
public Electrodomestico(double precioBase, double peso,
		String color, char consumoEnergetico ) {
	this.precioBase=precioBase;
	this.color=color;
	this.consumoEnergetico=consumoEnergetico;
	this.peso=peso;
	
}

//Getters y Setters

	public double getprecioBase() {
		return precioBase;
	}

	public void setprecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getcolor() {
		return color;
	}
	
	
	
	public void setcolor(String color) {
		this.color = color;
	}

	public char getconsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setconsumoenergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getpeso() {
		return peso;
	}

	public void setpeso(double peso) {
		this.peso = peso;
	}
	
}

