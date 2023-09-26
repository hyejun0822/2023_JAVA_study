import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BusinessCard {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Week04_03");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new GridBagLayout());
        frame.add(mainPanel, BorderLayout.CENTER);

        ImageIcon imageIcon = new ImageIcon("resources/bird.jpg");
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(scaledImageIcon);

        JPanel textPanel = new JPanel(new GridBagLayout());

        JLabel nameLabel = new JLabel("장혜준");
        JLabel titleLabel = new JLabel("네트워크 포렌식 전문가");
        JLabel companyLabel = new JLabel("경찰청");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        textPanel.add(nameLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        textPanel.add(titleLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        textPanel.add(companyLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        mainPanel.add(imageLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 3;
        mainPanel.add(textPanel, gbc);

        frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
