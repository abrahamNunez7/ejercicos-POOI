//importar scanner
import java.util.Scanner;

public class NNumeroMenor {
	//método principal
	public static void main(String[] args) {
		//creamos objeto de la clase scanner
		Scanner sc = new Scanner(System.in);

		//bienvenida:
		System.out.println("El ususario da 'n' números y el programa determina cúal es el menor.");

		//numero
		System.out.print("¿Con cuántos números se va a trabajar? ");
		int n = sc.nextInt();

		//iniciamos variables:
		int menor = Integer.MAX_VALUE;
		int i = 0;

		//iniciamos el bucle while
		while (i < n) {
			//le pedimos al usuario números
			System.out.print("Numero_" + (i+1) + ": ");
			int num = sc.nextInt();

			//hacemos comparación directa:
			if (num < menor) {
				menor = num;
			}

			//sumamos en cada interacción:
			i++;
		}

		//escribimos resultado:
		System.out.println("El número menos es: " + menor);

		//liberamos recursos:
		sc.close();
	}
}