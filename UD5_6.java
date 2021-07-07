import javax.swing.JOptionPane;

public class UD5_6 {

	public static void main(String[] args) {
		final double IVA = 0.21;
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio:"));
		double preciofinal = precio + (precio * IVA);
		JOptionPane.showMessageDialog(null, "El precio final es de " + preciofinal);
	}
}