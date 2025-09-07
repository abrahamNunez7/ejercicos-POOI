//consrruimos un algoritmo tal que dado el radio de una esfera, pueda calcular el volumen 
//e imprima el área y su volumen

//importamos Scanner
import java.util.Scanner;

public class Esfera {

	//declaramos el método principal.
	public static void main(String[] args) {
		
		//vamos a hacer el  objeto lector;
		Scanner sc = new Scanner(System.in);

		//vamos a declarar los atributos de la clase
		double area;
		double volumen;
		double radio;

		//tenemos que crear la constane pi:
		final double PI = Math.PI;

		System.out.print("Escriba el valor del radio: ");
		radio = sc.nextDouble();

		//realizamos el área de la esfera y su volumén: 
		area = (4*PI)*(Math.pow(radio,2));
		//calculamos el volumen de la esfera:
		volumen = (4*PI)*(Math.pow(radio,3))/3 ;

		String areaFormat = String.format("%.3f", area);
		String volumenFormat  = String.format("%.3f", volumen);

		//mandar a pantalla
		System.out.println("El resultado del área de la esfera es: " + areaFormat);
		System.out.println("El resultado del volumen de la esfera es: " + volumenFormat);
	}

}