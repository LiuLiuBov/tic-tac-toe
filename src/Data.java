public class Data {
    private int state = 1;

    public synchronized void Tic() {
        try {
            while (state != 1) {
                wait();
            }
            state = 2;
            System.out.print("Tic-");
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void Tak() {
        try {
            while (state != 2) {
                wait();
            }
            state = 1;
            System.out.println("Tak");
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*public class Data {
    private int state=1;

    public int getState() { return state; }

    public void Tic(){
        System.out.print("Tic-");
        state=2;
    }
    public void Tak(){
        System.out.println("Tak");
        state=1;
    }
}*/
