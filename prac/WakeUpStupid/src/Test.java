
public class Test {

	public static void main(String[] args) {

		int bTime = 610; // ù ������ �����忡 ������ �ð�

		bestTimeCal(bTime);
	}
	
	public static void bestTimeCal (int time) {
		
		do {
			if (time % 10 == 3 || time % 10 == 8) {// �� N�� 5�� ���� �Ͼ�Ƿ� ������ ������ �Ÿ� 3�� ���ϸ�
				break; 								// 3�� Ȥ�� 8�п� �����ϴ� ������ ��� ���� ž��
			}

			time += 11;// ������ ���� ����

			if (time % 100 >= 60) {
				time += 40; // 60���� �Ѿ�� 40�� ���� ���� �ð����� �ѱ� ex) 667 =>707
			}
		} while (time <= 830);

		System.out.println("ö���� " + (time - 3) / 100 + " �� " + (time - 3) % 100 + " �п� �Ͼ�� ��� ���� ������ Ż�� ����.");
	}
}