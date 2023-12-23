import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadControl extends JFrame {
    private JLabel label;
    Thread t;

    // 카운트 다운을 수행하는 스레드 클래스
    class Counter extends Thread {
        public void run() {
            for (int i = 0; i <= 10; i++) {
                try {
                    // 1초 동안 대기
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // 스레드가 인터럽트되면 종료
                    return;
                }
                // 레이블의 텍스트 업데이트
                label.setText(i + " ");
            }
        }
    }

    public ThreadControl() {
        setTitle("카운트다운");
        setSize(400, 150);
        getContentPane().setLayout(null);
        label = new JLabel("0");
        label.setBounds(0, 0, 384, 111);
        label.setFont(new Font("Serif", Font.BOLD, 100));
        getContentPane().add(label);

        JButton btnNewButton = new JButton("카운터 중지");
        btnNewButton.setBounds(247, 25, 125, 23);

        // 버튼 클릭 시 스레드 인터럽트 호출
        btnNewButton.addActionListener(e -> t.interrupt());
        getContentPane().add(btnNewButton);
        setVisible(true);
        t = new Counter();
        t.start();
    }

    public static void main(String[] args) {
        ThreadControl t = new ThreadControl();
    }
}
