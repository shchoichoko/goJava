
public class Prac1 {

	public static void main(String[] args) {
		// �Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�.
		// ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
		solution(2,5);
		
		
	}
	
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i++) {
        	answer[i] = (long)x+((long)x*i);
        }
        return answer;
    }

}
