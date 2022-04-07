import javax.swing.JOptionPane;

public class ThreadHorse {
	public static void main(String[] args) {

		/** �� ������ 5�� ����*/
//		Horse horse1 = new Horse("������", new Rank());
//		Horse horse2 = new Horse("������", new Rank());
//		Horse horse3 = new Horse("������", new Rank());
//		Horse horse4 = new Horse("������", new Rank());
//		Horse horse5 = new Horse("����", new Rank());
		
		/** �� ������ 5�� ����*/
//		horse1.start();
//		horse2.start();
//		horse3.start();
//		horse4.start();
//		horse5.start();

		Thread myThread = null;
		for (int i = 1; i <= 3; i++) {
			myThread = new Horse(i+"��", new Rank());
			myThread.start();
		}
		
		
	}
} 

class Horse extends Thread {
	/** ���� �̸� */
	String h_name = "";

	/** �ѱ��� */
	int meter = 100;

	/** ��� �ű� static ���� */
	static int count = 1;

	/** RankŬ���� */
	Rank rank;

	/** �⺻������ */
	public Horse() {
		// TODO Auto-generated constructor stub
	}

	/** ���� �̸��� ��ü�� ���� Rank���� */
	public Horse(String h_name, Rank rank) {
		this.h_name = h_name;
		this.rank = rank;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				/** 1~2000 ������ ���� �߻��� sleep */
				sleep((int) (Math.random() * 2000 + 1));

				System.out.println(h_name + " ���� ���� �Ÿ� : " + meter);

				/** ���� 20���� ������ �̵� */
				meter -= 20;

				/** meter�� 0�̵Ǹ� ������̱� ������ rank.finishLine(���� �̸�)���� */
				if (meter == 0) {
					this.rank.finishLine(h_name);
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

}

	class Rank {
	/** ���� ��� */
	int rank;

	public Rank() {
		// TODO Auto-generated constructor stub
	}

	public void finishLine(String name) {
		// TODO Auto-generated method stub
		rank = Horse.count++;
		System.out.println(name + " �� " + rank + "������ ����� ����");

		/** 1�� ���� ��� JOptionPane.showMessageDialog�� ����ش� */

		if (rank == 1) {
			/** ù��° �Ű������� Frame�����ε� ���⶧���� �⺻frame�� ���� ������ null���� ����. */
			JOptionPane.showMessageDialog(null, "1��� " + name + " �Դϴ� !!");
		}

	}

}


