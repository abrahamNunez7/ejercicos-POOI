//realizamos las importaciones necesarias:
import java.util.Scanner;
import java.util.Arrays;

public class OrdenarArreglo {
	//realizamos el método principal:
	public static void main(String[] args) {
		//creamos el objeto sc.
		Scanner sc = new Scanner(System.in);

		//le preguntamos al usuario de cuantos números va a trabajar:
		System.out.print("Con cuantos elementos se va a trabaja: ");
		int numeroDeElementos = sc.nextInt();

		//creamos el arreglo:
		int[] arreglo = new int[numeroDeElementos];
		int numero;
		//le pedimos al usuario que llene el arreglo:
		for (int i = 0; i < numeroDeElementos ; i++ ) {
			System.out.print("Número " + (i + 1) + " del elemento: ");
			numero = sc.nextInt();
			arreglo[i] = numero;
		}
		for (int numeros : arreglo) {
			System.out.println("Numeros: " + numeros);
		}
		//usmaos Array.sort() para lograr arreglarlo
		System.out.println("Ordenando el arrgloe...");
		Arrays.sort(arreglo);
		//volvemos a imprimirlo:
		for (int ordenados : arreglo) {
			System.out.println("Numeros: " + ordenados);
		}
		System.out.println("Saliendo del programa.");
	}
}