import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MethodReceipt3 {
	//#3 변수와 메서드3 22.04.20 최수혁
	static int k41_taxExemption = 0;	//면세 합을 저장해줄 변수.
	static int k41_priceTotal = 0;	//전체의 합계를 저장해줄 변수.
	static int k41_supPrice = 0;	//과세 물품의 합을 저장해줄 변수.
	static int k41_points = 5473;	// 원래 보유하고있던 적립포인트
	// 품명
	static String[] k41_itemName = { "LG냉장고", "바나나우유", "건포도", "오렌지주스", "초코에몽", "자유시간", "세척당근(1kg/봉)", "냉동닭다리", "노브랜드도시락김",
			"월남쌈소스230g", "콘플레이크 500g", "양파(1.8kg/망)", "노브랜드믹스넛800g", "파프리카(혼합)", "강원 애호박", "부드러운치즈252",
			"햇브로콜리(2입/봉)", "후레쉬센터 흙대파", "남양 맛있는우유 1L", "자일리톨레인보우껌", "모란봉소불고기", "데톨핸드워시250ml(민감성피부용)", "노브랜드 핫베이컨칩",
			"펩시콜라(500ml*12/1Box)", "사조고추참치100g*3", "동원야채참치100g*3", "재사용봉투20L", "해태 후렌치파이초코맛", "롯데크런키3번들102g",
			"표고버섯(팩)" };
	// 콤마찍기
	static DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
	
	public static void main(String[] args) {
		int itemCount = k41_itemName.length;	//총 항목 수
		titlePrint();	// 타이틀 출력 부분
		for(int k41_i = 0; k41_i < itemCount; k41_i++) {	
			itemPrint(k41_i);	//총 항목 수까지 반복하면서 품목,단가,수량,금액 등을 출력
		}
		totalPrint(getTax(),itemCount);	//합계 세액등을 인쇄
	}

	// 현재시각 구하기
	public static String timeStamp(int order) {	// 입력 받은 매개변수에 따라 원하는 방식으로 현재시각을 내보내는 함수
		Calendar k41_cal = Calendar.getInstance();	// 현재 시각을 받기위해 새로 객체 생성.
		String k41_getTime = "";	// 아래 조건문을 통해 현재 시각을 문자열로 저장한다.
		if(order == 1) {	// 매개 변수에 1을 입력 받으면 분까지만 보여주는 현재 시각을 내보낸다.
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY-MM-dd HH:mm");
			k41_getTime = k41_time.format(k41_cal.getTime());	
		} else if(order == 2) {//매개 변수에 3을 넣었을때 출력하는 형식에 2시간 이전 시간을 넣는다.(입차시간을 위한 식)
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			k41_cal.add(Calendar.HOUR, -2);
			k41_getTime = k41_time.format(k41_cal.getTime());	
		} else {
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYYMMdd");
			k41_getTime = k41_time.format(k41_cal.getTime());
		}
		return k41_getTime;	// 문자열을 리턴으로 내보낸다.
	}
	
	// 한글 자르고 공백 추가하는 함수
	public static String subStrByte(String k41_source, int k41_cutLength) {	//매개변수로 자를 문장과, 자르는 값을 받는다.
		if (!k41_source.isEmpty()) {	// 문자열에 아무것도 없지 않다면 아래 문장들을 수행한다.
			k41_source = k41_source.trim();// 문장에 있는 공백 제거
			if (k41_source.getBytes().length < k41_cutLength) { //자르는 값보다 길이가 짧다면, 아래 문장을 수행한다.
				for (int k41_i = k41_cutLength - k41_source.getBytes().length; k41_i > 0; k41_i--) {
					k41_source += " ";	//모자른 만큼 공백을 추가해준다.
				}
				return k41_source;	//문자열을 다시 리턴한다.
			} else {	// 자르는 값보다 길이가 짧지 않다면 아래 문장들을 수행한다.
				StringBuffer k41_sb = new StringBuffer(k41_cutLength);	// 문자열을 추가하거나 자르는 객체 생성.
				int k41_num = 0;	// 길이 비교를 위한 변수 선언.
				for (char k41_ch : k41_source.toCharArray()) {	// 문자열을 문자로 변환.
					k41_num += String.valueOf(k41_ch).getBytes().length;	//해당 문자의 바이트 길이를 k41_num에 넣어줌.
					if (k41_num > k41_cutLength)	// 매개변수로 넣은 길이보다 크다면 반복문 벗어남.
						break;
					k41_sb.append(k41_ch);	//문자열 끝에 문자를 추가한다.
				}
				if (k41_sb.toString().getBytes().length == k41_cutLength-1) { //문자열이 한글 크기 때문에 부족해서 한칸 부족할때, 
					//아래 문장을 수행한다.
					k41_sb.append(" ");	// 공백을 추가한다.
				}

				return k41_sb.toString();	//수정된 문자열을 리턴해준다.
			}
		} else {	// 문자열에 아무것도 없다면 아래 문장을 수행한다.
			return "";	//그대로 돌려준다.
		}
	}
	//영수증 맨 위쪽의 타이틀 출력
	public static void titlePrint() {
		System.out.printf("%31s\n","이마트 죽전점(031)888-1234");
		System.out.printf("%27s\n","206-86-50913 강희석");
		System.out.printf("%26s\n","용인 수지구 포은대로 552");
		System.out.println("영수증 미지참시 교환/환불 불가");
		System.out.println("정상상품에 한함, 30일 이내(신선 7일)");
		System.out.println("*일부 브랜드매장 제외(매장 고지물참조)");
		System.out.println("교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.println("");
		System.out.printf("[구매]%s %18s\n", timeStamp(1), "POS:0011-9861");
		System.out.println("-----------------------------------------");
		System.out.printf("  상 품 명        단 가    수량    금  액\n");
		System.out.println("-----------------------------------------");
	}
	
	public static void itemPrint(int k41_i) {

		// 단가
		int[] k41_price = { 1000000, 2500, 3300, 25000, 500, 750, 3280, 4990, 4580, 2680, 3680, 2780, 9980, 1980, 2580,
				6600, 4580, 2680, 4580, 3500, 9900, 3600, 1480, 8500, 2220, 4480, 660, 2200, 2400, 3000 };
		// 수량
		int[] k41_num = { 1, 4, 1, 1, 10, 5, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };
		// true면 과세, false면 면세
		boolean[] k41_TaxItems = { true, true, false, true, true, true, false, false, true, true, true, false, true,
				false, false, true, false, false, true, true, false, true, true, true, true, true, false, true, true,
				false };

				if (k41_TaxItems[k41_i] == false) { // 면세일때
					System.out.printf("%-2s", "*"); // 항목 앞에 * 출력
					k41_taxExemption += k41_price[k41_i] * k41_num[k41_i];
				} else { // 과세일때
					System.out.printf("%-2s", " "); // 빈칸 찍는 하는 부분.
				}
				System.out.printf("%s%10s%4d%10s\n", subStrByte(k41_itemName[k41_i], 15),
						// 제품명은 함수를 사용해 15바이트로 자르고, 단가, 수량, 금액은 형식에 맞게 출력
						k41_df.format(k41_price[k41_i]), k41_num[k41_i], k41_df.format(k41_price[k41_i] * k41_num[k41_i]));

				if ((k41_i + 1) % 5 == 0) { // 정수형 변수 i+1을 5로 나눈 나머지가 0이라면 (5개 마다)
					System.out.println("-----------------------------------------"); // 구분선 출력
				}
				
				k41_priceTotal += k41_price[k41_i] * k41_num[k41_i];	//과세 금액 합계
	}
	public static int getTax() {	//부가세 구하는 함수.
		int k41_tax = (k41_priceTotal - k41_taxExemption)/ 11;	
		double k41_tax_check = (k41_priceTotal - k41_taxExemption) / 11.0;
		if (k41_tax == k41_tax_check) {
		} else {// 값이 다를 때 부가세에 1을 더해줌.
			k41_tax = k41_tax + 1;
		}
		return k41_tax;
	}
	public static void totalPrint(int k41_tax, int itemCount) {
		k41_supPrice = k41_priceTotal - k41_tax - k41_taxExemption;
		System.out.println("");
		System.out.printf("%22s %13d\n", "총 품목 수량", itemCount);
		System.out.printf("%23s %13s\n", "(*)면 세  물 품", k41_df.format(k41_taxExemption));
		System.out.printf("%23s %13s\n", "과 세  물 품", k41_df.format(k41_supPrice));
		System.out.printf("%24s %13s\n", "부   가   세", k41_df.format(k41_tax));
		System.out.printf("%25s %13s\n", "합        계",
				k41_df.format(k41_priceTotal));
		System.out.printf("%11s %23s\n", "결 제 대 상 금 액",
				k41_df.format(k41_priceTotal));
		System.out.println("-----------------------------------------");
		System.out.printf("%s %27s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%s %14s %10s\n", "카드결제(IC)", "일시불 /",
				k41_df.format(k41_priceTotal));
		System.out.println("-----------------------------------------");
		System.out.printf("%20s\n", "[신세계포인트 적립]");
		System.out.println("홍*두 고객님의 포인트 현황입니다.");
		System.out.printf("%6s %17s %8s\n", "금회발생포인트", "9350**9995", k41_df.format((k41_priceTotal)/1000));
		System.out.printf("%8s %12s(%10s)\n", "누계(가용)포인트", k41_df.format(5473+(k41_priceTotal)/1000), 
				k41_df.format(k41_points));
		System.out.printf("%19s\n", "*신세계포인트 유효기간은 2년입니다.");
		System.out.println("-----------------------------------------");
		System.out.printf("%22s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s %29s\n", "차량번호 :", "34저****");
		System.out.printf("%s %30s\n", "입차시간 :", timeStamp(2));	// 현재시각에서 2시간 이전 시간을 출력.
		System.out.println("-----------------------------------------");
		System.out.printf("캐셔:084599 양00 %24s\n","1150");
		System.out.printf("%27s\n","|ㅣ|ㅣ|ㅣ|ㅣ|ㅣ|ㅣ|ㅣ|ㅣ|ㅣ|ㅣ|ㅣ");
		System.out.printf("%14s/00119861/00164980/31",timeStamp(4));
	}

}
