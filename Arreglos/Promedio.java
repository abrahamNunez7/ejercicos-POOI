//importamos scanner
import java.util.Scanner;

public class Promedio {
	//hacemos el método principal:
	public static void main(String[] args) {
		//creamos el objeto sc
		Scanner sc = new Scanner(System.in);

		//mensaje
		System.out.println("Nos realiza el promedio de las calificaciones dadas: ");

		//nombre del alumno
		System.out.print("Nombre del alumno: ");
		String nombreAlumno = sc.nextLine();

		//cuantas calificaciones:
		System.out.print("Cuantas calificaciones se van a promediar: ");
		int numeroDeMaterias = sc.nextInt();

		//creamos las variables auxiliares
		double califiacion;
		double suma = 0.0;
		double[] arreglo = new double[numeroDeMaterias];

		//creamos el arreglo para las materias: 
		for (int i = 0; i < numeroDeMaterias ; i++ ) {
			System.out.print("Escriba la calificación numero " + (i + 1) + ": ");
			califiacion = sc.nextDouble();
			arreglo[i] = califiacion;
		}

		//mostramos las calificaciones: 
		System.out.println("Las calificaiones de " + nombreAlumno + " son: ");
		for (double calis : arreglo) {
			System.out.println(calis);
			suma += calis;
		}

		//realizamos el promedio
		double promedio = suma / numeroDeMaterias;

		System.out.println("\nEl promedio del alumno " + nombreAlumno + " es de: " + promedio);
	}
}