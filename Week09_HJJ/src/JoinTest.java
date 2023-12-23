public class JoinTest extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        // JoinTest 클래스의 세 개의 스레드 객체 생성
        JoinTest t1 = new JoinTest();
        JoinTest t2 = new JoinTest();
        JoinTest t3 = new JoinTest();

        // 각 스레드에 이름 부여
        t1.setName("duksung01");
        t2.setName("duksung02");
        t3.setName("duksung03");

        // 첫 번째 스레드 시작
        t1.start();
        try {
            t1.join(); // t1 스레드가 종료될 때까지 대기
        } catch (Exception e) {
            System.out.println(e);
        }

        // 두 번째 스레드 시작
        t2.start();
        try {
            t2.join(); // t2 스레드가 종료될 때까지 대기
        } catch (Exception e) {
            System.out.println(e);
        }

        // 세 번째 스레드 시작 (대기하지 않고 진행)
        t3.start();
    }
}
