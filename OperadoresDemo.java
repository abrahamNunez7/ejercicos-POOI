public class OperadoresDemo{
	public static void main(String[] args) {
		//declaramos las variables que usaremos para los operadores aritméticos
		int a = 10, b = 3;

		//Escribimos en consola:
		System.out.println("Suma: " + (a + b));
		System.out.println("Resta: " + (a - b));
		System.out.println("Multiplicación: " + (a * b));
		System.out.println("División: " + ((double) a / b));
		System.out.println("Módulo: " + (a % b));

		//Ahora pasamos con operadores comparativos: 
		System.out.println("¿a es mayor que b? " + (a > b ? "Sí" : "No"));
		System.out.println("¿a es igual a b? " + (a == b ? "Sí" : "No"));

		//ahora trabajamos con variables booleanas: 
		boolean x = true, y = false;
		System.out.println("x AND y: " + (x && y ? "Sí" : "No"));
		System.out.println("x OR y: " + (x || y ? "Sí" : "No"));
		System.out.println("NOT x: " + (!x));
	}
}