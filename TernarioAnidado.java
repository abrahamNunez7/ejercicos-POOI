//importamos scanner
import java.util.Scanner;

public class TernarioAnidado {
	//iniciamos el método principal
	public static void main(String[] args) {
		//creamos el objeto sc
		Scanner sc = new Scanner(System.in);

		//bienvenida a usuario;
		System.out.println("¡Bienvenido! Este código devuelve el número mayor de los cuatro dados por el usuario.");

		//le pedimos al usuario cada uno de los dato
		System.out.print("Número 1: ");
		int num1 = sc.nextInt();
		System.out.print("Número 2: ");
		int num2 = sc.nextInt();
		System.out.print("Número 3: ");
		int num3 = sc.nextInt();
		System.out.print("Número 4: ");
		int num4 = sc.nextInt();

		//usamos operadores ternarios anidados para hacer la comparación:
		int mayor = (num1 > num2) ? (num1 > num3) ? ((num1 > num4) ? num1 : num4) : ((num3 > num4) ? num3 : num4) : ((num2 > num3) ? ((num2 > num4) ? num2 : num4) : ((num3 > num4) ? num3 : num4));

		//imprimimos en consola
		System.out.println("El número mayor es: " + mayor);

		sc.close();
	}
}