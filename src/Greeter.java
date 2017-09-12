import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) throws Exception {
		String name = JOptionPane.showInputDialog(null,"Whats your name");
		JOptionPane.showMessageDialog(null,"Hi " + name);
}}
