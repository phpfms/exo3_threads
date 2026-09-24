package exo3_threads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime {

  public static void main(String[] args) {

    Thread thread = new Thread(new MonRunnable(1000));

    thread.start();
  }

  private static class MonRunnable implements Runnable {

    private long delai;
    DateFormat df = new SimpleDateFormat("HH:mm:ss");

    public MonRunnable(long delai) {
      this.delai = delai;
    }

    @Override
    public void run() {
    	while(true) {
	      try {
	    	System.out.print("\r " + df.format(new Date()));
	    	System.out.flush();
	        Thread.sleep(delai);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
    	}
    }
  }
}