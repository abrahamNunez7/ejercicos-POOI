//importamos scanner:
import java.util.Scanner;

public class MayorConBucles {
	//realizmamos el método principal
	public static void main(String[] args) {
		//creamos el objeto sc
		Scanner sc = new Scanner(System.in);

		//mensaje de bienvenida: 
		System.out.println("¡Bienvenido!, este programa regresa el número mayor de los 4 que ingreses: ");

		//iniciamos variable 'mayor' con un valor muy pequeño
		int mayor = Integer.MIN_VALUE;

		//usamos bucles para resolverlo: 
		for (int i = 1 ; i <= 4 ; i++ ) {
			System.out.print("Número " + i + ": ");
			int num = sc.nextInt();

			//realizamos una comparacion directa
			mayor = (num > mayor) ? num : mayor;
		}

		//escribimos en consola
		System.out.println("El número mayor de los 4 es: " + mayor);
		sc.close();
	}
}