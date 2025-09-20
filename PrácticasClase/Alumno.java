public class Alumno {
	public static void main(String[] args) {
		//creamos el objeto Persona:
		Persona persona1 = new Persona("Abraham", 29);
		//persona1.setNombre("Abraham");	//le damos valores a sus atributos
		//persona1.setEdad(29);			//se realizan los parámetros.
		persona1.Saludar();			//podemos acceder a sus métodos
		//creamos otra persona:
		Persona persona2 = new Persona("Yessi", 28);		//se crea el objeto con el constructor, ya con los parámetros
		//persona2.setNombre("Yessi") ;
		//persona2.setEdad(28);
		persona2.Saludar();
		//llamamos alnuevo método:
		int suma = persona1.SumaEdades(persona1.getEdad(),persona2.getEdad());
		System.out.println("Las edades sumadas de " + persona1.getNombre() + " y " + persona2.getNombre() + " es: " + suma); 
	}
}