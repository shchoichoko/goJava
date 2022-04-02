
public class Test {

	public static void main(String[] args) {

		int bTime = 610; // 첫 버스가 정류장에 도착한 시간

		bestTimeCal(bTime);
	}
	
	public static void bestTimeCal (int time) {
		
		do {
			if (time % 10 == 3 || time % 10 == 8) {// 매 N시 5분 마다 일어나므로 정류장 까지의 거리 3분 더하면
				break; 								// 3분 혹은 8분에 도착하는 버스면 대기 없이 탑승
			}

			time += 11;// 버스의 배차 간격

			if (time % 100 >= 60) {
				time += 40; // 60분이 넘어가면 40을 더해 다음 시간으로 넘김 ex) 667 =>707
			}
		} while (time <= 830);

		System.out.println("철수가 " + (time - 3) / 100 + " 시 " + (time - 3) % 100 + " 분에 일어나면 대기 없이 버스를 탈수 있음.");
	}
}