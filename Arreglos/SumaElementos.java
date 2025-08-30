//importamos scanner
import java.util.Scanner;

public class SumaElementos {
	//creamos el métod principal
	public static void main(String[] args) {
		//tenemos que realizar un arreglo de números enteros y calcular la suma de todos sus valores
		//creamos el objeto sc
		Scanner sc = new Scanner(System.in);

		//mensaje:
		System.out.println("Este programa crea un arreglo de n números dados por el usuario y los suma");

		//tamaño del arreglo:
		System.out.print("De que tamaño será el arreglo: ");
		int n = sc.nextInt();

		//creamos el arreglo 
		int[] arreglo = new int[n];

		//declaramos una variable para los números
		int num;

		//rellenamos el arreglo:
		for (int i = 0; i < n ; i++ ) {
			System.out.print("Numero_" + (i + 1) + ": ");
			num = sc.nextInt();
			arreglo[i] = num;
		}

		//escribimos el arreglo:
		for (int numero : arreglo) {
			System.out.print(numero +", ");
		}

		//sumamos
		//creamos una variable para almacenar la suma 
		int suma = 0;
		for (int j = 0 ; j < arreglo.length ; j++ ) {
			suma += arreglo[j];
		}
		System.out.println("\nLa suma del arreglo es: " + suma);

		sc.close();
	}
}