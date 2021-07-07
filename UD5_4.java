import javax.swing.JOptionPane;

public class UD5_4 {

	public static void main(String[] args) {
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio:"));
		double area = Math.PI * Math.pow(radio, 2);
		JOptionPane.showMessageDialog(null, "El área es " + area);
	}
}