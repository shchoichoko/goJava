
public class Main {
	public static void main(String[] args) {
		int wakeUpTime;
		Main main = new Main();
		wakeUpTime = main.getWakeUpTime();
		main.print(6, wakeUpTime);	// ó�� ��� �ð� 6 �� ��� �м��� �Լ��� �ֱ�.
		
	}	
	
	public int getWakeUpTime() {	// ��� �м��� ���ϴ� �Լ�
		
		int minutes[] = new int[177/11];
		int wakeUpMinutes = 0;
		for (int i = 5; i < 151; i = i + 10) {	// ö���� 10�� �������� M5�п� ���缭 �Ͼ.

			for (int j = 10; j < 177; j = j + 11) {	
				// ���� ������ ���� ���� ���� �ð��� 10�к��� 11�� ����
				for(int time = 0; time<(177-10)/11; time++) {
					if (0 == Math.abs(j - i - 3)) {	
						minutes[time] = i;				
					}
				}
			}
		}
		wakeUpMinutes = minutes[0];
		if (wakeUpMinutes > 60) {
				//�ʰ��� �и�ŭ ���� ���� �ð��� �����ֱ�
			wakeUpMinutes -= 60;
		}
		
		return wakeUpMinutes;
	}
	
	public void print(int initHour, int wakeUpMinutes) {	// ���� ��� �ð� ���
		initHour += (wakeUpMinutes / 60);
		System.out.println("Wake Up Time is... 0" + initHour + ":" + wakeUpMinutes + " A.M");
	}
}
