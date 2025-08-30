//importamos scanner
import java.util.Scanner;

public class MayorMenor {
	//iniciamos el método rincipal 
	public static void main(String[] args) {
		//creamos el objeto sc
		Scanner sc = new Scanner(System.in);

		//mensaje:
		System.out.println("Devuelve el número mayor y menor del arreglo.");

		//numero de elementos del arreglo:
		System.out.print("Cuánto elementos tendrá el arreglo: ");
		int numeroDeElementos = sc.nextInt();

		//creamos el arreglo:
		int[] arreglo = new int[numeroDeElementos];

		//inicializamos variables:
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int num;

		//llenamos arreglo
		for (int i = 0; i < numeroDeElementos ; i++ ) {
			System.out.print("Número_" + (i + 1) + ": ");
			num = sc.nextInt();
			arreglo[i] = num;
		}

		// mostramos el número mayor y el número menor:
		for (int numero : arreglo) {
			if (numero > mayor) {
				mayor = numero;
			} 
		}
		System.out.println("El número mayor del arreglo es: " + mayor);

		for (int numero1 : arreglo) {
			if (numero1 < menor) {
				menor = numero1;
			}
		}
		System.out.println("El número menor del arreglo es: " + menor);

		sc.close();
	}
}