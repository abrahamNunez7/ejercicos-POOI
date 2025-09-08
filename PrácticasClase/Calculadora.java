/*
Este programa debe de incluir estos puntos:
Debe de incluir un menú de opciones al usaurio: 
Calculadora simple
1. Suma
2. Resta
3. Multiplicación
4. División
Selecciona una opcion: 

+ Leer la opción seleccionada,
+ Solicitar al usuario dos números (de tipo double),
+ Realizar la operación correspondiente, y
+ Mostrar el resultado en consola.

Las consideraciones pedidas son: 
+ Se debe de usar Scanner para la entrada de datos, 
+ Se debe de validar la división para evitar la división por cero, 
+ Utiizar if-else para controlar las opciones del menú: 
*/

//inicamos importando Scanner:
import java.util.Scanner;

//importamos la excepcion para scanner:
import java.util.InputMismatchException;

public class Calculadora
{


	//declaramos el método principal: 
	public static void main(String[] args) {
		
		//creamos el objeto que nos permitira leer de consola:
		Scanner sc = new Scanner(System.in);


		//declaramos las variables internas del objeto 
		double numero1;
		double numero2;
		double resultado;
		String opcion;

		//le damos la bienvenida al usuario

		System.out.println("¡Bienvenido! este programa de consola es una Calculadora Simple.");

		System.out.println("Calculadora Simple");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");

		//le pedimos al usuario que nos de una opción:

		System.out.print("\nPor favor, seleccione una opción: ");

		opcion = sc.nextLine();				//vamos a leer la linea, en string para evitar que el programa truene si ingres
											//una opcion que no sea entero

		//vamos a realizar una opcion principal, en la que veamos que el usuario haya escrtio adecuadamente la opción

		if (opcion.equals("1")||opcion.equals("2")||opcion.equals("3")||opcion.equals("4")) 
		{
			
			//se realiza la lógica de la calculadora:
			//se va a usar try-catch por si el usuario escribe un caracter en vez de un número
			try
			{

				//le vamos al usuario que nos de los dos números con los que se va a trabajar: 

				System.out.print("Por favor, introduzca el primer número: ");
				numero1 = sc.nextDouble();

				System.out.print("Por favor, introduzca el segundo número: ");
				numero2 = sc.nextDouble();


				//si el usuario quiere sumar:

				if (opcion.equals("1")) {
					resultado = numero1 + numero2;
					System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
				}
				//se realiza la lógica si el usuario elige resta
				else if (opcion.equals("2")) 
				{
					resultado = numero1 - numero2;
					System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resultado);
				}
				//realizamos la lógica para la multiplicación:
				else if (opcion.equals("3")) 
				{
					resultado = numero1 * numero2 ;
					System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + resultado);	
				}
				else if (opcion.equals("4")) 
				{
					
					//aquí vamos a realizar la lógica para la división:
					if (numero2 == 0) 
					{
						System.out.println("No se puede realizar la División con el denominador 0.");
						//tambien podemos usar catch con ArithmeticException
					}
					else
					{
						resultado = numero1 / numero2 ; 
						System.out.println("El resultado de dividir " + numero1 + " entre " + numero2 + " es: " + resultado);
					}

				}
			} 
			catch (InputMismatchException e) 
			{
				System.out.println("El usuario escribió un formato invalido. ");
			}

		} 
		else
		{

			//debido a que el usuario no ingresó una opción valida, tenemos que decirle que la opción que ingreso no es valida:
			System.out.println("La opción elegida es incorrecta");

		}

		//liberamos recursos:
		sc.close();

	}

}