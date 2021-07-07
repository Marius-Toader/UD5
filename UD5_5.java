import javax.swing.JOptionPane;

public class UD5_5 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número:"));
		String mensaje;
		
		if (numero % 2 == 0) {
			mensaje = "Es divisible entre 2";
		}
		else {
			mensaje = "No es divisible entre 2";
		}
		
		JOptionPane.showMessageDialog(null, mensaje);
	}
}