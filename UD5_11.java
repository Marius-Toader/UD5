import javax.swing.JOptionPane;

public class UD5_11 {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Día de la semana:");
		
		switch (dia) {
			case "lunes": JOptionPane.showMessageDialog(null, "Es día laboral");
				break;
			case "martes": JOptionPane.showMessageDialog(null, "Es día laboral");
				break;
			case "miercoles": JOptionPane.showMessageDialog(null, "Es día laboral");
				break;
			case "jueves": JOptionPane.showMessageDialog(null, "Es día laboral");
				break;
			case "viernes": JOptionPane.showMessageDialog(null, "Es día laboral");
				break;
			case "sabado": JOptionPane.showMessageDialog(null, "No es día laboral");
				break;
			case "domingo": JOptionPane.showMessageDialog(null, "No es día laboral");
				break;
			default: JOptionPane.showMessageDialog(null, "Dia no válido");
		}
	}
}