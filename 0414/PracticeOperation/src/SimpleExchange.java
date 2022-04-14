
public class SimpleExchange {
	// #9 Simple Exchange. 22.04.14 . csh
	public static void main(String[] args) {
		int k41_myWon = 1000000;	//환전할 원화 금액
		double k41_moneyEx = 1238.21;	//달러 환율
		double k41_commision = 0.003;	//환전 수수료
		int k41_usd = (int) (k41_myWon/k41_moneyEx);	//달러 = 원화를 달러 환율로 나눈뒤 정수로 형변환
		int k41_remain = (int) (k41_myWon-k41_usd*k41_moneyEx);		//환전하고 남은 돈 = 원화 - (달러 * 환율) 
		
		System.out.printf("***************************************\n");
		System.out.printf("*	수수료 없이 계산              *\n");	
		System.out.printf("총 한화환전 금액 :  %d원 => 미화: %d달러, 잔돈: %d원\n", k41_myWon, k41_usd, k41_remain);
		
		System.out.printf("***************************************\n");
		
	}

}
