public class IntercambiarValores{
	//creamos el método principal
	public static void main(String[] args) {
		//se declaran variables
		int a = 5, b = 10;

		//se muestran en consola los valores de las variables
		System.out.println("Antes: a = " + a + ", b = " + b);

		//realizamos el intercambio de las variables con variables auxiliares
		int c = b, d = a;
		b = d;
		a = c;
		//mostramos los nuevos valores de las variables
		System.out.println("Después: a = " + a + ", b = " + b);
	}
}