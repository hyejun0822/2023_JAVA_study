
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Repair extends JFrame {
    private JCheckBox engineOilCheckBox;
    private JCheckBox transmissionOilCheckBox;
    private JCheckBox airFilterCheckBox;
    private JCheckBox tireCheckBox;
    private JLabel resultLabel;
    private int totalCost = 0;

    public Repair() {
        setTitle("Week04_02");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        engineOilCheckBox = new JCheckBox("엔진 오일 변환");
        transmissionOilCheckBox = new JCheckBox("자동 변속기 오일 교환");
        airFilterCheckBox = new JCheckBox("에어컨 필터 교환");
        tireCheckBox = new JCheckBox("타이어 교환");
        
        engineOilCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTotalCost();
            }
        });

        transmissionOilCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTotalCost();
            }
        });

        airFilterCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTotalCost();
            }
        });

        tireCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTotalCost();
            }
        });

        panel.add(engineOilCheckBox);
        panel.add(transmissionOilCheckBox);
        panel.add(airFilterCheckBox);
        panel.add(tireCheckBox);

        resultLabel = new JLabel("현재까지의 가격은 0원 입니다.");
        panel.add(resultLabel);

        add(panel);
        setVisible(true);
    }

    private void updateTotalCost() {
        totalCost = 0;
        if (engineOilCheckBox.isSelected()) {
            totalCost += 45000;
        }
        if (transmissionOilCheckBox.isSelected()) {
            totalCost += 80000;
        }
        if (airFilterCheckBox.isSelected()) {
            totalCost += 30000;
        }
        if (tireCheckBox.isSelected()) {
            totalCost += 100000;
        }

        resultLabel.setText("현재까지의 가격은 " + totalCost + "원 입니다.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Repair();
            }
        });
    }
}
