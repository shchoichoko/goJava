import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetPresentTime {
	// #14 Get Present Time. 22.04.14 . csh
	public static void main(String[] args) {
		Calendar k41_calt = Calendar.getInstance(); //Calendar 클래스를 사용하기 위해 객체를 생성.
		SimpleDateFormat k41_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");	//년도/월.일자  시간:분:초 를 뜻한다. 대소문자 주의!!
		//SimpleDateFormat 클래스의 date 형식의 객체를 자신이 원하는 방식을 지정할 수 있도록 해준다.
		System.out.printf("최종실행시간: %s\n", k41_sdt.format(k41_calt.getTime()));
		//getTime()메서드는 표준시에 따라 지정된 날짜의 시간에 해당하는 숫자 값을 반환한다.
		System.out.printf("**************************************************\n");
		
	}

}
