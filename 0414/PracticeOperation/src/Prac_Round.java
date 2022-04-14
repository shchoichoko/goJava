
public class Prac_Round {

	public static void main(String[] args) {
		// #4 Operate round . 22.04.14 . csh
		int k41_ii = 12345;	//for operate round
		int k41_j = (k41_ii / 10) * 10;		// float (less than 10)
		System.out.printf("#4-1 : %d\n", k41_j);
		
		k41_ii = 12345;		
		k41_j = ((k41_ii+5)/10)*10;		// round (less than 10)
		System.out.printf("#4-2 : %d\n" , k41_j);
		
		k41_ii = 12344;
		k41_j = ((k41_ii+5)/10)*10;		// check to round (less than 10)
		System.out.printf("#4-2 : %d\n" , k41_j);
	
		
	}

}
