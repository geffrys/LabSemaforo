import java.util.concurrent.Semaphore;

public class Semaforos {

    public Semaphore A;
    public Semaphore B;
    public Semaphore C;
    public Semaphore D;

    public Semaforos() {
        this.A = new Semaphore(1);
        this.B = new Semaphore(0);
        this.C = new Semaphore(0);
        this.D = new Semaphore(0);
    }
}
