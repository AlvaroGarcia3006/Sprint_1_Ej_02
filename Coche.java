package nivel1_ej2;

public class Coche {
	
	private static final String MARCA = "Nissan";
	private static String modelo;
	private final int POTENCIA = 98;
	
	public Coche(String modelo) {
		Coche.modelo = modelo;
	}
	
	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static String getMarca() {
		return MARCA;
	}

	public int getPOTENCIA() {
		return POTENCIA;
	}

	public static void frenar() {
		System.out.println("El coche está frenando.");
	}
	
	public void acelerar() {
		System.out.println("El coche está acelerando");
	}

	@Override
	public String toString() {
		return "Coche [MARCA=" + MARCA +" MODELO= "+ modelo + " POTENCIA=" + POTENCIA + "]";
	}
}
