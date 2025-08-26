public class AreaCirculo{
	public static void main(String[] args) {
	//para realizar el area primero hay que poner la variable, que es el radio

	double radio = 5;

	//ahora hacemos el cáluclo del área 
	double area = Math.PI * (Math.pow(radio,2));

	//escribimos el resultado en consola
	System.out.println("El área del círculo de radio '" + radio +"' es: " + area);
	}
}