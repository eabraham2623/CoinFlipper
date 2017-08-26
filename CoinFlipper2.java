import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import sun.audio.*;
import java.io.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;


public class CoinFlipper2 extends JFrame 
{
	private JButton item1;

	public CoinFlipper2()
	{
		super("Coin Flipper");
		setLayout(new FlowLayout());

		item1 = new JButton("Flip Coin");		
		add(item1);

		Handler h = new Handler();

		item1.addActionListener(h);
	}
	public void music()
	{
		URL url = getClass().getResource("/CF.wav");    
		AudioClip clip = Applet.newAudioClip(url);
		clip.play();
	}

	private class Handler implements ActionListener
	{
		JFrame frame2 = new JFrame("Coin Flip");
		int count = 1;
		public void actionPerformed(ActionEvent event)
		{

			
			JLabel label1 = new JLabel ("It's Heads!");
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
			JLabel label2 = new JLabel ("It's Tails!");
			JLabel label3 = new JLabel("");
			JLabel label4 = new JLabel("");
			JLabel label5 = new JLabel("Number of Times Flipped: " + count);	
			Image img1 = new ImageIcon(this.getClass().getResource("/heads.png")).getImage();
			Image img2 = new ImageIcon(this.getClass().getResource("/tails.png")).getImage();
			music();
			label3.setIcon(new ImageIcon(img1));
			label4.setIcon(new ImageIcon(img2));
			

			int num = (int) (Math.random() * 2);

			if (num == 0)
			{

				frame2.add(panel);
				panel.add(label1);
				panel.add(Box.createRigidArea(new Dimension(0, 50)));
				panel.add(label3);
				panel.add(Box.createRigidArea(new Dimension(0, 50)));
				panel.add(label5);
				frame2.setVisible(true);
				frame2.setSize(250,400);
				count++;			


			}
			else
			{

				frame2.add(panel);
				panel.add(label2);
				panel.add(Box.createRigidArea(new Dimension(0, 50)));
				panel.add(label4);
				panel.add(Box.createRigidArea(new Dimension(0, 50)));
				panel.add(label5);
				frame2.setVisible(true);
				frame2.setSize(250,400);
				count++;				
			}

		}

	}
}
