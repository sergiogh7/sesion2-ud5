import javax.swing.JOptionPane;

/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S2Ud5Ej11App {

	public static void main(String[] args) {
		
		// Pregunta que dia es hoy.
		String dia = JOptionPane.showInputDialog("¿Que dia es hoy?");
		
		// Lo pasa a lower case.
		dia = dia.toLowerCase();
		
		// Switch que mira que dia es.
		switch (dia) {
		
		case "lunes":
			// Muestra un mensaje.
			JOptionPane.showMessageDialog(null, "Es " +dia+ " y es un dia laboral.");
			break;
			
		case "martes":
			// Muestra un mensaje.
			JOptionPane.showMessageDialog(null, "Es " +dia+ " y es un dia laboral.");
			break;
		
		case "miercoles":
			// Muestra un mensaje.
			JOptionPane.showMessageDialog(null, "Es " +dia+ " y es un dia laboral.");
			break;
			
		case "jueves":
			// Muestra un mensaje.
			JOptionPane.showMessageDialog(null, "Es " +dia+ " y es un dia laboral.");
			break;
			
		case "viernes":
			// Muestra un mensaje.
			JOptionPane.showMessageDialog(null, "Es " +dia+ " y es un dia laboral.");
			break;
			
		case "sabado":
			// Muestra un mensaje.
			JOptionPane.showMessageDialog(null, "Es " +dia+ " y NO es un dia laboral.");
			break;
			
		case "domingo":
			// Muestra un mensaje.
			JOptionPane.showMessageDialog(null, "Es " +dia+ " y NO es un dia laboral.");
			break;

		default:
			// Muestra un mensaje.
			JOptionPane.showMessageDialog(null, "Lo que ha escrito no es un dia de la semana.");
			break;
		}

	}

}
