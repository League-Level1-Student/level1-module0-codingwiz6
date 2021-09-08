package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	
	Robot ruby = new Robot("mini");
	Random rubies = new Random();
	public void run() {
		
		// Check the recipe to find out what code to put here
		for(int i = 0; i <10; i++) {
	int rubiez = rubies.nextInt(3-1+1)+1;
	String strHeight = " ";
	if(rubiez == 3) {
		String strHeight = "massive";
	}
	else if(rubiez == 2) {
		String strHeight = "med";
	}
	else{
		String strHeight = "mini";
	}
	
	chimmney(strHeight);
		}
	
//I have to fix the if statments. You can tell.
		
}
	public void chimmney(String strHeight)  {
		int height = 0;
		if(strHeight.equals("mini")) {
			height = 60;
		}
		else if(strHeight.equals("med")) {
			height = 120;
		}
		else{
			height = 250;
		}
	
		ruby.penDown();
		ruby.setSpeed(20);
		
		
		ruby.move(height);
		ruby.turn(90);
		ruby.move(20);
		ruby.turn(90);
		ruby.move(height);
		ruby.turn(-90);
		ruby.move(20);
		ruby.turn(-90);
		

		
	
	}
	}

