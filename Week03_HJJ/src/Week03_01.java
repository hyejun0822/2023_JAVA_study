import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Week03_01 extends JFrame {
	private JPanel panel;
	private JLabel label;
	private JButton button1;
	private JButton button2;
	
	public Week03_01() {
		setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Week03_01");
		
		JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
		
		JLabel label0 = new JLabel("회원 등록하기");
		JLabel label1 = new JLabel("이름	");
		JLabel label2 = new JLabel("비밀번호");
		JLabel label3 = new JLabel("이메일주소");
		JLabel label4 = new JLabel("핸드폰번호");
		JTextField field1 = new JTextField(20);
		JPasswordField field2= new JPasswordField(20);
		JTextField field3 = new JTextField(20);
		JTextField field4 = new JTextField(20);
		
		panel.add(label0);
		panel.add(new JLabel(""));
		panel.add(label1);
		panel.add(field1);
		
		panel.add(label2);
		panel.add(field2);

		panel.add(label3);
		panel.add(field3);

		panel.add(label4);
		panel.add(field4);

		JButton button1 = new JButton("등록하기");
		JButton button2 = new JButton("취소");
		
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = field1.getText();
				String password = new String(field2.getPassword());
				String email = field3.getText();
				String phone = field4.getText();
			}
		});
		//취소 버튼 누르면 입력값 초기화
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				field1.setText("");
				field2.setText("");
				field3.setText("");
				field4.setText("");
				
				System.out.println("이름: "+label1);
				System.out.println("비밀번호: "+label2);
				System.out.println("이메일주소: "+label3);
				System.out.println("핸드폰번호: "+label4);
			}
		});
		
		add(panel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		Week03_01 f = new Week03_01();

	}

}
