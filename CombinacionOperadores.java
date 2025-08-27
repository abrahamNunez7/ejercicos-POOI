//importamos scanner
import java.util.Scanner;

public class CombinacionOperadores {
	//declaramos el método principal:
	public static void main(String[] args) {
		//se crea el objeto lector: 
		Scanner lector = new Scanner(System.in);

		//le damos la bienvenida al usuario:
		System.out.println("Este programa realiza la comparación de cuatro números y devuelve el mayor de ellos.");

		//le pedimos al usuario el primer número:
		System.out.print("Primer número: ");
		int num1 = lector.nextInt();

		//segundo numero:
		System.out.print("Segundo número: ");
		int num2 = lector.nextInt();

		//tercer número
		System.out.print("Tercer número: ");
		int num3 = lector.nextInt();

		//cuarto número:
		System.out.print("Cuarto número: ");
		int num4 = lector.nextInt();

		//se usa el método max:
		int mayor = Math.max(num1, num2);

		//usamos operador ternario para volver a comparar
		mayor = (mayor > num3) ? mayor : num3;

		//usamos el método max, para el último:
		mayor = Math.max(mayor, num4);

		//escribimos el número mayor en consola
		System.out.println("\nEl número mayor es: " + mayor);

		lector.close();
	}
}