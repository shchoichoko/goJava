
public class Main {
	public static void main(String[] args) {
		int wakeUpTime;
		Main main = new Main();
		wakeUpTime = main.getWakeUpTime();
		main.print(6, wakeUpTime);	// 처음 기상 시각 6 과 기상 분수를 함수에 넣기.
		
	}	
	
	public int getWakeUpTime() {	// 기상 분수를 구하는 함수
		
		int minutes[] = new int[5];
		int wakeUpMinutes = 0;
		for (int i = 5; i < 151; i = i + 10) {	// 철수는 10분 간격으로 M5분에 맞춰서 일어남.

			for (int j = 10; j < 177; j = j + 11) {	
				// 버스 정류장 버스 도착 시작 시간이 10분부터 11분 간격
				if (0 == Math.abs(j - i - 3)) {	
					minutes[0] = i;				
				}
			}
		}
		wakeUpMinutes = minutes[0];
		if (wakeUpMinutes > 60) {
				//초과한 분만큼 나눈 몫을 시간에 더해주기
			wakeUpMinutes -= 60;
		}
		
		return wakeUpMinutes;
	}
	
	public void print(int initHour, int wakeUpMinutes) {	// 최종 기상 시각 출력
		initHour += (wakeUpMinutes / 60);
		System.out.println("Wake Up Time is... 0" + initHour + ":" + wakeUpMinutes + " A.M");
	}
}
