
public class TaxCalculate3 {
	// #8 Calculate Tax and Get receipt. 22.04.14 . csh
	public static int getNetprice(int k41_price, double k41_taxRate) {
		return (int)(k41_price/(1+k41_taxRate));
	}
	
	public static void main(String[] args) {
		String [] k41_item = {"자유시간" ,"초코파이", "새콤달콤", "자일리톨"};	// 구매할 간식 목록
		int[] k41_price = {5000, 2000, 1000, 3000};		//구매할 간식의 단가 
		int[] k41_amount = {1, 2, 5, 2};	//구매할 간식의 수량 
		double k41_taxRate = 0.1;		//세율은 10%
		int k41_totalSum = 0;	//지불할 금액
		System.out.printf("******************************************\n\n");
		System.out.printf("	        구매한 목록		\n\n");
		System.out.printf("  항목	    단가 \t수량	    합  계\n\n");
		for(int i = 0; i < k41_item.length; i++) {		//4개의 간식이라 0~3까지 i증가로 횟수를 맞춤.
			int k41_sum = k41_price[i] * k41_amount[i];		// 단가 * 수량 = 금액
			k41_totalSum += k41_sum;	
			System.out.printf("%.5s %7d \t%2d \t%9d\n", k41_item[i], k41_price[i], k41_amount[i], k41_sum);// 배열 순서가 일치하기 때문에 이렇게 활용 가능
		}		
		System.out.printf("\n******************************************\n");
		System.out.printf("지불 금액 :		%17d\n\n", k41_totalSum);
		int k41_netPrice = getNetprice(k41_totalSum, k41_taxRate);	// 위에 함수를 getNetprice 함수를 이용해, 세전 금액 계산
		int k41_tax = k41_totalSum - k41_netPrice;	// 세금 = 세후 금액 - 세전 금액
		System.out.printf(" 세  금  :	\t%17d\n", k41_tax);
		
	}

}
