package _03_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton button1 = new JButton("^w^");
	JButton button2 = new JButton("0,0");
	JButton button3 = new JButton("*o*");
	
	public void run() {
		frame.add(panel);
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			JOptionPane.showMessageDialog(null, "Hiya! ^w^");
		}
		if(e.getSource()==button2) {
			JOptionPane.showMessageDialog(null, "Woah! Pom-poms! 0,0 ");
		}
		if(e.getSource()==button3) {
			JOptionPane.showMessageDialog(null, "Stars are soooo pretty! *o* ");
		}
	}
}
