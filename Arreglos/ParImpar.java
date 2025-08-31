//importamos Scanner:
import java.util.Scanner;

public class ParImpar {
	//método principal:
	public static void main(String[] args) {
		//objeto sc:
		Scanner sc = new Scanner(System.in);
		//número de elementos que tiene el arreglo:
		System.out.print("Cuantos elementos va a tener el arreglo: ");
		int numeroDeElementos = sc.nextInt();
		//creamos el arreglo
		int[] arregloDeNumeros = new int[numeroDeElementos];
		//creamos variables auxiliares:
		int cuantosPares = 0;
		int cuantosImpares = 0;
		int numero;
		//llenar el arreglo:
		for (int i = 0; i < numeroDeElementos ; i++ ) {
			System.out.print("Elemento numero " + (i + 1) + ": ");
			numero = sc.nextInt();
			arregloDeNumeros[i] = numero;
		}
		//se cuentan
		System.out.print("Los elementos son: ");
		for (int numeros : arregloDeNumeros) {
			System.out.print(numeros + ", ");
			if (numeros % 2 == 0) {
				cuantosPares++;
			} else {
				cuantosImpares++;
			}
		}
		//escribimos cuantos:
		System.out.println("\nEl número de elementos pares en el arreglo es: " + cuantosPares);
		System.out.println("El número de elementos impares en el arreglo es: " + cuantosImpares);
	}
}