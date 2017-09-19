import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args)  {
		String name = JOptionPane.showInputDialog(null,"What is your name?"); 
		String activity = JOptionPane.showInputDialog(null,"What activity did you do last summer?"); 
		JOptionPane.showInputDialog(null,"I know that you " + activity + " did last summer " + name + " Muhahaha!");
		
	}
}

