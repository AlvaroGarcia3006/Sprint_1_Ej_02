package nivel1_ej2;

public class Main {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche("Almera");
		System.out.println(coche1.toString());
		
		coche1.acelerar();
		Coche.frenar();
	}

}
