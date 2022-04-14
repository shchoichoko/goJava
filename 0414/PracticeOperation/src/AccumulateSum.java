
public class AccumulateSum {

	public static void main(String[] args) {
		// #2 Accumulate Sum . 22.04.14 . csh
		int k41_sum = 0; // for addition variable
		for(int i = 1; i < 101; i++) {
			k41_sum += i;
		}
		System.out.printf("#2 : %d\n", k41_sum);	// Accumulate Value
		System.out.printf("#2-2 : %d\n", k41_sum/100); // Average Value
		
		int [] k41_v = {1, 2, 3 ,4 ,5};	// Array declare
		int k41_vSum = 0;
		
		for(int k41_i = 0; k41_i < k41_v.length; k41_i++) {	//add array values
			k41_vSum += k41_v[k41_i];
		}
		
		System.out.printf("#2-3 : %d\n", k41_vSum);
		
	}

}
