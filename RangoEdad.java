//importamos Scanner
import java.util.Scanner;

public class RangoEdad {
	//creamos el método principal
	public static void main(String[] args) {
		//creamos el objeto para leer
		Scanner lector = new Scanner(System.in);

		//le damos la bienvenida al usuario
		System.out.println("¡Bienvenido! Este programa te determina tu rango de edad.");

		//le pedimos al usario su edad 
		System.out.print("Dime tu edad: ");
		int edad = lector.nextInt();

		//comparamos la edad para determinar en que categoria corresponde el usuario
		if (edad < 18) {
			System.out.println("Esres menor de edad.");
		} else if (edad >= 18 && edad < 65) {
			System.out.println("Eres un adulto.");
		} else {
			System.out.println("Eres un adulto mayor");
		}
	}
}