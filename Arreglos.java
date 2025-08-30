/* con un arreglo se pueden almacenar distintos valores en una sola variable: 
int [] numero = {10,20,30,40,50};
tienen ciertas caracteriísticas: 
1.son homogeneos: todos los datos son del mismo tipo,
2.tienen un tamaño fijio: cuando los creas defines cuantos elementos tendra, no puedes cambiar el tamaño,
3.son indexados: cada elemento tiene una posición (indice). */

public class Arreglos {
	public static void main(String[] args) {
		//vamos a mostrar como se declaran arreglos y como se asignan:

		//se puedes declarar y asignar directamente los números:
		int[] numeros = {10, 20, 30, 40, 50};

		//pero también se pueden declarar y crear el espacio, para despues asignar los valores manualmente
		int[] numeros2 = new int[5];		//se declara un arreglo de 5 enteros
		//per ahora se tiene que hacer la declaración manual
		numeros2[0] = 10;
		numeros2[1] = 20;
		numeros2[2] = 30;
		numeros2[3] = 40;
		numeros2[4] = 50;

		//podemos usar el .length (atributo) para ver cuantos elementos tiene el arreglo:
		System.out.println("El arrglo tiene " + numeros.length + " elementos.");

		//los arreglos se pueden recorrer de dos maneras: con for y con for-each. Para for se hace de la siguiente manera:
		for (int i = 0 ; i < numeros.length ; i++ ) {
			System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
		}

		//pero existe una forma más simple y más compacta que es usando el for-each:
		for (int num : numeros2) {
			System.out.println("Numero: " + num);
		}
	}
}