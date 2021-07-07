/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S2Ud5Ej9App {

	public static void main(String[] args) {
		
		// Bucle recorre los numeros del 1 al 100.
		for (int i = 1; i <= 100; i++) {
			
			// Printara los divisibles entre 2 y 3.
			if(i % 2 == 0) {
				System.out.println("Divisible entre 2: "+i);
				
			}else if(i % 3 == 0) {
				System.out.println("Divisible entre 3: "+i);
			}
			
		}

	}

}
