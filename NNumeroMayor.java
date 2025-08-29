//importamos scanner:
import java.util.Scanner;

public class NNumeroMayor {
	//realizamos el poderoso método principal:
	public static void main(String[] args) {
		//ccreamos el onjeto con la clase Scanner
		Scanner sc = new Scanner(System.in);

		//bienvenido al usuario:
		System.out.println("Al usuario se le pedirán 'n' números, y se determinara cual de todos es mayor.");

		//con cuantos números se va a trabajar:
		System.out.print("Con cuántos números se va a trabajar: ");
		int n = sc.nextInt();

		//iniciamos la variable mayor
		int mayor = Integer.MIN_VALUE;

		//empezamos el bucle for y hacemos las comparaciones directas:
		for (int i = 1 ; i <= n ; i++ ) {
			System.out.print("Número " + i + ": ");
			int num = sc.nextInt();

			mayor = (num > mayor) ? num : mayor;
		}

		System.out.println("El número mayor es: " + mayor);
		sc.close();
	}
}