public class IntercambioConSuma{
	//declaramos el método principal
	public static void main(String[] args) {
		//declaramos las variables
		int a = 5, b= 10;
		//mostramos los valores en consola antes
		System.out.println("Valores antes: x = " + a + ", y = " + b);

		//hacemos el intercambio 
		a = a + b;
		b = a - b; 
		a = a - b;

		//mostramos valores después del intercambio
		System.out.println("Valores después: x = " + a + ", y = " + b);
	}
}