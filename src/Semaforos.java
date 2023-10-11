import java.util.concurrent.Semaphore;

public class Semaforos {

    private Semaphore A;
    private Semaphore B;
    private Semaphore C;
    private Semaphore D;

    public Semaforos() {
        this.A = new Semaphore(1);
        this.B = new Semaphore(0);
        this.C = new Semaphore(0);
        this.D = new Semaphore(0);
    }
}
