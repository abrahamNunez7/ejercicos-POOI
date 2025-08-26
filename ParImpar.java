//se importa scanner
import java.util.Scanner;

public class ParImpar{
	//realizamos el método principal
	public static void main(String[] args) {
		//realizamos el objetopara interactuar con el usuario
		//es importante ralizar el objeto dentro del método 
		Scanner lector = new Scanner(System.in);

		//le damos la bienvenida al usuario
		System.out.println("¡Bienvenido! Este programa determina si el número es el par o impar");

		//le pedimos al usuario que escriba un número
		System.out.print("Escribe un número: ");
		int numero = lector.nextInt();

		//realizamos la comparacion con módulo, para saber si es par o impar
		if (numero % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}
}