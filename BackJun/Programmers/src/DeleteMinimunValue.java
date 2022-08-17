import java.util.ArrayList;
import java.util.List;

public class DeleteMinimunValue {

	public static void main(String[] args) {
		// ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
		// ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
		// ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
		int[] arr = {4,3,2,1};
		solution(arr);
	}
	
	 public static int[] solution(int[] arr) {
	        int min = 9999;
	        List<Integer> list = new ArrayList<Integer>();
	        int[] answer = new int[arr.length];
	        if(arr.length == 1){
	        	answer[0] = -1; 
	        } else{
	            for(int i = 0; i < arr.length; i++) {
	            	list.add(arr[i]);
	                if(min>arr[i]){
	                    min = arr[i];
	                }
	            }
	            while(list.remove(Integer.valueOf(min))) {};
	            answer = new int[list.size()];
	            for(int i = 0; i < list.size(); i++) {
	            	answer[i] = list.get(i);
	            }
	        }
	        
	        return answer;
	        
	    }

}
