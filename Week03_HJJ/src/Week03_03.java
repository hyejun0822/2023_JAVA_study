import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Week03_03 extends JFrame {
	private JPanel panel;
	private JLabel label1;
	private JButton button1;
	private JButton button2;
	int img_x=125, img_y=10;
	private Image icon;
	
	public Week03_03() {
		setSize(350,200);
		setTitle("Week03_03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button1 = new JButton("LEFT");
		JButton button2 = new JButton("RIGHT");
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		
		icon = new ImageIcon("resources/car.jpg").getImage();
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				img_x-=10;
				repaint();
			}
		});
		
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				img_x+=10;
				repaint();
			}
		});
		
		setLayout(new BorderLayout());
		add(buttonPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(icon, img_x, img_y, this);
	}
	
	
	public static void main(String[] args) {
		Week03_03 f = new Week03_03();

	}

}
