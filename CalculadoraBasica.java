//primero se importa la clase Scanner
import java.util.Scanner;


public class CalculadoraBasica{
	//iniciamos el método principal
	public static void main(String[] args) {
		//creamos un objeto de Scanner
		Scanner sc = new Scanner(System.in);

		//le decimos al usuario que hace el siguiente programa
		System.out.println("El siguiente programa le pide al usuario que ingrese dos número y a partir de ahi éste realiza varias operaciones.");
		
		//le peidmos al usuario que nos de dos números enteros
		System.out.print("Ingrese el primer número 1: ");
		int num1 = sc.nextInt();
		System.out.print("Ingrese el segundo número 2: ");
		int num2 = sc.nextInt();

		//se realiza las operaciones y se muestran en consola
		System.out.println("Suma: " + (num1 + num2));
		System.out.println("Resta: " + (num1 - num2));
		System.out.println("Multiplicación: " + (num1 * num2));
		System.out.println("División: " + ((double) num1 / num2));
		System.out.println("Módulo: " + (num1 % num2));
	}
}