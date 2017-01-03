package Singleton;

/**
 * Created by hotsky on 16/4/11.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton singleton = Singleton.INSTANCE;
                    System.out.println(singleton.hashCode());
                }
            });
            thread.start();
        }
    }
}
