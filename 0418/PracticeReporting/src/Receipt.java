import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt {

	public static void main(String[] args) {
		// 부가세 계산
		int k41_iPrice = 28320;
		double k41_tax = getTax(k41_iPrice);
		int k41_price = k41_iPrice-(int)k41_tax;
		//콤마찍기
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		//텍스트
		System.out.println("신용승인");
		System.out.printf("단말기 : 2N68665898 %16s\n", "전표번호 : 041218");
		System.out.println("가맹점 : 한양김치찌개");
		System.out.println("주소 : 경기 성남시 분당구 황새울로351번길 10");
		System.out.println("1층");
		System.out.println("대표자 : 유창신");
		System.out.printf("사업자 : 752-53-00558 %22s\n", "TEL : 7055695");
		System.out.println("--------------------------------------------");
		System.out.printf("금  액%34s  원\n",k41_df.format(k41_price));
		System.out.printf("부가세%34s  원\n",k41_df.format(k41_tax));
		System.out.printf("합  계%34s  원\n",k41_df.format(k41_iPrice));
		System.out.println("--------------------------------------------");
		System.out.println("우리카드");
		System.out.printf("카드번호 : 5387-20**-****-4613(S)      일시불\n");
		System.out.printf("거래일시 : %s\n", getPresentTime());
		System.out.println("승인번호 : 70404427");
		System.out.println("거래번호 : 357734873739");
		System.out.printf("매입 : 비씨카드사     가맹 : 720068568\n");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544 - 4700\n");
		System.out.println("--------------------------------------------\n");
		System.out.printf(" %24s","* 감사합니다 *\n");
		System.out.printf(" %41s","표준V2.08_20200212");
		
		
	}
	//부가세 계산
	public static double getTax(int k41_iPrice) {
		double k41_dtax = 0;
		k41_dtax = k41_iPrice/11.0; 
		if(k41_iPrice/11.0 != k41_iPrice/11) {
			k41_dtax = (int)k41_dtax+1;
		}
		return k41_dtax;
	}
	// 현재시각 구하기
	public static String getPresentTime() {
		Calendar k41_cal = Calendar.getInstance();
		SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		return k41_time.format(k41_cal.getTime());
	}
}
