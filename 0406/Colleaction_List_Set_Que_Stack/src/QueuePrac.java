import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueuePrac {

	public static void main(String[] args) {
		QueueToList(numToQueue());
	}

	public static Queue<Integer> numToQueue() {
		Queue<Integer> num = new LinkedList<Integer>();
		int input = 0;
		for (int i = 0; i < 100; i++) {
			if ((input = (int) (Math.random() * 30)) % 2 != 0) {
				num.offer(input);
			}
			if (num.size() == 10) {
				break;
			}
		}
		System.out.println(num);
		return num;
	}

	public static void QueueToList(Queue<Integer> num) {
		List<Integer> list = new ArrayList<Integer>(num);
		System.out.println("3의 배수는");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 3 == 0) {
				System.out.print(list.get(i) + " ");
			}
		}
	}
}
