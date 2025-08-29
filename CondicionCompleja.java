//importamos scanner
import java.util.Scanner;

public class CondicionCompleja {
	//creamos main 
	public static void main(String[] args) {
		//realizamos el obheto lecto r
		Scanner lector = new Scanner(System.in);

		//bienvenida al lector
		System.out.println("Este programa determina si al menos uno de los números que escribió el usuario es positivo.");

		//le pedimos al usuario tres numeros
		System.out.print("Escriba el primer número: ");
		int num1 = lector.nextInt();
		System.out.print("Escriba el segundo número: ");
		int num2 = lector.nextInt();
		System.out.print("Escriba el tercer número: ");
		int num3 = lector.nextInt();

		//se realiza la comparación
		if (num1 >= 0 || num2 >= 0 || num3 >= 0) {
			System.out.println("Al menos uno de los números escritos es positivo.");
		} else {
			System.out.println("Ninguno de los número es positivo.");
		}
	}
}