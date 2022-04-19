import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt3 {

	public static void main(String[] args) {
		// 품명
		String[] k41_itemName = { "초코파이", "바나나우유", "건포도", "오렌지주스", "초코에몽", "자유시간", "세척당근(1kg/봉)", "냉동닭다리", "노브랜드도시락김",
				"월남쌈소스230g", "콘플레이크 500g", "양파(1.8kg/망)", "노브랜드믹스넛800g", "파프리카(혼합)", "강원 애호박", "부드러운치즈252",
				"햇브로콜리(2입/봉)", "후레쉬센터 흙대파", "남양 맛있는우유 1L", "자일리톨레인보우껌", "모란봉소불고기", "데톨핸드워시250ml(민감성피부용)", "노브랜드 핫베이컨칩",
				"펩시콜라(500ml*12/1Box)", "사조고추참치100g*3", "동원야채참치100g*3", "재사용봉투20L", "해태 후렌치파이초코맛", "롯데크런키3번들102g",
				"표고버섯(팩)" };
		// 단가
		int[] k41_price = { 1000, 2500, 3300, 25000, 500, 750, 3280, 4990, 4580, 2680, 3680, 2780, 9980, 1980, 2580,
				6600, 4580, 2680, 4580, 3500, 9900, 3600, 1480, 8500, 2220, 4480, 660, 2200, 2400, 3000 };
		// 수량
		int[] k41_num = { 2, 4, 1, 1, 10, 5, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };
		// 면세유무. true면 과세, false면 면세
		boolean[] k41_taxfree = { true, true, false, true, true, true, false, false, true, true, true, false, true,
				false, false, true, false, false, true, true, false, true, true, true, true, true, false, true, true,
				false };
		// 면세 합과 과세 합 출력을 위한 변수.
		int k41_taxExemption = 0;
		int k41_priceTotal = 0;
		double k41_tax = 0;
		// getTax(k41_iPrice1)
		// 콤마찍기
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		// 출력부분
		System.out.println("영수증 미지참시 교환/환불 불가");
		System.out.println("정상상품에 한함, 30일 이내(신선 7일)");
		System.out.println("*일부 브랜드매장 제외(매장 고지물참조)");
		System.out.println("교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.printf("[구매]%s %22s\n", getPresentTime(1), "POS:0011-9861");
		System.out.println("---------------------------------------------");
		System.out.printf("   상 품 명            단 가   수량    금  액\n");
		System.out.println("---------------------------------------------");
		for (int k41_i = 0; k41_i < k41_itemName.length; k41_i++) {	// 품목 수만큼 반복하기.
			if (k41_taxfree[k41_i] == false) { // 면세유무 false면 앞에 *넣고 true라면 빈칸을 넣기.
				System.out.printf(" * ");
			} else {
				System.out.printf("   ");
			}	// 출력되는 문자열 길이를 20으로 고정시켜놓고, 순번대로 출력하기. DefimalFormat을 이용해 단가와 금액에 콤마를 적용한다. 중간에 수량도 출력. 
			System.out.printf("%s %7s %3d %9s\n", subStrByte(k41_itemName[k41_i], 20), k41_df.format(k41_price[k41_i]),
					k41_num[k41_i], k41_df.format(k41_price[k41_i] * k41_num[k41_i]));
			if ((k41_i + 1) % 5 == 0) {	// 품목이 많아서 5개씩 출력할 때마다 한줄씩 띄워준다.
				System.out.println("---------------------------------------------");
			}
			if (k41_taxfree[k41_i] == false) {	// 면세 금액만 따로 더해주는 식.
				k41_taxExemption += k41_price[k41_i];
			} else {	// 면세품목을 제외한 품목들의 부가세와 금액을 더해주는 식.
				k41_tax += getTax(k41_price[k41_i]);	// 부가세를 모두 k41_tax에 더해준다.
				k41_priceTotal += k41_price[k41_i] - getTax(k41_price[k41_i]);	//과세물품의 금액을 모두 k41_priceTotal에 더해준다.
			}

		}
		System.out.printf("%25s %14d\n", "총 품목 수량", k41_price.length);
		System.out.printf("%26s %14s\n", "(*)면 세  물 품", k41_df.format(k41_taxExemption));
		System.out.printf("%26s %14s\n", "과 세  물 품", k41_df.format(k41_priceTotal));
		System.out.printf("%27s %14s\n", "부   가   세", k41_df.format((int) k41_tax));
		System.out.printf("%28s %14s\n", "합        계",
				k41_df.format(k41_taxExemption + k41_priceTotal + (int) k41_tax));
		System.out.printf("%11s %27s\n", "결 제 대 상 금 액",
				k41_df.format(k41_taxExemption + k41_priceTotal + (int) k41_tax));
		System.out.println("---------------------------------------------");
		System.out.printf("%14s %28s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%11s %18s %6s\n", "카드결제(IC)", "일시불 /",
				k41_df.format(k41_taxExemption + k41_priceTotal + (int) k41_tax));
		System.out.println("---------------------------------------------");
		System.out.printf("%23s\n", "[신세계포인트 적립]");
		System.out.println("   홍*두 고객님의 포인트 현황입니다.");
		System.out.printf("%10s %17s %9d\n", "금회발생포인트", "9350**9995", 164);
		System.out.printf("%12s %18s %5s\n", "누계(기용)포인트", "5,637(", "5,473)");
		System.out.printf("%20s\n", "*신세계포인트 유효기간은 2년입니다.");
		System.out.println("---------------------------------------------");
		System.out.printf("%22s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%9s %30s\n", "차량번호 :", "34저****");
		System.out.printf("%9s %31s\n", "입차시간 :", getPresentTime(2));
		System.out.println("---------------------------------------------");
	}

	// 부가세 계산
	public static double getTax(int k41_iPrice) {	// 단가를 입력받아 부가세를 내보내는 함수
		double k41_dtax = 0;	//소수점 계산을 위해 더블형으로 선언 및 초기화.
		k41_dtax = k41_iPrice / 11.0;	// 단가 / 11 = 부가세
		if (k41_iPrice / 11.0 != k41_iPrice / 11) {
			k41_dtax = (int) k41_dtax + 1;	//형변환으로 생긴 오차로 값이 다를 때, 부가세에 +1을 한다.
		}
		return k41_dtax;	// 구한 부가세를 리턴해준다.
	}

	// 현재시각 구하기
	public static String getPresentTime(int order) {	// 입력 받은 매개변수에 따라 원하는 방식으로 현재시각을 내보내는 함수
		Calendar k41_cal = Calendar.getInstance();	// 현재 시각을 받기위해 새로 객체 생성.
		String k41_getTime = "";	// 아래 조건문을 통해 현재 시각을 문자열로 저장한다.
		if(order == 1) {	// 매개 변수에 1을 입력 받으면 분까지만 보여주는 현재 시각을 내보낸다.
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm");
			k41_getTime = k41_time.format(k41_cal.getTime());	
		}
		else {	//매개 변수에 1을 제외한 수를 입력 받으면 초까지 나오는 현재 시각을 내보낸다.
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
			k41_getTime = k41_time.format(k41_cal.getTime());
		}
		return k41_getTime;	// 문자열을 리턴으로 내보낸다.
	}

	// 초까지 나와있는 것

	// 글자 자르기
	public static String cutString(String k41_a) {
		String cut = k41_a.substring(0, 14);
		return cut;
	}
	// 한글 바이트로 자르기
	public static String subStrByte(String k41_source, int k41_cutLength) {	//매개변수로 자를 문장과, 자르는 값을 받는다.
		if (!k41_source.isEmpty()) {	// 문자열에 아무것도 없지 않다면 아래 문장들을 수행한다.
			k41_source = k41_source.trim();// 문장에 있는 공백 제거
			if (k41_source.getBytes().length < k41_cutLength) { //자르는 값보다 길이가 짧다면, 아래 문장을 수행한다.
				for (int k41_i = k41_cutLength - k41_source.getBytes().length; k41_i > 0; k41_i--) {
					k41_source += " ";	//모자른 만큼 공백을 추가해준다.
				}
				return k41_source;	//문자열을 다시 리턴한다.
			} else {	// 자르는 값보다 길이가 짧지 않다면 아래 문장들을 수행한다.
				StringBuffer k41_sb = new StringBuffer(k41_cutLength);	// 문자열을 추가하거나 자르는 클래스의 객체 생성.
				int k41_cnt = 0;	// 
				for (char k41_ch : k41_source.toCharArray()) {
					k41_cnt += String.valueOf(k41_ch).getBytes().length;
					if (k41_cnt > k41_cutLength)
						break;
					k41_sb.append(k41_ch);
				}
				if (k41_sb.toString().getBytes().length == k41_cutLength-1) { //문자열이 한글 크기 때문에 부족해서 한칸 부족할때, 아래 문장을 수행한다.
					k41_sb.append(" ");	// 공백을 추가한다.
				}

				return k41_sb.toString();	//수정된 문자열을 리턴해준다.
			}
		} else {	// 문자열에 아무것도 없다면 아래 문장을 수행한다.
			return "";	//그대로 돌려준다.
		}
	}
}
