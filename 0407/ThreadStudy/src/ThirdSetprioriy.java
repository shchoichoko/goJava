
public class ThirdSetprioriy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new MultiThreadTest("[Thread " + 1 + "]");
		thread1.setPriority(1);
		thread1.start();
		Thread thread2 = new MultiThreadTest("[Thread " + 2 + "]");
		thread2.setPriority(10);
		thread2.start();
	}
}

class MultiThreadTest extends Thread {
	public MultiThreadTest(String threadName) {
		this.setName(threadName);
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + "Thread_Start");
	}
}