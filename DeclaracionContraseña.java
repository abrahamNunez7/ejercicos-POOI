//se importa Scanner
import java.util.Scanner;

public class DeclaracionContraseña {
	//agregamos el método principal
	public static void main(String[] args) {
		//declaramos la contraseña que el usuario tiene que adivinar
		String clave = "java123";

		//creamos el objeto lector
		Scanner lector = new Scanner(System.in);

		//le pedimos al usuario que escriba la contraseña
		System.out.print("Escriba su contraseña: ");
		String contraseña = lector.nextLine();

		//hacemos la comparacion
		if (contraseña.equals(clave)) {
			System.out.println("Acceso concedido.");
		} else {
			System.out.println("Acceso denegado.");
		}
	}
}