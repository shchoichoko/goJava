import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt2 {

	public static void main(String[] args) {

		//다이소 물품
		String k41_itemName1 = "퓨어에어 비말차단용마스크(최고급형)";
		String k41_itemCode1 = "1031615";
		int k41_iPrice1 = 3000;
		int k41_amount1 = 1;
		String k41_itemName2 = "슬라이드식명찰(가로형)(100호)";
		String k41_itemCode2 = "11008152";
		int k41_iPrice2 = 1000;
		int k41_amount2 = 1;
		String k41_itemName3 = "매직흡착 인테리어후크(알루미늄타입)";
		String k41_itemCode3 = "1020800";
		int k41_iPrice3 = 1000;
		int k41_amount3 = 1;
		// 부가세 계산
		double k41_tax1 = getTax(k41_iPrice1);
		int k41_price1 = k41_iPrice1 - (int)k41_tax1;
		double k41_tax2 = getTax(k41_iPrice2);
		int k41_price2 = k41_iPrice2 - (int)k41_tax2;
		double k41_tax3 = getTax(k41_iPrice3);
		int k41_price3 = k41_iPrice3 - (int)k41_tax3;
		cutString(k41_itemName1);
		//콤마찍기
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		//텍스트
		System.out.printf("%23s\n","국민가게, 다이소");
		System.out.println("(주)아성다이소_분당서현점");
		System.out.printf("전화: 031-702-6016\n");
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표:박정부,신호섭 213-81-52063");
		System.out.println("매장:경기도 성남시 분당구 분당로53번길 11(서현");
		System.out.println("동)");
		System.out.println("================================================");
		System.out.printf("%27s\n","소비자중심경영(CCM) 인증기업");
		System.out.printf("%29s\n","ISO 9001 품질경영시스템 인증기업");
		System.out.println("================================================");
		System.out.printf("          교환/환불 14일(%s)이내,\n",getRefundTime());
		System.out.printf("(전자)영수증, 결제카드 지참 후 구입매장에서 가능\n");
		System.out.printf("       포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("         체크카드 취소 시 최대 7일 소요\n");
		System.out.println("================================================");
		System.out.printf("%.14s %11d %2d %6d\n",subStrBytes(k41_itemName1,26),k41_iPrice1, k41_amount1, k41_iPrice1 * k41_amount1);
		System.out.printf("[%s]\n",k41_itemCode1);
		System.out.printf("%.14s %13d %2d %6d\n",subStrBytes(k41_itemName2,26),k41_iPrice2, k41_amount2, k41_iPrice2 * k41_amount2);
		System.out.printf("[%s]\n",k41_itemCode2);
		System.out.printf("%.14s %11d %2d %6d\n",subStrBytes(k41_itemName3,26),k41_iPrice3, k41_amount3, k41_iPrice3 * k41_amount3);
		System.out.printf("[%s]\n",k41_itemCode3);
		System.out.printf("              과세합계%26s\n",k41_df.format(k41_price1 + k41_price2 + k41_price3));
		System.out.printf("              부가세%28s\n",k41_df.format(k41_tax1 + k41_tax2 + k41_tax3));
		System.out.println("------------------------------------------------");
		System.out.printf("판매합계%40s\n",k41_df.format(k41_iPrice1 + k41_iPrice2 + k41_iPrice3));
		System.out.println("================================================");
		System.out.printf("신용카드%40s\n",k41_df.format(k41_iPrice1 + k41_iPrice2 + k41_iPrice3));
		System.out.println("------------------------------------------------");
		System.out.printf("우리카드                        538720**********\n");
		System.out.printf("승인번호 %s %17s %s\n", "77982843(0)","승인금액",k41_df.format(k41_iPrice1 + k41_iPrice2 + k41_iPrice3));
		System.out.println("================================================");
		System.out.printf("%28s %s\n", getPresentTime(),"분당서현점");
		System.out.printf("상품 및 기타문의 : TEL)1522 - 4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("%32s\n","2112820610158231");
		System.out.println("------------------------------------------------");
		
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
	// 환불일자 구하기
	public static String getRefundTime() {
		Calendar k41_cal = Calendar.getInstance();
		k41_cal.add(Calendar.DATE, 14);
		SimpleDateFormat k41_time = new SimpleDateFormat("MM/dd");
		return k41_time.format(k41_cal.getTime());
	}
	
	//글자 자르기
	public static String cutString(String k41_a) {
		String cut = k41_a.substring(0,14);
		return cut;
	}
	//한글 바이트로 자르기
	public static String subStrBytes(String source, int cutLength) {
		if(!source.isEmpty()) {
			source = source.trim();
			if(source.getBytes().length <= cutLength) {
				return source;
			} else {
				StringBuffer sb = new StringBuffer(cutLength);
				int cnt = 0;
				for(char ch : source.toCharArray()) {
					cnt += String.valueOf(ch).getBytes().length;
					if(cnt > cutLength) break;
					sb.append(ch);
				}
				return sb.toString() + " ";
				
			}
			
		} else {
			return "";
		}
	}

}
