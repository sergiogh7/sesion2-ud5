import javax.swing.JOptionPane;

/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S2Ud5Ej10App {

	public static void main(String[] args) {
		
		// Variables.
		double totalVentas = 0;
		
		// Pide el numero de ventanas.
		String numeroVentas = JOptionPane.showInputDialog("Escriba el numero de ventas "
															+ "a realizar.");
		// Parseando a integer.
		int ventas = Integer.parseInt(numeroVentas);
		
		// Mientras sigan quedando ventas...
		while(ventas != 0) {
			
			// Pide la venta.
			String inputPrecioVenta = JOptionPane.showInputDialog("Escriba el precio de la venta "+ventas+" :");
			
			// Parsea a double.
			double precioVenta = Double.parseDouble(inputPrecioVenta);
			
			// Suma el total de todas las ventas.
			totalVentas += precioVenta;
			
			// Resta una venta.
			ventas--;
			
		}
		
		// Muestra un mensaje con el total.
		JOptionPane.showMessageDialog(null, "El total de las ventas es de " +totalVentas+ " €.");
		

	}

}
