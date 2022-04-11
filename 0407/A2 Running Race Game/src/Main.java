
public class Main {

	public static void main(String[] args) {
		Thread thread1 = new MultiThreadTest("Man1");
		thread1.start();
		Thread thread2 = new MultiThreadTest("Man2");
		thread2.start();
		Thread thread3 = new MultiThreadTest("Man3");
		thread3.start();
	}
}

class MultiThreadTest extends Thread {
	double dis = 0; boolean wayout = true;
	public MultiThreadTest(String threadName) {
		this.setName(threadName);
	}
	
	public void run() {
		int sec = 0;
		try {
			for(int i = 0; i < 50; i++) {
				
				if(dis>50) {
					System.out.println("Finished");
					
					break;
				}
				dis = dis + ((Math.round(Math.random()*100)))/10.0;
				
				System.out.println("("+i+")s");
				System.out.print( dis + "m\t");
				Thread.sleep(1000);
			}
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
