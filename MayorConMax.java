//se importa scanner:
import java.util.Scanner;

public class MayorConMax {
	//creamos el método principal:
	public static void main(String[] args) {
		//creamos el objeto lector:
		Scanner lector = new Scanner(System.in);

		//bienvenida al usuario:
		System.out.println("¡Bienvenido! Este usuario te debuelve el número mayor de los 3 que de el usuario.");

		//le pedimos al usuairo el primer número
		System.out.print("Digite el primer número: ");
		int num1 = lector.nextInt();

		//le pedimos al usuario el segundo número:
		System.out.print("Digite el segundo número: ");
		int num2 = lector.nextInt();

		//le pedimos al usuario el tercer número: 
		System.out.print("Digite el tercer número: ");
		int num3 = lector.nextInt();

		//hacemos la comparación con Max
		int mayor = Math.max(num1, Math.max(num2, num3));

		//mostramos en consola
		System.out.println("\nEl número mayor de los tres es: " + mayor);

		//cerramos el lector
		lector.close();
	}
}