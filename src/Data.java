
public class Data {

    private int state = 1;

    public synchronized void Tic() {
        try {
            while (state != 1) {
                wait();
            }
            System.out.print("Tic-");
            notifyAll();
            state = 2;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void Tak() {
        try {
            while (state != 2) {
                wait();
            }
            state = 3;
            System.out.print("Tak-");
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void Toy() {
        try {
            while (state != 3) {
                wait();
            }
            state = 1;
            System.out.println("Toy");
            notifyAll();
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