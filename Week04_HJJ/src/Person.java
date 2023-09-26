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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class Contact {
    private String name;
    private String phoneNumber;
    private String address;

    public Contact(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}

public class Person {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private JFrame frame;
    private JTextField nameField, phoneNumberField, addressField;
    private JTextArea resultArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Person().createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        frame = new JFrame("연락처 관리");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(new JLabel("이름: "));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("전화번호: "));
        phoneNumberField = new JTextField();
        inputPanel.add(phoneNumberField);
        inputPanel.add(new JLabel("주소: "));
        addressField = new JTextField();
        inputPanel.add(addressField);

        frame.add(inputPanel, BorderLayout.NORTH);

        resultArea = new JTextArea();
        frame.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3, 10, 10));
        JButton saveButton = new JButton("저장");
        JButton searchButton = new JButton("검색");
        JButton exitButton = new JButton("종료");

        buttonPanel.add(saveButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(exitButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveContact();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchContact();
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
        String phoneNumber = phoneNumberField.getText();
        String address = addressField.getText();

        if (!name.isEmpty() && !phoneNumber.isEmpty() && !address.isEmpty()) {
            Contact contact = new Contact(name, phoneNumber, address);
            contacts.add(contact);
            nameField.setText("");
            phoneNumberField.setText("");
            addressField.setText("");
            resultArea.append("연락처가 저장되었습니다.\n");
        } else {
            JOptionPane.showMessageDialog(frame, "모든 옵션을 입력하세요.", "오류", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void searchContact() {
        String query = JOptionPane.showInputDialog(frame, "검색할 이름 또는 전화번호를 입력하세요.");
        if (query != null && !query.isEmpty()) {
            boolean found = false;
            for (Contact contact : contacts) {
                if (contact.getName().equalsIgnoreCase(query) || contact.getPhoneNumber().equalsIgnoreCase(query)) {
                    resultArea.setText("이름: " + contact.getName() + "\n");
                    resultArea.append("전화번호: " + contact.getPhoneNumber() + "\n");
                    resultArea.append("주소: " + contact.getAddress() + "\n");
                    found = true;
                }
            }
            if (!found) {
                resultArea.setText("검색 결과가 없습니다.");
            }
        }
    }
}
