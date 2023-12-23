import java.awt.*;
import javax.swing.*;

public class CarGame extends JFrame {
    private JLabel winnerLabel;
    private String winner; // 승자를 저장하는 변수
    private boolean finished; // 경주가 끝났는지 여부를 나타내는 변수
    private JLabel finishLine; // 경주가 끝나는 지점 표시 라인

    class MyThread extends Thread {
        private JLabel label; // 자동차 이미지를 표시할 레이블
        private int x, y; // 자동차의 현재 위치 좌표
        private ImageIcon carIcon; // 자동차 이미지

        // 생성자
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
                int xIncrement = (int) (10 * Math.random()); // 랜덤으로 이동 거리 증가
                x += xIncrement;
                label.setBounds(x, y, carIcon.getIconWidth(), carIcon.getIconHeight());
                try {
                    Thread.sleep(100); // 일정 시간 멈춤
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!raceFinished && x >= finishLine.getX()) { // 경주가 끝났는지 확인
                    raceFinished = true;
                    synchronized (CarGame.this) { // 동기화 블록을 통해 스레드 간 경쟁 상황 방지
                        if (!finished) {
                            finished = true;
                            winner = label.getName(); // 승자 설정
                            SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    displayWinner(); // 승자를 화면에 표시
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

        // 5대의 자동차 스레드 생성 및 시작
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
            winnerLabel.setText("Winner: " + winner); // 승자 표시 레이블 업데이트
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CarGame(); // CarGame 애플리케이션 실행
            }
        });
    }
}
