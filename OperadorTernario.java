//importar Scanner:
import java.util.Scanner;

public class OperadorTernario {
	//creamos el método main 
	public static void main(String[] args) {
		
		//creamos el objeto lector
		Scanner lector = new Scanner(System.in);
		
		//le damos la bienvenida al usuario:
		System.out.println("¡Bienvenido! otra manera de decir cual es el mayor de 3 números.");
		
		//le pedimos al usuario el primer número:
		System.out.print("Primer número: ");
		int num1 = lector.nextInt();
		
		//lepedimos al usuario el segundo número:
		System.out.print("Segundo número: ");
		int num2 = lector.nextInt();
		
		//le pedimos al usuario el tercer número: 
		System.out.print("Tercer número: ");
		int num3 = lector.nextInt();
		
		//hacemos la comparación:
		int mayor = (num1 > num2) ? num1 : num2; //compara numero 1 y numero 2, si lo que esta en parentesis es verdaddero toma el primer valor, si no toma el segundo
		mayor = (mayor > num3) ? mayor : num3;  //se compara el mayor con el número 3

		//mostramos el resultado:
		System.out.println("El número mayor de los 3 es: " + mayor);

		lector.close();
	}
}