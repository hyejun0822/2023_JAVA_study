class MyRunnable implements Runnable {
    String myName;

    // 생성자로 스레드의 이름을 받아 저장
    public MyRunnable(String name) {
        myName = name;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(myName + i + " ");
        }
    }
}

public class TestThread {

    public static void main(String[] args) {
        // MyRunnable을 구현한 Runnable 객체를 생성하여 스레드에 전달
        Thread T1 = new Thread(new MyRunnable("A"));
        Thread T2 = new Thread(new MyRunnable("B"));

        // 두 개의 스레드를 시작
        T1.start();
        T2.start();
    }
}
