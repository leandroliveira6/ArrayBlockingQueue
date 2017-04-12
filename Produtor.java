package ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Produtor extends Thread  {
	private BlockingQueue<Integer> estoque;
	private int id;
	                          
	public Produtor(BlockingQueue<Integer> c, int id) {
		estoque = c;
		this.id = id;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				estoque.put(i);
				System.out.println("Produtor " + id + " produziu " + i);
				sleep(1000);
			} 
			catch (InterruptedException e) { 
				System.exit(1);
			}
		}
	}
}
