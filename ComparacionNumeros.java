//importamos Scanner
import java.util.Scanner;

public class ComparacionNumeros{
	//realizamos el método principal
	public static void main(String[] args) {
		//creamos el objeto que nos ayudara leer los datos que el usario nos de
		Scanner lector = new Scanner(System.in);

		//le damos al usuario las instrucciones
		System.out.println("¡Bienvenido! Este programa compara dos números enteros dados por el usuario");

		//le pedimos al usario que nos de los dos valores a comparar: 
		System.out.print("Escriba el primer numero a comparar: ");
		int numero1 = lector.nextInt();

		System.out.print("Escribe el segundo número a comparar: ");
		int numero2 = lector.nextInt();

		//se comparan los números
		if (numero1 == numero2) {
			System.out.println("Ambos números son iguales.");
		} else if (numero1 > numero2) {
			System.out.println("El primer número es mayor que el segudno número.");
		} else {
			System.out.println("El segundo número es mayor que el primer número.");
		}
	}
}