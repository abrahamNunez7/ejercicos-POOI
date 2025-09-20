public class Persona {
	//declaramos atributos:
	private String nombre;
	private int edad;
	//se crea el constructor con parámetros para inicializar atributos al momento de crear el objeto
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	//se crea el mpetodo saludar
	public void Saludar(){
		System.out.println("Hola mi nombre es " + nombre + " y tengo " + edad + " años de edad.");
	}
	//se crea método que suma dos edades
	public int SumaEdades(int edad1, int edad2)
	{
		return edad1 + edad2;
	}
	//creamos el método set:
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	//creamos el método get:
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
}