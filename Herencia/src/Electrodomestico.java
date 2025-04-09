
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
	
	private final String COLOR_DEFECTO = "blanco";
    private final char CONSUMO_DEFECTO = 'F';
	
// Constructor por defecto
	
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
	this.color=validateColor(color);
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
	
	
//Metodo para comprobar colores
	
		private String validateColor(String color) {
			String colorValidated=color.toLowerCase();
			if (colorValidated.equals("blanco") || colorValidated.equals("negro") 
					|| colorValidated.equals("rojo") || colorValidated.equals("azul") 
					|| colorValidated.equals("gris"))
			{
				return colorValidated;
			}
			
			else  {
//				System.out.println("El color no es correcto, le asignamos un blanco por defecto");
				return COLOR_DEFECTO;
			}
		}

//Metodo para Comprobar consumo Energetico
		
		private char validateConsumoEnergetico(char consumoEnergetico) {
//			String ConsumoEnergeticoValidated=consumoEnergetico.toUpperCase();

			if (consumoEnergetico=='F')
			{
				return consumoEnergetico;
			}
			else {
				return CONSUMO_DEFECTO;
			}
		}

}

