public class Test implements Runnable {

    @Override
    public void run() {
        Thread main_thread = new Thread( new Main() );
        main_thread.start();
    }

    public static void main(String[] args) {

    }

}