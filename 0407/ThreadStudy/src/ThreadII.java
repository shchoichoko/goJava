
public class ThreadII implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadII main = new ThreadII();
		Thread thread = new Thread(main);
		thread.start();
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 101; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
