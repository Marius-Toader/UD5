import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer operando:"));
		int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo operando:"));
		String c = JOptionPane.showInputDialog("Introduce el signo:");
		int resultado = 0;
		double resultadoD = 0;
		
		switch (c) {
			case "+": resultado = operando1 + operando2;
				break;
			case "-": resultado = operando1 - operando2;
				break;
			case "*": resultado = operando1 * operando2;
				break;
			case "/": resultadoD = operando1 / operando2;
				break;
			case "^": resultado = (int)Math.pow(operando1, operando2);
				break;
			case "%": resultado = operando1 % operando2;
				break;
			default: JOptionPane.showMessageDialog(null, "Signo no admitido");
		}
		if (resultadoD > 0) {
			JOptionPane.showMessageDialog(null, "Resultado = " + resultadoD);
		}
		else {
			JOptionPane.showMessageDialog(null, "Resultado = " + resultado);
		}
	}
}