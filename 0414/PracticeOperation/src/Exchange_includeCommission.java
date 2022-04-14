import java.text.DecimalFormat;

public class Exchange_includeCommission {
	// #10 Exchange_includeCommission. 22.04.14 . csh
		public static void main(String[] args) {
			int k41_myWon = 1000000;	//환전할 원화 금액
			double k41_moneyEx = 1238.21;	//달러 환율
			double k41_commission = 0.003;	//환전 수수료
			int k41_usd = (int) (k41_myWon/k41_moneyEx);	//달러 = 원화를 달러 환율로 나눈뒤 정수로 형변환
			int k41_remain = (int) (k41_myWon-k41_usd*k41_moneyEx);		//환전하고 남은 돈 = 원화 - (달러 * 환율) 
			
			System.out.printf("***************************************\n");
			System.out.printf("*	수수료 없이 계산              *\n");	
			System.out.printf("총 한화환전 금액 :  %d원 => 미화: %d달러, 잔돈: %d원\n", k41_myWon, k41_usd, k41_remain);
			
			System.out.printf("***************************************\n");
			
			double k41_comPerOne = k41_moneyEx * k41_commission;	// 원화 수수료율 = 달러 환율 * 환전 수수료
			
			double k41_totalCom = k41_usd * k41_comPerOne;		// 수수료 = 달러 * 원화 수수료율
			System.out.printf("***************************************\n");
			System.out.printf("*	수수료 계산	              *\n");
			System.out.printf("총 수수료: %f원 =>  미화: %d달러, 달러당 수수료: %f원\n", k41_totalCom, k41_usd, k41_comPerOne);
			System.out.printf("***************************************\n");
			
			int k41_i_totalCom = 0;
			if(k41_totalCom != (double)((int)k41_totalCom)) {	//(int)로 형변환 과정을 거쳐서, 소수점 부분을 버린다.
				k41_i_totalCom = (int)k41_totalCom + 1;
			} else {	// 소수점 버린 totalCom과 기존 totalCom 값이 다르다면 +1달러한뒤 정수로 형변환
				k41_i_totalCom = (int)k41_totalCom;
			}	// 소수점 버린 금액과 일치한다면 정수로 형변환해서 값 저장.
			
			System.out.printf("***************************************\n");
			System.out.printf("*	수수료 적용환전	              *\n");
			System.out.printf("총 수수료: %d원 =>  미화: %d달러, 달러당 수수료: %f원\n", k41_i_totalCom, k41_usd, k41_comPerOne);
			k41_remain = (int) (k41_myWon - k41_usd * k41_moneyEx - k41_i_totalCom);	//잔돈 = 환전할금액 - 달러*달러환율 - 수수료
			System.out.printf("총 한화환전금액: %d원=> 미화: %d달러, 수수료징구:%d원 잔돈: %d원\n", k41_myWon, k41_usd, k41_i_totalCom, k41_remain);
			System.out.printf("***************************************\n");
			
			k41_usd = (int) (k41_myWon/(k41_moneyEx +k41_comPerOne));	//환전 달러
			k41_totalCom = k41_usd * k41_comPerOne+1;	// 총 수수료
			
			if(k41_totalCom != (double)((int)k41_totalCom)) {	// (int)로 형변환 과정을 거쳐서, 소수점 부분을 버린다.
				k41_i_totalCom = (int)k41_totalCom + 1;	//소수점 금액 버린 수수료 값과 수수료 값이 다르다면 +1달러
			} else {
				k41_i_totalCom = (int)k41_totalCom;	//소수점 금액 버린 수수료 값이 같다면,k41_i_totalCom에 수수료 값을 저장.
			}
			System.out.printf("***************************************\n");
			System.out.printf("*	(정확한)수수료 적용환전	      *\n");
			System.out.printf("총 수수료: %d원=> 미화: %d달러, 달러당 수수료: %f원\n", k41_i_totalCom, k41_usd, k41_comPerOne);
			
			k41_remain = (int) (k41_myWon-k41_usd * k41_moneyEx - k41_i_totalCom);	// 정확한 잔돈 = 환전할금액 - (달러*환율) - 원화수수료
			System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료징구:%d원 잔돈: %d원\n", k41_myWon, k41_usd, k41_i_totalCom, k41_remain);
			System.out.printf("***************************************\n");
			
			// #13 Use DecimalFormat. 22.04.14 . csh
			DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
			// 콤마 찍을 수 있게 만들어 주는 DecimalFomat 클래스 사용
			System.out.printf("***************************************\n");
			System.out.printf("*	콤마찍기, 날짜 적용	      *\n");
			System.out.printf("총 수수료: %s원=> 미화: %s달러, 달러당 수수료: %f원\n",
					k41_df.format(k41_i_totalCom),k41_df.format(k41_usd),
					k41_comPerOne);
			k41_remain = (int) (k41_myWon - k41_usd * k41_moneyEx - k41_i_totalCom);
			System.out.printf("총 한화환전금액: %s원=> 미화: %s달러, 수수료징구: %s원 잔돈: %s원\n", 
					k41_df.format(k41_myWon),k41_df.format(k41_usd),
					k41_df.format(k41_i_totalCom),k41_df.format(k41_remain));
			
		}

}
