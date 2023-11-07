import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Week09_01 extends JFrame {
    private JLabel label;
    private JButton stopButton; 
    private JButton resumeButton;
    private boolean counting;
    private int count;
    Thread t;

    class Counter extends Thread {
        public void run() {
            counting = true;
            for (int i = count; i <= 10; i++) {
                if (!counting) {
                    return;
                }
                count = i; 
                label.setText(i + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }

        public void stopCounting() {
            counting = false; 
        }
    }

    public Week09_01() {
        setTitle("카운트다운");
        setSize(400, 150);
        getContentPane().setLayout(null);
        label = new JLabel("0");
        label.setBounds(0, 0, 384, 111);
        label.setFont(new Font("Serif", Font.BOLD, 100));
        getContentPane().add(label);

        stopButton = new JButton("카운트 중지");
        stopButton.setBounds(100, 25, 130, 23);
        stopButton.addActionListener(e -> {
            if (t != null && t.isAlive()) {
                ((Counter) t).stopCounting();
                t.interrupt();
            }
        });
        getContentPane().add(stopButton);

        resumeButton = new JButton("카운트 다시 시작");
        resumeButton.setBounds(247, 25, 130, 23);
        resumeButton.addActionListener(e -> {
            if (t != null && !t.isAlive()) {
                t = new Counter();
                t.start();
            }
        });
        getContentPane().add(resumeButton);

        setVisible(true);
        t = new Counter();
        t.start();
    }

    public static void main(String[] args) {
        Week09_01 t = new Week09_01();
    }
}
