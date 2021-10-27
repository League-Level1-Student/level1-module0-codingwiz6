package _03_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame= new JFrame();
	JButton button= new JButton();
	
    public void showButton() {
    	  frame.setVisible(true);
    	  
        System.out.println("Button clicked");
        
        frame.add(button);
        
        frame.pack();
        
        button.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "You have broken your fortune cookie...");
		int ruby = new Random().nextInt(5);
		
		if(ruby == 1) {
			JOptionPane.showMessageDialog(null, "You will find good friends during your journey. P.S I am VERY wise. ^~^");
		}
		else if(ruby==2) {
			JOptionPane.showMessageDialog(null, "Work Hard and you will be rewarded.");
		}
		else if( ruby==3) {
			JOptionPane.showMessageDialog(null, "Find your own truth.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Good Luck with Adult-hood -_-");
		}
	}
}
