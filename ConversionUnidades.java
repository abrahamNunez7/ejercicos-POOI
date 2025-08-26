public class ConversionUnidades{
	//se crea el método principal de la clase
	public static void main(String[] args) {
		//creamos las variables en grados Celsius
		double celsius = 25;

		//hacemos la variable para realizar la conversión de grados Celsius a Fahrenheit
		//muy importante: si se hace solo 9/5 el resultado es un entero, es decir 1, se tiene que poner 9.0/5.0 para que nos de el resultado esperado
		double fahrenheit = (celsius * (9.0/5.0)) + 32;

		//imprimimos el resultado en consola
		System.out.println("Celsius: " + celsius);
		System.out.println("Fahrenheit: " + fahrenheit);
	}
}