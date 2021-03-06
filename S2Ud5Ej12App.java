import javax.swing.JOptionPane;

/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S2Ud5Ej12App {

	public static void main(String[] args) {
		
		// Variables.
		int numeroIntentos = 3;
		int contrasenya = 12354;
		boolean acierto = false;
		
		do{
			
			// Pide la contraseņa.
			String nuevaContrasenya = JOptionPane.showInputDialog("Introduzca la contraseņa");
			
			// Parsea la contraseņa.
			int cambioContrasenya = Integer.parseInt(nuevaContrasenya);
			
			// Resta un intento.
			numeroIntentos--;
			
			// Si las contraseņas son iguales:
			// muestra un mensaje,
			// acierto pasa a true y sale del bucle.
			if(cambioContrasenya == contrasenya) {
				JOptionPane.showMessageDialog(null, "Enhorabuena.");
				acierto = true;
			}
			
			// Si se gastan los 3 intentos:
			// muestra un mensaje,
			// acierto pasa a true y sale del bucle.
			if(numeroIntentos == 0) {
				JOptionPane.showMessageDialog(null, "Ha agotado el numero de intentos.");
				acierto = true;
			}
			
		}while(acierto == false);

	}

}
