/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S2Ud5Ej1App {

	public static void main(String[] args) {
		
		// Declarando variables.
		int num1 = 3;
		int num2 = 27;
		
		// Llama a la funcion que mira si un numero es mayor que el otro o iguales.
		mensajes(num1, num2);
		
		// Cambiando valores.
		num1 = 10;
		num2 = 5;
		
		// Llama a la funcion...
		mensajes(num1, num2);
		
		// Cambiando valores.
		num1 = 1;
		num2 = 1;
		
		// Llama a la funcion...
		mensajes(num1, num2);

	}
	
	// Funcion que pasandole dos numeros dice si uno e smayor que el otro o son iguales.
	public static void mensajes(int num1, int num2) {
		// Si num1 es mayor que num2.
		if(num1 > num2) {
			System.out.println("num1("+num1+") es mayor que num2("+num2+").\n");
		
		// Si num2 es mayor que num1.
		}else if(num2 > num1) {
			System.out.println("num2("+num2+") es mayor que num1("+num1+").\n");
			
		// Si num1 es igual a num2.
		}else {
			System.out.println("num1("+num1+") es igual que num2("+num2+").\n");
		}
	}

}
