//importamos scanner:
import java.util.Scanner;

public class InvertirArreglo {
	//iniciamos el método:
	public static void main(String[] args) {
		//creamos el objeto sc:
		Scanner sc = new Scanner(System.in);
		//le damos la bienvenida al usuario y  le mostramos de que es el programa:
		System.out.println("¡Bienvenido! Este programa invierte el sentido de un arreglo");
		//le pedimos al usuario de cuantos números van a ser sus arreglos:
		System.out.print("Con cuántos números va a trabajar: ");
		int numeroDeElementos = sc.nextInt();
		//seccion para inicar variables:
		int numero;
		int[] arreglo1 = new int[numeroDeElementos];
		int[] arreglo2 = new int[numeroDeElementos];
		int m;
		//rellenamos el arreglo:
		for (int i = 0 ; i < numeroDeElementos ; i++ ) {
			System.out.print("Número " + (i + 1) + (": "));
			numero = sc.nextInt();
			arreglo1[i] = numero;
		}
		System.out.print("\nEl arreglo es:");
		//escribimos el arreglo y le damos la vuelta
		for (int j = 0 ; j < numeroDeElementos ; j ++ ) {
			System.out.print(arreglo1[j] + ", ");
			m = (numeroDeElementos - 1) - j;
			arreglo2[m] = arreglo1[j];
		}
		System.out.print("\n\nEl arreglo volteado es:");
		for (int numeros : arreglo2 ) {
			System.out.print(numeros + ", ");
		}
		sc.close();
	}
}