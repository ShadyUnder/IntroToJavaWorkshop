package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
Robot c3po = new Robot();
//c3po.moveTo(400,378);
c3po.penDown();
c3po.setPenColor(99,34,200);
c3po.setSpeed(10);

for (int i = 0; i < 4; i++) {	
c3po.move(137);
c3po.turn(90);

}

//c3po.move(137);
//c3po.turn(90 );
//c3po.move(137);
//c3po.move(137);
//c3po.turn(90);
//c3po.move(137);
		
}
}
