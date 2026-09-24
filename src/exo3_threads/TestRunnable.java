package exo3_threads;

public class TestRunnable implements Runnable{

	@Override
	public void run() {
		
		
		
		for(int i = 1; i <= 10; i++) {
			char c = (char) ('!' + i - 1);
			System.out.print(c);
			for(int j = 1; j <= i; j++)
				
				{System.out.print("*");}
			System.out.print(c);	
			System.out.println();}
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start();
	}
}
