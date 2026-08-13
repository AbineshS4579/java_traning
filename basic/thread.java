class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hii");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
    }
}

public class thread {
    public static void main(String[] args) {

        A o = new A();
        B h = new B();

        System.out.println(o.getPriority() + " " + h.getPriority());

        o.setPriority(Thread.MAX_PRIORITY);
        h.setPriority(Thread.MIN_PRIORITY);

        o.start();

        try {
            o.join();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        h.start();
    }
}