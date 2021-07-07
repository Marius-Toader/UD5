import javax.swing.JOptionPane;

public class UD5_10 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de ventas:"));
		int suma = 0;
		for (int i = 0; i < numero; i++) {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Venta " + (i + 1) + ":"));
			suma = suma + valor;
		}
		JOptionPane.showMessageDialog(null, "Suma de todas las ventas: " + suma);
	}
}