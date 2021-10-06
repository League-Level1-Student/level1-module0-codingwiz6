package _02_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
String lego = "https://cdn.shopify.com/s/files/1/2299/2295/products/lego-female-scuba-diver-turtle-series-20-minifigure.png?v=1586173104";
		// 2. create a variable of type "Component" that will hold your image
Component lejo; 
		// 3. use the "createImage()" method below to initialize your Component
lejo=createImage(lego);
		// 4. add the image to the quiz window
quizWindow.add(lejo);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String ldiver=JOptionPane.showInputDialog("What color is the turtle?");
		// 7. print "CORRECT" if the user gave the right answer
if(ldiver.equalsIgnoreCase("green")) {
	System.out.println("Correct!");
}
else {
	System.out.println("Incorrect.");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(lejo);
		// 10. find another image and create it (might take more than one line
		// of code)
String lfriend = "https://static.wikia.nocookie.net/legofriends/images/d/d3/Emma-413402.jpg/revision/latest?cb=20180117224148";
Component lfriends;
lfriends= createImage(lfriend);
quizWindow.add(lfriends);
quizWindow.pack();
String emmalf= JOptionPane.showInputDialog("What is her name?");
if(emmalf.equalsIgnoreCase("Emma")) {
	System.out.println("Correct!");

}
else {
	System.out.println("Incorrect.");
}
// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
