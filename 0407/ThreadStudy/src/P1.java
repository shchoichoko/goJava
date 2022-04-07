
public class P1 {

	public static void main(String[] args) {
		//Print a number from 1 to 100 every second
		P1 main = new P1();
		main.waitSec();
	}

	public void waitSec() {
		for(int i = 1; i<101; i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
