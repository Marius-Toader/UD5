import javax.swing.JOptionPane;

public class UD5_12 {

	public static void main(String[] args) {
		int intentos = 3;
		String password = "prueba";
		boolean correcta = false;
		
		while (intentos > 0 && !(correcta)) {
			String contrase�a = JOptionPane.showInputDialog("Introduce la contrase�a:");
			if (contrase�a.equals(password)) {
				correcta = true;
			}
			intentos--;
		}
		if (correcta) {
			JOptionPane.showMessageDialog(null, "Enhorabuena");
		}
	}
}