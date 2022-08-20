
public class GetPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = {1,2,3,4,5};
		solution(answers);
	}

    public static int[] solution(int[] answers) {

        int answerLength = answers.length;
        int[] firstWay = {1, 2, 3, 4, 5};
        int[] secondWay = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdWay = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[][] ways = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] firstAnswer = new int[answerLength];
        int[] secondAnswer = new int[answerLength];
        int[] thirdAnswer = new int[answerLength];
        int[] cycle = {answerLength/firstWay.length,answerLength/secondWay.length,answerLength/thirdWay.length};
        int[] rest =  {answerLength%firstWay.length,answerLength%secondWay.length,answerLength%thirdWay.length};
        for(int i = 0; i < 3; i++) {
        	System.out.println("몫 : "+cycle[i]);
        	System.out.println("나머지 : "+rest[i]);
        }
        //수포자 3명 전부 답 넣기 위함
        for(int i = 0; i < 3; i++) {
        	for(int j = 0; j < ways[i].length; j++ ) {
        		firstAnswer[j] = ways[i][j];
        	}

        }
        
        
        
        return answers; 
    }
}
