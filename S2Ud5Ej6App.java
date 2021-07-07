import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S2Ud5Ej6App {

	public static void main(String[] args) {
		
		// Declara Scanner.
		Scanner teclado = new Scanner(System.in);
		
		// Constante con el IVA.
		final double IVA = 0.21;
		
		// Pide un nuemro entero.
		String inputPrecio = JOptionPane.showInputDialog("Escriba el precio del producto: ");
		
		// Parsea el numero a soble.
		double precio = Double.parseDouble(inputPrecio);
		
		// Calcula el precio del producto con IVA:
		double precioFinal = precio + (precio*IVA);
		
		// Muestra un mensaje.
		JOptionPane.showMessageDialog(null, "El precio del producto con un 21% de "
				+ "IVA es de: " +precioFinal+ "€.");
		

	}

}
