package section2;

import org.jointheleague.graphical.robot.Robot;

public class FirstRobot {
public static void main(String[] args) {
	Robot jeff = new Robot();
	jeff.miniaturize();
	jeff.penDown();
	jeff.setRandomPenColor();
for(int i = 0; i < 4; i++) {
	jeff.move(100);
	jeff.turn(90);
	

	
}
}
}