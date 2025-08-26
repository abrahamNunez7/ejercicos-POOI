public class InformacionBooleana{
	public static void main(String[] args) {
		//se crean las variables de tipo booleano
		boolean esEstudiante = true;
		boolean leGustaProgramacion = true;

		//mostramos en consola
		System.out.println("¿Eres estudiante?: " + (esEstudiante ? "Sí" : "No"));
		System.out.println("¿Te gusta programar?: " + (leGustaProgramacion ? "Sí" : "No"));
		
		//Ahora dependiendo de los valores booleanos, vamos a escribir un mensaje de salida

		if (esEstudiante && leGustaProgramacion) {
			System.out.println("¡Genial, sigue aprendiendo y programando!");
		} else if (esEstudiante) {
			System.out.println("¡Genial, sigue aprendiendo!");
		} else if (leGustaProgramacion) {
			System.out.println("¡Genial, sigue programando!");
		} else {
			System.out.println("Siempre es buen momento para aprender algo nuevo.");
		}
	}
}