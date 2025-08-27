//importamos scanner
import java.util.Scanner;

public class MayorDeTres {
	//iniciamos el método principal
	public static void main(String[] args) {
		//creamos el objeto 'lector'
		Scanner lector = new Scanner(System.in);

		//pedimos al usuario el primer número
		System.out.print("Ingrese el primer número: ");
		int num1 = lector.nextInt();

		//pedimos al usuario el segundo número 
		System.out.print("Ingrese el segundo número: ");
		int num2 = lector.nextInt();

		//pedimos al usuario el tercer número
		System.out.print("Ingrese el tercer número: ");
		int num3 = lector.nextInt();

		//ahora que tenemos los tres número guardados habrá que compararlos
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("Uno de los número o los tres son igulaes, no se puede hacer la comparación.");
		} else if (num1 > num2 && num1 > num3) {
			System.out.println("El numero " + num1 + " es el mayor de los tres.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("El número " + num2 + " es el mayor de los tres.");
		} else {
			System.out.println("El número " + num3 + " es el mayor de los tres.");
		}
		lector.close();
	}
}