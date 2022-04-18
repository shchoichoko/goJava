import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt3 {

	public static void main(String[] args) {
		// 품명
		String [] k41_itemName = {"초코파이","바나나우유","건포도","오렌지주스","초코에몽","자유시간","세척당근(1kg/봉)","냉동닭다리","노브랜드도시락김","월남쌈소스230g",
				"콘플레이크 500g","양파(1.8kg/망)","노브랜드믹스넛800g","파프리카(혼합)","강원 애호박","부드러운치즈252","햇브로콜리(2입/봉)","후레쉬센터 흙대파","남양 맛있는우유 1L","자일리톨레인보우껌",
				"모란봉소불고기","데톨핸드워시250ml(민감성피부용)","노브랜드 핫베이컨칩","펩시콜라(500ml*12/1Box)","사조고추참치100g*3","동원야채참치100g*3","재사용봉투20L","해태 후렌치파이초코맛","롯데크런키3번들102g","표고버섯(팩)"};
		// 단가
		int[] k41_price = {1000, 2500, 3300, 25000, 500, 750, 3280, 4990, 4580, 2680,
				3680,2780,9980,1980,2580,6600,4580,2680,4580,3500,
				9900,3600,1480,8500,2220,4480,660,2200,2400,3000};
		// 수량
		int[] k41_num = {2,4,1,1,10,5,1,2,1,1,
				1,1,1,2,2,1,1,1,2,1,
				1,1,1,1,1,1,1,1,1,2};
		// 면세유무. true면 과세, false면 면세
		boolean[] k41_taxfree = {true, true, false, true, true, true, false, false, true, true,
				true,false,true,false,false,true,false,false,true,true,
				false,true,true,true,true,true,false,true,true,false};
		//면세 합과 과세 합 출력을 위한 변수.
		int k41_taxExemption = 0; int k41_priceTotal = 0;
		double k41_tax = 0;
		//getTax(k41_iPrice1)
		//콤마찍기
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		//출력부분
		System.out.println("영수증 미지참시 교환/환불 불가");
		System.out.println("정상상품에 한함, 30일 이내(신선 7일)");
		System.out.println("*일부 브랜드매장 제외(매장 고지물참조)");
		System.out.println("교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.printf("[구매]%s %22s\n",getPresentTime(),"POS:0011-9861");
		System.out.println("---------------------------------------------");
		System.out.printf("   상 품 명            단 가   수량    금  액\n");
		System.out.println("---------------------------------------------");
		for(int k41_i = 0; k41_i < k41_itemName.length;k41_i++) {
			subStrBytes(k41_itemName[k41_i],26);
			if(k41_taxfree[k41_i] == false) {	// 면세유무 false면 *넣고 아니면 빈칸 넣기.
				System.out.printf(" * ");
			} else {
				System.out.printf("   ");
			}
			System.out.printf("%s %7s %3d %9s\n",k41_subStrByte(k41_itemName[k41_i],20), k41_df.format(k41_price[k41_i]), k41_num[k41_i], k41_df.format(k41_price[k41_i] * k41_num[k41_i]));
			if((k41_i+1)%5==0) {
				System.out.println("---------------------------------------------");
			}
			if(k41_taxfree[k41_i] == false) {
				k41_taxExemption += k41_price[k41_i];
			} else {
				k41_tax += getTax(k41_price[k41_i]);
				k41_priceTotal += k41_price[k41_i] - getTax(k41_price[k41_i]);
			}
			
		}
		System.out.printf("%25s %14d\n", "총 품목 수량", k41_price.length);
		System.out.printf("%26s %14s\n", "(*)면 세  물 품", k41_df.format(k41_taxExemption));
		System.out.printf("%26s %14s\n", "과 세  물 품", k41_df.format(k41_priceTotal));
		System.out.printf("%27s %14s\n", "부   가   세", k41_df.format((int)k41_tax));
		System.out.printf("%28s %14s\n", "합        계", k41_df.format(k41_taxExemption+k41_priceTotal+(int)k41_tax));
		System.out.printf("%11s %27s\n", "결 제 대 상 금 액", k41_df.format(k41_taxExemption+k41_priceTotal+(int)k41_tax));
		System.out.println("---------------------------------------------");
		System.out.printf("%14s %28s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%11s %18s %6s\n", "카드결제(IC)", "일시불 /",k41_df.format(k41_taxExemption+k41_priceTotal+(int)k41_tax) );
		System.out.println("---------------------------------------------");
		System.out.printf("%23s\n", "[신세계포인트 적립]");
		System.out.println("   홍*두 고객님의 포인트 현황입니다.");
		System.out.printf("%10s %17s %9d\n", "금회발생포인트", "9350**9995", 164);
		System.out.printf("%12s %18s %5s\n","누계(기용)포인트", "5,637(", "5,473)");
		System.out.printf("%20s\n","*신세계포인트 유효기간은 2년입니다.");
		System.out.println("---------------------------------------------");
		System.out.printf("%22s\n","구매금액기준 무료주차시간 자동부여");
		System.out.printf("%9s %30s\n","차량번호 :", "34저****" );
		System.out.printf("%9s %31s\n","입차시간 :", getPresentTime2() );
		System.out.println("---------------------------------------------");
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
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm");
			return k41_time.format(k41_cal.getTime());
		}
		// 초까지 나와있는 것
		public static String getPresentTime2() {
			Calendar k41_cal = Calendar.getInstance();
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
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
		   public static String k41_subStrByte(String k41_source, int k41_cutLength) {
		         if (!k41_source.isEmpty()) {
		            k41_source = k41_source.trim();// 공백 자르기
		            if (k41_source.getBytes().length < k41_cutLength) {
		               for (int k41_i = k41_cutLength - k41_source.getBytes().length; k41_i > 0; k41_i--) {
		                  k41_source += " ";
		               }
		               return k41_source;
		            } else {
		               StringBuffer k41_sb = new StringBuffer(k41_cutLength);
		               int k41_cnt = 0;
		               for (char k41_ch : k41_source.toCharArray()) {
		                  k41_cnt += String.valueOf(k41_ch).getBytes().length;
		                  if (k41_cnt > k41_cutLength)
		                     break;
		                  k41_sb.append(k41_ch);
		               }
		               
		               if(k41_sb.toString().getBytes().length == 19) {
		                  k41_sb.append(" ");
		               }
		               
		               return k41_sb.toString();
		            }
		         } else {
		            return "";
		         }
		      }
}
