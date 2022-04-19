import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt {

	public static void main(String[] args) {
		// 부가세 계산
		int k41_iPrice = 33000;
		int k41_tax = k41_iPrice/ 11;	// 단가를 11로 나누어 부가세를 구한다.
		double k41_tax_check = k41_iPrice/ 11.0;	// 더블형으로도 부가세를 구한다.
		if (k41_tax == k41_tax_check) {
		} else {	// 정수형과 더블형의 계산 결과가 다르다면 부가세에 1을 더해준다.
			k41_tax = k41_tax + 1;
		}
		int k41_price = k41_iPrice-k41_tax; //단가에서 부가세를 빼서 금액을 구한다.
		//콤마찍기
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		//텍스트
		System.out.println("신용승인");
		System.out.printf("단말기 : 2N68665898 %21s\n", "전표번호 : 041218");
		System.out.println("가맹점 : 한양김치찌개");
		System.out.println("주  소 : 경기 성남시 분당구 황새울로351번길10");
		System.out.println("1층");
		System.out.println("대표자 : 유창신");
		System.out.printf("사업자 : 752-53-00558 %23s\n", "TEL : 7055695");
		System.out.println("---------------------------------------------");
		System.out.printf("금  액%35s 원\n",k41_df.format(k41_price));
		System.out.printf("부가세%35s 원\n",k41_df.format(k41_tax));
		System.out.printf("합  계%35s 원\n",k41_df.format(k41_iPrice));
		System.out.println("---------------------------------------------");
		System.out.println("우리카드");
		System.out.printf("카드번호 : 5387-20**-****-4613(S)      일시불\n");
		System.out.printf("거래일시 : %s\n", getPresentTime());	//현재 시각을 출력
		System.out.println("승인번호 : 70404427");
		System.out.println("거래번호 : 357734873739");
		System.out.printf("매입 : 비씨카드사       가맹 : 720068568\n");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.println("---------------------------------------------");
		System.out.printf(" %24s","* 감사합니다 *\n");
		System.out.printf(" %42s","표준V2.08_20200212");
	}
	// 현재시각 구하기
	public static String getPresentTime() {
		Calendar k41_cal = Calendar.getInstance();	
		// 현재 시각을 받기위해 새로 객체 생성.
		SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");	
		// 이 형태로 현재시각을 리턴하도록 지정한다.
		return k41_time.format(k41_cal.getTime());	
		// 현재 시각을 저장한 문자열을 리턴해준다.
	}
}
