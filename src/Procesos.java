import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Procesos extends Semaforos{

    private int R;
    private int G;
    private int T;
    private int H;
    private final Lock lock = new ReentrantLock();
    private final Condition condicionC = lock.newCondition();


    public Procesos() {
        // Hereda los semaforos A, B, C, D desde la superclase semaforos
        super();
        this.R = 10;
        this.G = 20;
        this.T = 15;
        this.H = 35;

    }

    public void P1() throws InterruptedException {
        System.out.println("Semaphore A acquired in p1");
        System.out.println("Proceso 1\nA\tB\tC\tD\tR\tG\tT\tH"+"\n");
        this.A.acquire(); //down
//        lock.lock();
//        try {
            System.out.println(this.A.availablePermits() + "\t" + this.B.availablePermits() + "\t" + this.C.availablePermits() + "\t" + this.D.availablePermits()
                    + "\t" + this.R + "\t" + this.G + "\t" + this.T + "\t" + this.H);
            this.R = this.G + 5;
            System.out.println(this.A.availablePermits() + "\t" + this.B.availablePermits() + "\t" + this.C.availablePermits() + "\t" + this.D.availablePermits()
                    + "\t" + this.R + "\t" + this.G + "\t" + this.T + "\t" + this.H);
            this.G = this.R + 5;
            System.out.println(this.A.availablePermits() + "\t" + this.B.availablePermits() + "\t" + this.C.availablePermits() + "\t" + this.D.availablePermits()
                    + "\t" + this.R + "\t" + this.G + "\t" + this.T + "\t" + this.H);
            this.B.release();
            System.out.println(this.A.availablePermits() + "\t" + this.B.availablePermits() + "\t" + this.C.availablePermits() + "\t" + this.D.availablePermits()
                    + "\t" + this.R + "\t" + this.G + "\t" + this.T + "\t" + this.H);
            this.D.release();
            System.out.println(this.A.availablePermits() + "\t" + this.B.availablePermits() + "\t" + this.C.availablePermits() + "\t" + this.D.availablePermits()
                    + "\t" + this.R + "\t" + this.G + "\t" + this.T + "\t" + this.H);
//        } finally {
//            lock.unlock();
//        }
    }
    public void P11() throws InterruptedException {

        this.B.acquire();//down
//        lock.lock();
//        try {
            System.out.println("Semaphore B acquired in p11");
            System.out.println("Proceso 11\nA\tB\tC\tD\tR\tG\tT\tH" + "\n");
            System.out.println(this.A.availablePermits() + "\t" + this.B.availablePermits() + "\t" + this.C.availablePermits() + "\t" + this.D.availablePermits()
                    + "\t" + this.R + "\t" + this.G + "\t" + this.T + "\t" + this.H);
            this.T = this.H - 5;
            System.out.println(this.A.availablePermits() + "\t" + this.B.availablePermits() + "\t" + this.C.availablePermits() + "\t" + this.D.availablePermits()
                    + "\t" + this.R + "\t" + this.G + "\t" + this.T + "\t" + this.H);
            this.H = this.T + 40;
            System.out.println(this.A.availablePermits() + "\t" + this.B.availablePermits() + "\t" + this.C.availablePermits() + "\t" + this.D.availablePermits()
                    + "\t" + this.R + "\t" + this.G + "\t" + this.T + "\t" + this.H);
            this.R = this.G + 20;
            System.out.println(this.A.availablePermits() + "\t" + this.B.availablePermits() + "\t" + this.C.availablePermits() + "\t" + this.D.availablePermits()
                    + "\t" + this.R + "\t" + this.G + "\t" + this.T + "\t" + this.H);
            this.C.release();//up
            System.out.println(this.A.availablePermits() + "\t" + this.B.availablePermits() + "\t" + this.C.availablePermits() + "\t" + this.D.availablePermits()
                    + "\t" + this.R + "\t" + this.G + "\t" + this.T + "\t" + this.H);
//        } finally {
//            lock.unlock();
//        }
    }
    public void P12()throws InterruptedException {
        System.out.println("Proceso 12\nA\tB\tC\tD\tR\tG\tT\tH"+"\n"+
                this.A.availablePermits()+"\t"+this.B.availablePermits()+"\t"+this.C.availablePermits()+"\t"+this.D.availablePermits()
                +"\t"+this.R+"\t"+this.G+"\t"+this.T+"\t"+this.H);
        this.A.release();
        System.out.println("Semaphore A released in p12");
        System.out.println("Semaphore C acquired in p12");
        this.C.acquire();
    }
    public void P2() throws InterruptedException{
        System.out.println("Proceso 2\nA\tB\tC\tD\tR\tG\tT\tH"+"\n"+
                this.A.availablePermits()+"\t"+this.B.availablePermits()+"\t"+this.C.availablePermits()+"\t"+this.D.availablePermits()
                +"\t"+this.R+"\t"+this.G+"\t"+this.T+"\t"+this.H);
        this.A.acquire();
        this.T= this.H - 60;

    }
    public void P21() throws InterruptedException{
    }
    public void P22() throws InterruptedException{

    }
    public void P3() throws InterruptedException{

    }
    public void P31() throws InterruptedException{

    }
    public void P32() throws InterruptedException{

    }
}
