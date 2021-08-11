package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		
		// Check the recipe to find out what code to put here
		for(int i = 0; i <10; i++) {
	Random rubies = new Random();
	int rubiez = rubies.nextInt(100-20+1)+20;
	chimmney(rubiez);
		}
	
//Right now, it makes a vertical bar. Probelely have to do with chimmney v
		
}
	public void chimmney( int height)  {
		
		Robot ruby = new Robot();
		ruby.penDown();
		ruby.setSpeed(20);
		ruby.hide();
		
		ruby.move(height);
		ruby.turn(90);
		ruby.move(20);
		ruby.turn(90);
		ruby.move(height);
		
		ruby.turn(270);
		ruby.move(20);
		ruby.turn(-90);
	
	
	}
	}

