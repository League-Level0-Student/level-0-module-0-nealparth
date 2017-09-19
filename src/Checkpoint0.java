import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint0 {
	public static void main(String[] args) {
		//String color = JOptionPane.showInputDialog("What is you favorite color?");
		Robot bot = new Robot("bot");
		bot.penDown();
		bot.setSpeed(10);
		//bot.setPenColor(Color.getColor(null, null));
		bot.setAngle(30);
		bot.move(100);
		bot.turn(120);
		bot.move(100);
		bot.turn(120);
		bot.move(100);
		
	
		
	}
	
	
	
}
	

