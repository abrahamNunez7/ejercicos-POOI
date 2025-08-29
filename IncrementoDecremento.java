public class IncrementoDecremento {
	//creamos el método principal
	public static void main(String[] args) {
		//declaramos la variable
		int x = 5;

		//realizamos lo siguiente y lo explicamos en los comentarios

		//sumamos primero y luego mostramos nos mostrara el valor 6
		System.out.println(++x);
		//mostramos y luego sumamos, esto nos dara otra vez 6, pero ya valdra 7
		System.out.println(x++);
		//restamos primero y luego mostramos nos volvera a mostrar 6
		System.out.println(--x);
		//mostrtamos primero y luego restamos, nos mostrara 6 pero la variable ya valdra 5
		System.out.println(x--);
	}
}