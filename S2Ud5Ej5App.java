import javax.swing.JOptionPane;

/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S2Ud5Ej5App {

	public static void main(String[] args) {
		
		// Pide un nuemro entero.
		String inputNumero = JOptionPane.showInputDialog("Escriba un numero entero: ");
		
		// Lo parsea a double.
		double numero = Double.parseDouble(inputNumero);
		
		// Condicionales que muestran mensaje si es divisible entre 2 o no.
		if(numero % 2 == 0) {
			System.out.println("El numero "+numero+" es divisible entre 2.");
			
		}else {
			System.out.println("El numero "+numero+" NO es divisible entre 2.");
			
		}

	}

}
