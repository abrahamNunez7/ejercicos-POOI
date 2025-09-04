//importamos scanner
import java.util.Scanner;

public class CopiarArreglo {
	//realizamos el método principal
	public static void main(String[] args) {
		//creamos el objeto sc
		Scanner sc = new Scanner(System.in);
		
		//le damos la bienvenida al usuario: 
		System.out.println("Bienvenido! Este programa copia un arreglo dado.");

		//cuantos elementos tiene el arreglo
		System.out.print("Cuántos elementos tiene el arreglo: ");
		int numeroDeElementos = sc.nextInt();

		//creamos el primer arreglo:
		int[] arreglo1 = new int[numeroDeElementos];

		//le pedimos al usuario que nos de los elementos del arreglo
		int numero;
		for (int i = 0; i < numeroDeElementos ; i++ ) {
			System.out.print("Escriba el núemero " + (i + 1) + ": ");
			numero = sc.nextInt();
			arreglo1[i] = numero;
		}
		System.out.println("Recogida de elementos terminada, copiando elementos...");
		//copiamos a un nuevo arreglo:
		int[] arreglo2 = new int[numeroDeElementos];

		for (int j = 0; j < numeroDeElementos ; j++) {
			arreglo2[j] = arreglo1[j];
		}

		//imprimimos el nuevo arreglo
		for (var numeros : arreglo2) {
			System.out.println("Elemento: " + numeros);
		}

		System.out.println("Terminando programa.");

		sc.close();
	}
}