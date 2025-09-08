/*
Este programa debera: mostrar elsiguiente menúde opciones:
Conversor de divisas:
1. Dólares a Pesos
2. Pesos a Dólares
Selecciona una opción:

Las funcionalidades del programa deberán de ser: 
+ Leer la opción seleccionada, 
+ Solicitar al usuario la cantidad a convertir (tipo double), y 
+ Realizar la conversión y mostrar el resultado en consola.

hay que definir un constante con el tipo de cambio actual (ejemplo 1 usd = 18.5 mxn), se debe de realizar la operación matemática
correspondiente segun la opcion elegida
usa if-else para controlar el menú.

Ejemplo de ejecución:

Conversor de divisas
1. Dólares a Pesos
2. Pesos a Dólares
Selecciona una opcion: 1
Ingresa la cantidad de dólares: 50
Resultado: 925.0 pesos mexicanos
*/



//se tienen que importar Scanner y InputMismatchException
import java.util.Scanner;
import java.util.InputMismatchException;


//declaramos la clase

public class ConversorDivisas
{

	//dentro de la clase declaramos el método principal

	public static void main(String[] args) 
	{
		
		//se empieza constuyendo el objeto sc

		Scanner sc = new Scanner(System.in);

		//declaramos las variables internas:
		
		double pesos;
		double dolares;
		String opcion;


		//vamos a usar final para que una vez declarada la conversión en el método no podamos cambiarla después
		
		final double dolarAPeso = 18.72;
		final double pesoADolar = 1 / dolarAPeso;

		//vamos a darle la bienvenida al usuario:

		System.out.println("\n¡Bienvenido! Este programa convierte pesos a dólares, y visebersa.");

		//mostramso el menú en consola: 

		System.out.println("\nConversor De Divisas.");
		System.out.println("1. Dolares a Pesos");
		System.out.println("2. Pesos a Dolares");


		//vamos a pedirle l usuario que nos dé su elección

		System.out.print("\nSelecciona una opción: ");
		opcion = sc.nextLine();

		//verificamos que el usuario eleigió una opión valida

		if (opcion.equals("1")||opcion.equals("2")) 
		{
			
			//si el usuario eligio una de las dos opciones se sigue con la lógica del programa
			//hay que hacer relizar la lógica para la opcion 1:
			if (opcion.equals("1")) 
			{
				
				//vamos a solicitarle al usuario que nos dé la cantidad de dolares que quiere convertir a pesos: 
				try
				{
					//cuantos dolares: 

					System.out.print("Ingrese la cantidad de dólares: ");
					dolares = sc.nextDouble();

					//hacemos la conversión:

					pesos = dolares * dolarAPeso;

					//le mostramos al usuario el resultado de la conversión:

					System.out.println("Resultado: " + pesos + " pesos mexicanos");


				}
				catch (InputMismatchException e) 				//para el caso en el que el usuario no ingrese algo adecuado en sc
				{
					System.out.println("No se puede realizar la conversión");
				}

			}
			else if (opcion.equals("2")) 
			{
				
				//le solicitamos al usuario la cantida de pesos que quiere convertir a dolares: 
				try
				{

					//cuantos pesos:
					System.out.print("Ingrese la cantidad de pesos: ");
					pesos = sc.nextDouble();

					//realizamos la conversión:

					dolares = pesos * pesoADolar;

					//mostramos en consola el resultado de la conversión:

					System.out.println("Resultado: " + dolares + " dólares.");


				}
				catch (InputMismatchException e) 				//para el caso en el que el usuario no ingrese algo adecuado en sc
				{
					System.out.println("No se puede realizar la conversión");
				}


			}

		} 
		else 							//si el usuario no eligio ni "1" ni "2"
		{
			System.out.println("Opción no valida.");
		}

		//terminamos el objeto sc.
		sc.close();

	}

}