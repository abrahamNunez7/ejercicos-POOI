//importamos scanner:
import java.util.Scanner;

public class SumaTotal {
	//hacemos método main: 
	public static void main(String[] args) {
		//creamos objeto sc
		Scanner sc = new Scanner(System.in);

		//bienvenida:
		System.out.println("Se realiza la suma total de los números dados.");

		//cuantos números van a sumar
		System.out.print("¿Con cuántos números se va a trabajar?: ");
		int n = sc.nextInt();

		int suma = 0;
		//usamos bucle
		for (int i = 1 ; i <= n ; i++) {
			//pedimos números:
			System.out.print("Número " + i +": ");
			int num = sc.nextInt();

			//sumamos y asignamo el valor en suma
			suma += num;
		}

		//mostramos resultado
		System.out.println("La suma de los número es: " + suma);
		sc.close();
	}
}