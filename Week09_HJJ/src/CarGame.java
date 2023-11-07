import java.awt.*;
import javax.swing.*;

public class CarGame extends JFrame {
    private JLabel winnerLabel;
    private String winner;
    private boolean finished;
    private JLabel finishLine;

    class MyThread extends Thread {
        private JLabel label;
        private int x, y;
        private ImageIcon carIcon;

        public MyThread(String fname, int x, int y, String name) {
            this.x = x;
            this.y = y;
            carIcon = new ImageIcon(fname);
            label = new JLabel(carIcon);
            label.setBounds(x, y, carIcon.getIconWidth(), carIcon.getIconHeight());
            label.setName(name);
            add(label);
        }

        public void run() {
            boolean raceFinished = false;
            for (int i = 0; i < 200; i++) {
                int xIncrement = (int) (10 * Math.random());
                x += xIncrement;
                label.setBounds(x, y, carIcon.getIconWidth(), carIcon.getIconHeight());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!raceFinished && x >= finishLine.getX()) {
                    raceFinished = true;
                    synchronized (CarGame.this) {
                        if (!finished) {
                            finished = true;
                            winner = label.getName();
                            SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    displayWinner();
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    public CarGame() {
        setTitle("CarRace");
        setSize(600, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        finishLine = new JLabel();
        finishLine.setOpaque(true);
        finishLine.setBackground(Color.BLACK);
        finishLine.setBounds(500, 0, 2, 400);
        add(finishLine);

        (new MyThread("car1.gif", 100, 0, "Car1")).start();
        (new MyThread("car2.gif", 100, 50, "Car2")).start();
        (new MyThread("car3.gif", 100, 100, "Car3")).start();
        (new MyThread("car1.gif", 100, 150, "Car4")).start();
        (new MyThread("car2.gif", 100, 200, "Car5")).start();

        winnerLabel = new JLabel("Winner: ");
        winnerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        winnerLabel.setBounds(200, 300, 200, 50);
        add(winnerLabel);

        setVisible(true);
    }

    private void displayWinner() {
        if (winner != null) {
            winnerLabel.setText("Winner: " + winner);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CarGame();
            }
        });
    }
}
