//importamos la clase scanner
import java.util.Scanner;

public class TablaDeMultiplicar {
	//iniciamos el método principal
	public static void main(String[] args) {
		//creamos el objeto sc
		Scanner sc = new Scanner(System.in);

		//información:
		System.out.println("Este programa regresa la tabla de multiplicar del número que usted proporcione.");

		//le pedimos al usuario el número:
		System.out.print("De qué numeo desea la tabla de multiplicar: ");
		int num = sc.nextInt();

		System.out.println("La tabla de " + num + " es: ");
		//realizamos la table con ciclo for
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + num + " = " + (i * num));
		}
		sc.close();
	}
}