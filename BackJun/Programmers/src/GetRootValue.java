
public class GetRootValue {

	public static void main(String[] args) {
		
		System.out.println(solution(9L));
		
	}
	
    public static long solution(long n) {
        long answer = 0;
        for(int i = 0; i * i <= n; i++) {
        	if(i*i==n) {
        		answer = (i+1)*(i+1);
        	} else {
        		answer = -1;
        	}
        }
            
        return answer;
    }
}
