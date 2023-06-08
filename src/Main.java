
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Data d = new Data();

        Worker w1 = new Worker(1, d);
        Worker w2 = new Worker(2, d);

        w1.start();
        w2.start();
        w1.join();
        w2.join();

        System.out.println("end of main...");
    }
}