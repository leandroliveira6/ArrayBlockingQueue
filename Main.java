package ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
	public static void main(String[] args) {
		BlockingQueue<Integer> c = new ArrayBlockingQueue<Integer>(5);
		Produtor p1 = new Produtor(c, 1);
		Consumidor c1 = new Consumidor(c, 1);
		Consumidor c2 = new Consumidor(c, 2);
		
		p1.start();
		c1.start();
		c2.start();
	}
}
