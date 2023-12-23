import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {
    private JLabel label;

    // 내부 스레드 클래스 정의
    class MyThread extends Thread {
        public void run() {
            for (int i = 0; i <= 10; i++) {
                try {
                    Thread.sleep(1000); // 1초 동안 스레드 일시 중지
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                label.setText(i + ""); // 레이블에 현재 카운트 값 출력
            }
        }
    }

    public CountDownTest() {
        setTitle("카운트다운"); // 프레임 제목 설정
        setSize(400, 150); // 프레임 크기 설정
        label = new JLabel("Start"); // 초기 텍스트 설정
        label.setFont(new Font("Serif", Font.BOLD, 100)); // 레이블 폰트 설정
        add(label); // 레이블을 프레임에 추가
        setVisible(true); // 프레임을 화면에 표시

        (new MyThread()).start(); // 스레드 시작
    }

    public static void main(String[] args) {
        CountDownTest t = new CountDownTest(); // CountDownTest 객체 생성
    }
}
