//vamos a pedirle al usuario que nos de el número de días que queira convertir a segundos

//para inicar vamos a importar Scanner:
import java.util.Scanner;

public class SegundosPorDia 
{

	//vamos a declarar el método principal:
	public static void main(String[] args) {
		//vamos a crear el objeto scanner:

		Scanner sc = new Scanner(System.in);

		//declaramos los atributos de la clase:

		double dias;
		double segundos;

		//vamos a escribir los días que el usuario quiera convertir:

		System.out.print("¿Cuántos días desea convertir? ");
		dias = sc.nextDouble();

		//vamos a hacer la conversión:

		segundos = dias * 24 * 60 * 60 ;

		//vamos a postrar en terminal los días:

		System.out.println(dias + " días equivalen a " + segundos + " segundos.");
	}

}