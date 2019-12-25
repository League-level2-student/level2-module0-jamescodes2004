package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static boolean won = false;
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < robots.length; i++) {
	robots[i]=new Robot();
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
for (int i = 0; i < robots.length; i++) {
	robots[i].setX(50 + 100*i);
	robots[i].setY(500);
}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
while(won == false) {
for (int i = 0; i < robots.length; i++) {
	robots[i].move(new Random().nextInt(50));
	if (robots[i].getY()<50) {
		won = true;
		robots[i].sparkle();
		break;
	}
	if (robots[i].getY()<=400) {
		robots[i].turn(90);
	}
	if (robots[i].getX()-i*100==100) {
		robots[i].turn(270);
	}
	}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}