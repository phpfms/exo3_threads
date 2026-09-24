package exo3_threads;

public class TestThread extends Thread {

    public TestThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
        	
        	System.out.print(i);
        	
        	for (int j = 1; j <= i; j++) {
            System.out.print(this.getName());
        	}
        	
        	System.out.println();
        }
    }

    public static void main(String[] args) {
        TestThread t = new TestThread("-");
        TestThread t2 = new TestThread("-");

        t.start();
        t2.start();
    }
}
