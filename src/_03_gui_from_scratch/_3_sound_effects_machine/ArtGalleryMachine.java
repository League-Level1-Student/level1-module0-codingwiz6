package _03_gui_from_scratch._3_sound_effects_machine;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ArtGalleryMachine implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JButton buttonone = new JButton("$,$");
	JButton buttontwo = new JButton("0w0");
	JButton buttonthree = new JButton("@o@");
	JButton buttonfour = new JButton("*o*");

	public void run() {

		frame.add(panel);

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buttonone.addActionListener(this);
		buttontwo.addActionListener(this);
		buttonthree.addActionListener(this);
		buttonfour.addActionListener(this);

		panel.add(buttonone);
		panel.add(buttontwo);
		panel.add(buttonthree);
		panel.add(buttonfour);

		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == buttonone) {
			String turk = "https://media.istockphoto.com/vectors/roast-turkey-icon-vector-id881016568?k=20&m=881016568&s=612x612&w=0&h=9b0WtNc0uErBdzYxJRE032wpwJKHGtAWa7uM-ej47mY=";
			JFrame frame1 = new JFrame();
			frame1.setVisible(true);
			Component turkeuy;
			turkeuy=createImage(turk);
			frame1.add(turkeuy);
			frame1.pack();
		}
		if (arg0.getSource() == buttontwo) {
			String pie= "https://image.shutterstock.com/image-vector/drawing-pumpkin-pie-piece-topped-260nw-487728403.jpg";
			JFrame frame2 = new JFrame();
			frame2.setVisible(true);
			Component piez;
			piez=createImage(pie);
			frame2.add(piez);
			frame2.pack();
		}
		if (arg0.getSource() == buttonthree) {
			String ginger = "https://cdn.w600.comps.canstockphoto.com/ginger-bread-man-house-illustration-drawing_csp76604699.jpg";
			JFrame breadf2 = new JFrame();
			breadf2.setVisible(true);
			Component christmas;
			christmas=createImage(ginger);
			breadf2.add(christmas);
			breadf2.pack();
		}
		if (arg0.getSource() == buttonfour) {
			String christmascorgi = "https://image.shutterstock.com/image-vector/cute-cartoon-shiba-inu-puppy-260nw-1558763648.jpg";
			JFrame stocking = new JFrame();
			stocking.setVisible(true);
			Component chimney;
			chimney=createImage(christmascorgi);
			stocking.add(chimney);
			stocking.pack();
		}

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

}
