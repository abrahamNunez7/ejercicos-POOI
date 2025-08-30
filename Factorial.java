//importamos clase scanner
import java.util.Scanner;

public class Factorial {
	//realizamos el main: 
	public static void main(String[] args) {
		//creamos el objeto sc:
		Scanner sc = new Scanner(System.in);

		//informacion
		System.out.println("Este programa regresa el factorial de un número: ");

		//de que número quieren el factorial 
		System.out.print("De qué número se requiere el factorial: ");
		int fact = sc.nextInt();

		//iniciamos variable
		int multi = 1;

		//condicionales para el factorial:
		if (fact == 0) {
			System.out.println("El factorial es: " + multi);
		} else if (fact < 0) {
			System.out.println("El factorial de un número no existe");
		} else {
			//realizamos un while
			while (fact > 0) {
				multi *= fact;
				fact--;
			}
			System.out.println("El factorial es: " + multi);
		}
		sc.close();
	}
}