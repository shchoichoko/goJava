
public class TaxCalculate {
	// #6 세금 계산 22.04.14 . csh
	//세금 구하는 메소드
	public static int taxcal(int k41_val, int k41_rate) {
		int k41_ret;		// 더블 형식의 계산 값과 정수형의 계산값이 같다면 그대로 계산하고, 
		if((double)k41_val*(double)k41_rate/100.0 == k41_val * k41_rate / 100) {
			k41_ret = k41_val * k41_rate / 100;
		}
		else {	//계산값이 다르다면, 값에 1을 더한다.
			k41_ret = k41_val * k41_rate / 100 + 1;
		}
		return k41_ret;
	}
	
	public static void main(String[] args) {
		int k41_val = 271;	//세전 가격.
		int k41_rate = 5;	//세율은 5%이다.
		

		int k41_tax = taxcal(k41_val, k41_rate);	//세금 구하는 메소드
		
		System.out.printf("***********************************\n");
		System.out.printf("*            단순세금계산          *\n");
		System.out.printf("실제 세금계산: %f\n", k41_val*k41_rate/100.0);
		
		System.out.printf("세전 가격: %d 세금 : %d 세포함가격 : %d\n",k41_val,k41_tax,k41_val+k41_tax);
		System.out.printf("***********************************\n");
	}

}
