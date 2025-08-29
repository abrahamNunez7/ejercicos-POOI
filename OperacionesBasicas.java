public class OperacionesBasicas {
	//como buena prectica para las clases hay que usar Upper case (OperacionesBasicas) y para variables Camel case (operacionesBasicas)

	public static void main(String[] args) {
		//comenzamos declarando las variables que van a realizar las operaciones básicas
		int num1 = 10, num2 = 3;
		
		//ahora encerramos las operaciones dentro de nuevas variables
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		//para tener el valor correcoto, se necesita forzar al compilador a hacer divisió desimal, usando casting
		double division = (double) num1 / num2;
		
		//se muestrasn en pantalla los resultados
		System.out.println("Los dos números que se van a operar son: " + num1 +" y " + num2);
		System.out.println("Suma: " + suma);
		System.out.println("Resta : " + resta);
		System.out.println("Multiplicación: " + multiplicacion);
		System.out.println("División: " + division);
	}
}