//importamos scanner
import java.util.Scanner;

public class Promedio {
	//se inicia el método principal
	public static void main(String[] args) {
		//creamos el objeto sc
		Scanner sc = new Scanner(System.in);

		//indicaciones al usuario:
		System.out.println("Este programa promedia los datos ingresados por el usuario.");

		//cuantos datos va a ingresar el usuario
		System.out.print("¿Cuántos números vas a promediar?: ");
		int n = sc.nextInt();

		//inicamos suma
		int suma = 0;

		//vanos a iniciar un ciclo
		for (int i = 1; i <= n; i++) {
			//empezamos a capturar números
			System.out.print("Numero_" + i + ": ");
			int num = sc.nextInt();

			//hacemos la suma directa
			suma += num;
		}

		//vamos a realizar la suma, sin embargo se tiene que hacer un casting para realizar el promedio adecuadamente
		double prom = (double) suma / n;

		//escribimos:
		System.out.println("El promedio de la suma de " + n + " 'n' elementos es: " + prom);

		//liberamos recursos:
		sc.close();
	}
}