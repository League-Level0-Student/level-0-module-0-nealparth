import org.jointheleague.graphical.robot.Robot;

public class RobotGrafitti {
	public static void main(String[] args) throws Exception {
		Robot r = new Robot();
		r.penDown();
		r.setSpeed(10);
		for (int i = 0; i < 1; i++) {
			r.move(200);
			r.setRandomPenColor();
			r.setAngle(120);
			r.move(400);
			r.setAngle(0);
			r.move(200);
		}}
}