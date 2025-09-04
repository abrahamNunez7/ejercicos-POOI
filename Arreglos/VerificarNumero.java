//importamos Scanner:
import java.util.Scanner;

public class VerificarNumero 
{
	//hacemos el método principal:
	public static void main(String[] args) 
	{
		//creamos objetosc
		Scanner sc = new Scanner(System.in);
		//creamos el arreglo:
		int[] arregloDeNumeros = {1,2,3,4,5,6,7,8,9,10,11};
		//advinia el numero
		System.out.print("Adivina uno de los números del arreglo: ");
		int numero = sc.nextInt();
		//creamos la variable de control:
		boolean esta = false;
		for (int numeros : arregloDeNumeros ) {
			if (numero == numeros) {
				esta = true;
			}
		}
		String respuesta = esta ? "El número está en el arreglo" : "El número no está en el arreglo.";
		System.out.println(respuesta);
	}
}