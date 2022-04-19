import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt2 {

	public static void main(String[] args) {

		// 다이소 물품	
		//품목, 코드, 단가, 수량 입력
		String k41_itemName1 = "라피네야채핸드&네일크림50g에델바이스";
		String k41_itemCode1 = "1031235";
		int k41_iPrice1 = 3000;
		int k41_amount1 = 1;
		String k41_itemName2 = "슬라이드식명찰(가로형) (100호)";
		String k41_itemCode2 = "11008152";
		int k41_iPrice2 = 1000;
		int k41_amount2 = 1;
		String k41_itemName3 = "매직흡착 인테리어후크(알루미늄타입)";
		String k41_itemCode3 = "1020800";
		int k41_iPrice3 = 1000;
		int k41_amount3 = 1;
		int k41_totalTax = 0; int k41_totalPrice = 0; int k41_supPrice = 0;
		// 부가세 합계, 단가 합계, 과세합계를 위한 변수를 선언하고 초기화 해준다.
		// 부가세 계산
		k41_totalPrice = (k41_iPrice1*k41_amount1)+(k41_iPrice2*k41_amount2)+(k41_iPrice3*k41_amount3); // 단가 합계를 구해준다.
		k41_totalTax = k41_totalPrice/ 11;	//총 부가세를 구해준다.
		double k41_tax_check = k41_totalPrice/ 11.0;	// 더블형으로도 총 부가세를 구한다.
		if (k41_totalTax == k41_tax_check) {
		} else {	// 정수형과 더블형의 값이 다르다면 부가세에 1을 더해준다.
			k41_totalTax = k41_totalTax + 1;
		}
		k41_supPrice = k41_totalPrice - k41_totalTax;	// 총 합계에서 부가세 합을 빼서 과세합계를 구한다.
		// 콤마찍기
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		// 텍스트
		System.out.printf("%25s\n", "\"국민가게, 다이소\"");
		System.out.println("(주)아성다이소_분당서현점");
		System.out.printf("전화:031-702-6016\n");
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표:박정부,신호섭 213-81-52063");
		System.out.println("매장:경기도 성남시 분당구 분당로53번길 11 (서현");
		System.out.println("동)");
		System.out.println("================================================");
		System.out.printf("%27s\n", "소비자중심경영(CCM) 인증기업");
		System.out.printf("%29s\n", "ISO 9001 품질경영시스템 인증기업");
		System.out.println("================================================");
		System.out.printf("          교환/환불 14일(%s)이내,\n", getPresentTime(2));
		//매개변수에 2를 넣어 현재시각에 14일을 더한 날짜를 출력한다.
		System.out.printf("(전자)영수증, 결제카드 지참 후 구입매장에서 가능\n");
		System.out.printf("       포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("         체크카드 취소 시 최대 7일 소요\n");
		System.out.println("================================================");
		System.out.printf("[%s] %34s\n", "POS 1058231", getPresentTime(1)); //매개변수에 1을 넣어 현재 시각을 출력한다.
		System.out.println("================================================");
		System.out.printf("%s %8s %2d %9s\n", subStrByte(k41_itemName1, 26), k41_df.format(k41_iPrice1), k41_amount1,
				k41_df.format(k41_iPrice1 * k41_amount1)); // 글자를 길이 최대 26에서 자르고, 단가, 수량 , 합한 금액을 출력한다.
		System.out.printf("[%s]\n", k41_itemCode1);
		System.out.printf("%s %8s %2d %9s\n", subStrByte(k41_itemName2, 26), k41_df.format(k41_iPrice2), k41_amount2,
				k41_df.format(k41_iPrice2 * k41_amount2)); // 글자를 길이 최대 26에서 자르고, 단가, 수량 , 합한 금액을 출력한다.
		System.out.printf("[%s]\n", k41_itemCode2);
		System.out.printf("%s %8s %2d %9s\n", subStrByte(k41_itemName3, 26), k41_df.format(k41_iPrice3), k41_amount3,
				k41_df.format(k41_iPrice3 * k41_amount3)); // 글자를 길이 최대 26에서 자르고, 단가, 수량 , 합한 금액을 출력한다.
		System.out.printf("[%s]\n", k41_itemCode3);
		System.out.printf("              과세합계%26s\n", k41_df.format(k41_supPrice)); //품목 3개의 공급가를 다 합쳐서 출력한다.
		System.out.printf("                부가세%26s\n", k41_df.format(k41_totalTax));	//부가세를 다 합쳐서 출력한다.
		System.out.println("------------------------------------------------");
		System.out.printf("판매합계%40s\n", k41_df.format(k41_totalPrice)); 
		System.out.println("================================================");
		System.out.printf("신용카드%40s\n", k41_df.format(k41_totalPrice));
		System.out.println("------------------------------------------------");
		System.out.printf("우리카드                        538720**********\n");
		System.out.printf("승인번호 %s %17s %5s\n", "77982843(0)", "승인금액",
				k41_df.format(k41_totalPrice));
		System.out.println("================================================");
		System.out.printf("%28s %s\n", getPresentTime(1), "분당서현점");	//매개변수에 1을 넣어 현재 시각을 출력한다.
		System.out.printf("상품 및 기타문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("%32s\n", "2112820610158231");
		System.out.println("------------------------------------------------");
		System.out.printf("  ◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서\n");
		System.out.printf("    회원가입 후 다양한 혜택을 누려보세요! ◈");

	}

	// 현재시각 구하는 함수. 조건에 따라 출력하는 형식이 바뀜.
	public static String getPresentTime(int order) {
		Calendar k41_cal = Calendar.getInstance();	// 현재 시각을 받기위해 새로 객체 생성.
		String k41_getTime = "";	// 아래 조건문을 통해 현재 시각을 문자열로 저장한다.
		if(order == 1) {	//
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");	// 현재 시각 출력하는 방식을 정해준다.
			k41_getTime = k41_time.format(k41_cal.getTime());	//현재 시각을 얻어서 문자열에 저장한다.
		} else if(order == 2) {// 매개변수 값이 1이 아닐 경우 14일을 더하고 "MM/dd" 형식으로 시각을 리턴해준다. 
			k41_cal.add(Calendar.DATE, 14);	// 현재 시각에 14일을 더해주는 식.
			SimpleDateFormat k41_time = new SimpleDateFormat("MM월dd일");	// 형식을 "MM/dd"로 정해준다.
			k41_getTime = k41_time.format(k41_cal.getTime());	//현재 시각을 얻어서 문자열에 저장한다.( 날짜는 위에서 14일 더해줌)
		} 
		return k41_getTime;	//조건에 따라 얻은 문자열을 내보낸다.
	}

	// 한글 자르고 공백 추가하는 함수
	public static String subStrByte(String k41_source, int k41_cutLength) { // 매개변수로 자를 문장과, 자르는 값을 받는다.
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
				if (k41_sb.toString().getBytes().length == k41_cutLength-1) { 
					//문자열이 한글 크기 때문에 부족해서 한칸 부족할때, 아래 문장을 수행한다.
					k41_sb.append(" ");	// 공백을 추가한다.
				}

				return k41_sb.toString();	//수정된 문자열을 리턴해준다.
			}
		} else {	// 문자열에 아무것도 없다면 아래 문장을 수행한다.
			return "";	//그대로 돌려준다.
		}
	}

}
