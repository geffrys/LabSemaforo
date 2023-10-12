public class Procesos extends Semaforos{

    private int R;
    private int G;
    private int T;
    private int H;

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
        this.A.acquire(); //down
        this.A.acquire();
        this.R = this.G + 5;
        System.out.println("R: " + this.R);
        this.G = this.R + 5;
        System.out.println("G: " + this.G);
        System.out.println("Semaphore B released in p1");
        this.B.release();
        System.out.println("A\tB\tC\tD\tR\tG\tT\tH"+"\n"+
        this.A.availablePermits()+"\t"+this.B.availablePermits()+"\t"+this.C.availablePermits()+"\t"+this.D.availablePermits()
        +"\t"+this.R+"\t"+this.G+"\t"+this.T+"\t"+this.H);
    }
    public void P11() throws InterruptedException {
        System.out.println("Semaphore B acquired in p11");
        this.B.acquire();//down
        System.out.println("dormido");
        this.T = this.H - 5;
        System.out.println("T: " + this.T);
        System.out.println("Semaphore C released in p11");
        this.C.release();//up
    }
    public void P12()throws InterruptedException {
        this.A.release();
        System.out.println("Semaphore A released in p12");
        System.out.println("Semaphore C acquired in p12");
        this.C.acquire();
    }
    public void P2() throws InterruptedException{
        System.out.println("Inicia proceso 2");
        this.A.acquire();
        System.out.println("proceso reiniciado");
        this.T= this.H - this.R;
        System.out.println("proceso 2 finalizado");
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
