public class VariablesDemo {
	public static void main(String[] args) {

		//tipos de variables en java, estas son las más usadas, sin embargo existen otras
		int edad = 29;
		double altura = 1.75;
		
		char inicial = 'A';
		boolean estudiante = true;
		String nombre = "Abraham";

		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Altura: " + altura);
		System.out.println("Inicial: " + inicial);
		System.out.println("¿Es estudiante?: " + (estudiante ? "Si" : "No"));
	}
}