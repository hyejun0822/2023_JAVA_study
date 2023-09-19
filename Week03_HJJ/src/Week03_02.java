import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Week03_02 extends JFrame {
	private JLabel label1;
	private JTextField field1;
	private JButton button1;
	private JLabel label2;
	private JLabel label3;
	
	public Week03_02() {
		this.setSize(350, 200);
		this.setTitle("Mile -> Km");
		JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
		
		label1 = new JLabel("마일을 입력하시오");
		field1 = new JTextField(10);
		button1 = new JButton("변환");
		label2 = new JLabel("");
		label3 = new JLabel("->");
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double mile = Double.parseDouble(field1.getText());
				double kilo = mile * 1.609344;
				label2.setText(Double.toString(kilo));
			}
		});
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label3);
		panel.add(label2);
		
		panel.add(button1);
		
		this.add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Week03_02 f = new Week03_02();

	}

}
