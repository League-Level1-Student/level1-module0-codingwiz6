package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;


import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	
	Robot ruby = new Robot("mini");
	Random rubies = new Random();
	int height = 0;
	public void run() {
	ruby.setX(250);
		// Check the recipe to find out what code to put here
		for(int i = 0; i <10; i++) {
	int rubiez = rubies.nextInt(3-1+1)+1;
	String strHeight = " ";
	String strColor = " ";
		
	if(rubiez == 3) {
		strHeight = "massive";
		strColor = "blue";
	}
	else if(rubiez == 2) {
		strHeight = "med";
		strColor = "yellow";
	}
	else{
		strHeight = "mini";
		strColor = "red";
	}

	
	chimmney(strHeight,strColor);
		}
	}

//It's confusing. When there is a building that has a pointed roof, the next one doesn't. Only for the same color. Not sure why...
	
public void drawPointyRoof() {	
	ruby.move(height);
	ruby.turn(45);
	ruby.move(10);
	ruby.turn(80);
	ruby.move(10);
	ruby.turn(20);
	ruby.turn(35);
	
	ruby.move(height);
	ruby.turn(-90);
	ruby.move(20);
	ruby.turn(-90);
	
	}
public void drawFlatRoof() {	
	
	ruby.move(height);
	ruby.turn(90);
	ruby.move(20);
	ruby.turn(90);
	ruby.move(height);
	ruby.turn(-90);
	ruby.move(20);
	ruby.turn(-90);
	}
	
	public void chimmney(String strHeight, String strColor)  {
		height = 0;
		if(strHeight.equals("mini")) {
			height = 60;
			ruby.setPenColor(Color.RED);
			ruby.penDown();
			ruby.setSpeed(20);
			drawPointyRoof();

		}
		else if(strHeight.equals("med")) {
			height = 120;
			ruby.setPenColor(Color.yellow);
			ruby.penDown();
			ruby.setSpeed(20);
			drawPointyRoof();
		}
		else{
			height = 250;
			ruby.setPenColor(Color.cyan);
			ruby.penDown();
			ruby.setSpeed(20);
			drawFlatRoof();
		}
	
	
		

		
		
	
	}
	}

