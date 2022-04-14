
public class TaxCalculate2 {
	// #7 Calculate Tax. 22.04.14 . csh
	public static int netprice(int k41_price, double k41_taxRate ) {
		return (int)(k41_price / (1+k41_taxRate));	//세전 가격 구하기. 세전 가격 = 소비자 가격 / (1+세율)
	}
	
	public static void main(String[] args) {
		int k41_price = 1234; //소비자가격
		double k41_taxRate = 0.1;	//부가세10%
		
		int k41_netprice = netprice(k41_price, k41_taxRate);	//세전 가격 구하는 메서드 사용.
		int k41_tax = k41_price - k41_netprice;	// 세금 = 세후가격 - 세전 가격
		
		System.out.printf("******************************************************\n");
		System.out.printf("*	소비자가, 세전가격, 세금 계산                *\n");
		System.out.printf("소비자가격 : %d, 세전가격 : %d, 세금: %d\n", k41_price, k41_netprice, k41_tax);
		System.out.printf("******************************************************\n");
		
	}

}
