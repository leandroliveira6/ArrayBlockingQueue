package ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumidor extends Thread {
	private BlockingQueue<Integer> estoque;
	private int id;

	public Consumidor(BlockingQueue<Integer> c, int id) {
		estoque = c;
		this.id = id;
	}

	public void run() {
		int value = 0;
        
		for (int i = 0; i < 5; i++) {
			try {
				value = estoque.take();
				System.out.println("Comsumidor " + id + " consumiu " + value);
				sleep(2000);
			} 
			catch (InterruptedException e) { 
				System.exit(1);
			}
		}
	}
}
