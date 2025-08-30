public class ImprimirNumerosEnArreglo {
	//iniciamos el método main:
	public static void main(String[] args) {
		//se crea un arreglo de 5 números enteros y se inicializa
		int[] numerosEnteros = {1, 2, 3, 4, 5};

		//mostramos los elementos usando for:
		for (int i = 0; i < numerosEnteros.length ; i++ ) {
			System.out.println("El número " + i + " en el arreglo, representa a: " + numerosEnteros[i]);
		}
	}
}