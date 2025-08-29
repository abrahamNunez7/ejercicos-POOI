//importamos la clase Scanner
import java.util.Scanner;

public class AreaTriangulo{
	//creamos el método principal
	public static void main(String[] args) {
		//creamo el objeto para leer datos escritos por el usuario
		Scanner sc = new Scanner(System.in);

		//le damos la bienvenida al usuario
		System.out.println("¡Bienvenido! Se pide al usuario la base y la  altura de un triangulo para cálcular su area");

		//le pedimos al usuario la base y la altura
		System.out.print("Escriba la 'base' del triangulo: ");
		double base = sc.nextDouble();
		System.out.print("Escriba la 'altura' del triangulo: ");
		double altura = sc.nextDouble();

		//mostramos en consola el resultado
		System.out.println(" ");
		System.out.println("El área del triangulo es: " + ((base * altura) / 2));

		sc.close();
	}
}