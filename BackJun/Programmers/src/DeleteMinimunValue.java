import java.util.ArrayList;
import java.util.List;

public class DeleteMinimunValue {

	public static void main(String[] args) {
		// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
		// 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
		// 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
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
