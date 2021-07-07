import javax.swing.JOptionPane;

/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S2Ud5Ej4App {
	
	public static void main(String[] args) {
		
		// Constante PI.
		final double numPi = Math.PI;
		
		// Pide el radio y se guarda en un string.
		String pideRadio = JOptionPane.showInputDialog("Escriba el radio:");
		
		// Lo pasa de String a Double.
		double radio = Double.parseDouble(pideRadio);
		
		// Saca el resultado. -->Math.pow eleva el radio a 2.
		double resultado = numPi * Math.pow(radio, 2);
		
		// Printa resultado.
		JOptionPane.showMessageDialog(null, "El area del circulo es: " + resultado);
		
	}
	
}