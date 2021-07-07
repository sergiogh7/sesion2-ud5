import javax.swing.JOptionPane;

/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S2Ud5Ej3App {
	
	public static void main(String[] args) {
		
		// String ocn el nombre.
		String nombre = JOptionPane.showInputDialog("Introduzca su nombre");
		
		// Muestra mensaje de bienvenida.
		JOptionPane.showMessageDialog(null, "Bienvenido " +nombre);
	}
	
}