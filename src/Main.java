import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Procesos prueba = new Procesos();
        Thread t1 = new Thread(() -> {
            try {
                prueba.P1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                prueba.P11();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                prueba.P12();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t3.start();

        try {
            t2.join();
            t1.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}