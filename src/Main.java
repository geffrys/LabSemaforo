public class Main {
    public static void main(String[] args) {

        Procesos prueba = new Procesos();
        while(true){
            try {
                prueba.P1();
                prueba.P11();
                prueba.P12();
                prueba.P13();
                prueba.P21();
                prueba.P22();
                prueba.P3();
                prueba.P31();
                prueba.P32();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}