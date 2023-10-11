public class Procesos extends Semaforos{

    private int R;
    private int G;
    private int T;
    private int H;

    public Procesos() {
        super();
        this.R = 10;
        this.G = 20;
        this.T = 15;
        this.H = 35;

    }

    public void P1() throws InterruptedException {
        this.A.acquire();//down
        this.B.acquire();//down
        this.R = this.T - 5;
        this.G = this.H - 5;
    }
    public void P11() throws InterruptedException {
        this.B.release();//up
        this.T = this.R - 5;
        this.G = this.H - 5;
        this.C.acquire();//down
    }
    public void P12()throws InterruptedException {

    }
    public void P13() throws InterruptedException{

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
