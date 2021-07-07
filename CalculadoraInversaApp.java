import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class CalculadoraInversaApp {

	public static void main(String[] args) {
		
		// Declara el Scanner d eteclado.
		Scanner teclado = new Scanner(System.in);
		
		// Variables.
		int inputNum1;
		int inputNum2;
		String signo;
		int resultado;
		
		// Pide los dos numeros.
		System.out.println("Escriba un numero:");
		inputNum1 = teclado.nextInt();
		
		System.out.println("Escriba otro numero:");
		inputNum2 = teclado.nextInt();
		
		// Bucle que no deja de pedir una y otra vez signo 
		// si no se pone uno de estos +, -, *, /, ^, %.
		do {
		System.out.println("Elija la operacion a realizar:\n+ para sumar.\n- para restar."
				+ "\n* para multiplicar\n/ para dividir."
				+ "\n^ primer numero como base y segundo como exponente."
				+ "\n% modulo, resto de la division entre el primer y segundo numero.");
		signo = teclado.next();
		
		}while(!signo.equalsIgnoreCase("+") && !signo.equalsIgnoreCase("-")
				&& !signo.equalsIgnoreCase("*") && !signo.equalsIgnoreCase("/")
				&& !signo.equalsIgnoreCase("^") && !signo.equalsIgnoreCase("%"));
		
		resultado = inputNum1 + inputNum2;
		
		// Siwtch que realiza una operacion segun el signo seleccionado.
		switch (signo) {
		
		case "+":
			// Realiza el calculo.
			resultado = inputNum1 + inputNum2;
			// Muestra un mensaje con el resultado.
			JOptionPane.showMessageDialog(null, "La suma de " +inputNum1+ " y " +inputNum2+ " es de: " +resultado);
			break;
			
		case "-":
			
			resultado = inputNum1 - inputNum2;
			
			JOptionPane.showMessageDialog(null, "La resta de " +inputNum1+ " y " +inputNum2+ " es de: " +resultado);
			break;
		
		case "*":
			
			resultado = inputNum1 * inputNum2;
			
			JOptionPane.showMessageDialog(null, "La multiplicacion de " +inputNum1+ " y " +inputNum2+ " es de: " +resultado);
			break;
			
		case "/":
			
			resultado = inputNum1 / inputNum2;
			
			JOptionPane.showMessageDialog(null, "La division de " +inputNum1+ " y " +inputNum2+ " es de: " +resultado);
			break;
		
		case "^":
			
			double resultadoPow = Math.pow((double)inputNum1 , (double)inputNum2);
			
			JOptionPane.showMessageDialog(null, inputNum1+ " como base y " +inputNum2+ " como exponente: " +resultadoPow);
			break;
		
		case "%":
			
			resultado = inputNum1 % inputNum2;
			
			JOptionPane.showMessageDialog(null, "El resto de la division de " +inputNum1+ " y " +inputNum2+ " es de: " +resultado);
			break;

		default:
			break;
			
		}
		
		

	}

}
