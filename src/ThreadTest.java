public class ThreadTest {
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println(Thread.currentThread().getName()+"2");
//    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println(Thread.currentThread().getName()+"2");
    }
}
