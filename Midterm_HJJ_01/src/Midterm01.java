import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class Student {
    private String name;
    private String studentNumber;
    private String grade;

    public Student(String name, String studentNumber, String grade) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return studentNumber;
    }

    public String getAddress() {
        return grade;
    }
}

public class Midterm01 {
    private ArrayList<Student> contacts = new ArrayList<>();
    private JFrame frame;
    private JTextField nameField, studentNumberField, gradeField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Midterm01().createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        frame = new JFrame("덕성여대 화이팅");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);
        frame.setLayout(new BorderLayout());
        
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new GridLayout(4, 2));
        titlePanel.add(new JLabel("학생 등록하기"));
        
        frame.add(titlePanel, BorderLayout.NORTH);
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(new JLabel("이름: "));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("학번: "));
        studentNumberField = new JTextField();
        inputPanel.add(studentNumberField);
        inputPanel.add(new JLabel("성적: "));
        gradeField = new JTextField();
        inputPanel.add(gradeField);
        
        frame.add(inputPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3, 10, 10));
        JButton saveButton = new JButton("등록하기");
        JButton exitButton = new JButton("취소");

        buttonPanel.add(saveButton);
        buttonPanel.add(exitButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveContact();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    private void saveContact() {
        String name = nameField.getText();
        String studentNumber = studentNumberField.getText();
        String grade = gradeField.getText();

        if (!name.isEmpty() && !studentNumber.isEmpty() && !grade.isEmpty()) {
            Student student = new Student(name, studentNumber, grade);
            contacts.add(student);
            nameField.setText("");
            studentNumberField.setText("");
            gradeField.setText("");
            System.out.println("이름: " + name + " 학번: " + studentNumber + " 성적: " + grade);
        } else {
            JOptionPane.showMessageDialog(frame, "모든 옵션을 입력하세요.", "오류", JOptionPane.ERROR_MESSAGE);
        }
    }
}