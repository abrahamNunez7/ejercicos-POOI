/*
Una persona desea invertir su capítal en un banco y quiere saber cuánto dinero ganará después de 
n días, si el banco le pagará interesés del 2%
*/

//se imorta scanner
import java.util.Scanner;


//se declara la clase
public class GananciaInversion {

	//declaramos el método Main()
	public static void main(String[] args) {
		
		//realizamos el objeto entrada:
		Scanner entrada = new Scanner(System.in);			//este objeto sirve para poder leer por teclado

		//realizamos la declaración de atributos:
		int dias;
		double capital;
		double ganancia;
		double interes = 0.02;

		//mandamos a pantalla el siguiente mensaje:
		System.out.println("Esete programa permite al usuario calcular las ganacias de sus inversiones con un 0.02% de ganancias.");

		//le pedimos al usuario que cuanto dinero va a invertir:

		System.out.print("Ingresa el monto de tu capital: ");
		capital = entrada.nextDouble();		//se va a llamar al objeto utilzando el método nextDouble

		//se le pide al usuario que ingrese el número de días que va a invertirlo
		
		System.out.print("\nIngres el número de días que lo tendrás invertido: ");
		dias = entrada.nextInt();		

		//realizamos la operacion aritmetica:

		ganancia = (double) (capital*dias)*interes;

		//le decimos al usuario cuales van a ser sus ganancias:
		System.out.println("Usted va a ganar " + ganancia + " en " + dias + " días.");


	}
}