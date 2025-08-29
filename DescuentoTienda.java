//importamos Scanner
import java.util.Scanner;

public class DescuentoTienda{
	//creamos el método principal
	public static void main(String[] args) {
		//creamos el objeto para leer
		Scanner lector = new Scanner(System.in);

		//damos la bienvenida al usuario 
		System.out.println("Este programa indica si el usuario es estudiante o no, y en base a esto realiza descuento o no.");

		//se le pregunta al usuario si es estudiante o no?
		System.out.print("El usuario es estudiante ('Si/No'): ");
		String estado = lector.nextLine();
		estado = estado.trim();

		//ponemos el precio
		double precio = 1000;

		if (estado.equals("Si")) {
			precio = precio * 0.90;
			System.out.println("El precio a pagar es: $" + precio);
		} else {
			System.out.println("El precio a pagar es: $" + precio);
		}
	}
}