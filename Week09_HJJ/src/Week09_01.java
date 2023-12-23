import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 카운터 역할을 하는 스레드 클래스
class Counter extends Thread {
    private JLabel label;
    private boolean counting;
    private int count;

    // 생성자로 JLabel을 받아 초기화하는 생성자
    public Counter(JLabel label) {
        this.label = label;
        counting = true;
        count = 0;
    }

    // 스레드가 실행할 메서드
    public void run() {
        for (int i = count; i <= 10; i++) {
            if (!counting) {
                return; // counting 변수가 false이면 스레드 종료
            }
            count = i;
            label.setText(i + " "); // 라벨에 숫자 표시
            try {
                Thread.sleep(1000); // 1초 동안 일시정지
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    // 카운팅 중지를 위한 메서드
    public void stopCounting() {
        counting = false;
    }
}

public class Week09_01 extends JFrame {
    private JLabel label;
    private JButton stopButton;
    private JButton resumeButton;
    private boolean counting;
    private int count;
    private Thread t;

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
                ((Counter) t).stopCounting(); // 스레드의 counting 멤버 변수를 false로 설정하여 중지
                t.interrupt(); // 스레드 강제 종료
            }
        });
        getContentPane().add(stopButton);

        resumeButton = new JButton("카운트 다시 시작");
        resumeButton.setBounds(247, 25, 130, 23);
        resumeButton.addActionListener(e -> {
            if (t != null && !t.isAlive()) {
                t = new Counter(label); // 새로운 Counter 스레드 생성
                t.start(); // 스레드 시작
            }
        });
        getContentPane().add(resumeButton);

        setVisible(true);
        t = new Counter(label); // 처음에는 Counter 스레드를 생성하고 시작
        t.start();
    }

    public static void main(String[] args) {
        Week09_01 t = new Week09_01();
    }
}
