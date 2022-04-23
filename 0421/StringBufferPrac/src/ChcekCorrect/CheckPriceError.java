package ChcekCorrect;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CheckPriceError {
	
	public static void main(String[] args) {

		String[] k41_OneRec = {
				"01   LG냉장고                  100,000   1  105,000",
				"02   바나나우유                  2,500   4   19,000",
				"03*  건포도                      3,300   1    3,300",
				"04   오렌지주스                 25,000   1   25,000",
				"05   초코에몽                      500  10    5,000",
				"06   자유시간                      750   5    3,750",
				"07*  세척당근(1kg/봉)            3,280   1    3,280",
				"08*  냉동닭다리                  4,990   2    9,980",
				"09   노브랜드도시락김            4,580   1    4,580",
				"10   월남쌈소스230g              2,680   1    2,680",
				"11   콘플레이크 500g             3,680   1    3,680",
				"12*  양파(1.8kg/망)              2,780   1    2,780",
				"13   노브랜드믹스넛800g          9,980   1    9,980",
				"14*  파프리카(혼합)              1,980   2   15,960",
				"15*  강원 애호박                 2,580   2    5,160",
				"16   부드러운치즈252             6,600   1    6,600",
				"17*  햇브로콜리(2입/봉)          4,580   1    4,580",
				"18*  후레쉬센터 흙대파           2,680   1    2,680",
				"19   남양 맛있는우유 1L          4,580   2    9,160",
				"20   자일리톨레인보우껌          3,500   1    3,500",
				"21*  모란봉소불고기              9,900   1    9,900",
				"22   데톨핸드워시250ml(민감성    3,600   1    3,600",
				"23   노브랜드 핫베이컨칩         1,480   1    1,480",
				"24   펩시콜라(500ml*12/1Box)     8,500   1  155,500",
				"25   사조고추참치100g*3          2,220   1    2,220",
				"26   동원야채참치100g*3          4,480   1    4,480",
				"27*  재사용봉투20L                 660   1      660",
				"28   해태 후렌치파이초코맛       2,200   1    2,200",
				"29   롯데크런키3번들102g         2,400   1    2,400",
				"30*  표고버섯(팩)                3,000   2    6,000"
				
		};
		List<Integer> k41_wrongNum = new ArrayList<Integer>();	
		//오류 발생마다 그 지점을 파악하기 위한 변수
		for (int k41_i = 0; k41_i < k41_OneRec.length; k41_i++) {
			//오류를 파악하기 위한 for문
			System.out.println(k41_OneRec[k41_i]);
			if(getTotalPrice(k41_OneRec[k41_i]) != (getPrice(k41_OneRec[k41_i])*getEA(k41_OneRec[k41_i]))){
				k41_wrongNum.add(k41_i);	
				//합계 금액과 실제 단가*수량의 합계 금액과 차이가 있을경우 그 순번을 저장.
			}
		}
		for(int k41_i = 0; k41_i < k41_wrongNum.size(); k41_i++) {
			//오류가 발생한 문장과 합계 금액 수정된 문장 출력.
			//오류 발생한 건수에 따라 반복 수 조정.
			System.out.println("***********************************************************");	
			System.out.printf("오류[%s]\n",k41_OneRec[k41_wrongNum.get(k41_i)]);
			String k41_fixed = fixTotalPrice(k41_OneRec[k41_wrongNum.get(k41_i)],
					(getPrice(k41_OneRec[k41_i])*getEA(k41_OneRec[k41_i])));
			// 수정된 문자열
			System.out.printf("수정[%s]\n",k41_fixed);
			System.out.println("***********************************************************");	
		}
	}
	//문자열에서 단가 부분만 빼오고, 정수형으로 바꾼 값을 반환해주는 함수.
	public static int getPrice(String k41_inputString) {
		//한 문장 byte크기는 51. String(k41_inputString.getBytes(),자르기 시작할 바이트 순번,자를 바이트 양)
		String k41_price = new String(k41_inputString.getBytes(),29,9);	//30번째부터 9byte만큼 자르기.
		k41_price = k41_price.trim().replaceAll(",", ""); //콤마를 제거해준다.
		int k41_intPrice = Integer.parseInt(k41_price); // 문자열을 정수형으로 변환.
		return k41_intPrice;
	}
	//문자열에서 수량 부분만 빼오고, 정수형으로 바꾼 값을 반환해주는 함수.
	public static int getEA(String k41_inputString) {
		//한 문장 byte크기는 51. String(k41_inputString.getBytes(),자르기 시작할 바이트 순번,자를 바이트 양)
		String k41_ea = new String(k41_inputString.getBytes(),38,4);	//39번째부터 4byte만큼 자르기.
		k41_ea = k41_ea.trim().replaceAll(",", "");//콤마를 제거해준다.
		int k41_intEA = Integer.parseInt(k41_ea);	// 문자열을 정수형으로 변환.
		return k41_intEA;
	}
	//문자열에서 합계 금액 부분만 빼오고, 정수형으로 바꾼 값을 반환해주는 함수.
	public static int getTotalPrice(String k41_inputString) {
		//한 문장 byte크기는 51임. String(k41_inputString.getBytes(),자르기 시작할 바이트 순번,자를 바이트 양)
		String k41_Totalprice = new String(k41_inputString.getBytes(),42,9);
		k41_Totalprice = k41_Totalprice.trim().replaceAll(",", ""); //콤마를 제거해준다.
		int k41_intTotalPrice = Integer.parseInt(k41_Totalprice); // 문자열을 정수형으로 변환.
		return k41_intTotalPrice;
	}
	//오류 문장과 수정할 금액을 매개변수로 받아서 콤마 추가후 문자열로 바꿔서 반환하는 함수.
	public static String fixTotalPrice(String k41_inputString,int k41_fixedPrice) {
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###");
		//콤마를 다시 추가하기 위해 객체 선언.
		String k41_Totalprice = new String(k41_inputString.getBytes(),0,42);
		// 합계 금액 부분을 제외한 문자열만 뽑아냄.
		String k41_perfectVal = k41_df.format(k41_fixedPrice);	
		// k41_perfectVal : 합계금액이 수정된 문장을 저장할 변수.
		// 매개변수로 입력받은 수정된 금액에 콤마를 찍어 문자열로 변환.
		int k41_priceLength = k41_df.format(k41_fixedPrice).getBytes().length;
		// 출력시 줄이 흐트러지지 않도록 우선 현재 바이트 크기를 구해서 저장한 변수.
		String k41_addBlank = "";	// 모자란 바이트 크기를 채워넣기 위한 공백 저장용 변수.
		if(k41_df.format(k41_fixedPrice).getBytes().length < 9) {
			//바이트 크기가 9보다 작을 경우 공백을 넣어주는 식
			for(int k41_j = 0; k41_j <9-k41_priceLength; k41_j++ ) {
				k41_addBlank += " ";
			}
			k41_perfectVal = k41_addBlank + k41_perfectVal;
			// 공백을 앞에다 넣어줘야 하기 때문에 공백 변수를 앞쪽에 두고 더함.
		}
		return k41_Totalprice+k41_perfectVal;	// 크기를 9바이트로 맞춰서 수정된 값을 반환해줌.
	}
}
