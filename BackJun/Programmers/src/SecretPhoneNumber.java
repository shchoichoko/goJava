
public class SecretPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("01033334444"));
	}
    public static String solution(String phone_number) {
        String answer = "";
        int StringLength = phone_number.length();
        //01033334444,027778888
        String mainNumber = "";
        answer = phone_number.substring(StringLength-4);
        for(int i = 0; i < StringLength-4;i++) {
        	mainNumber += "*";
        }
        
        return mainNumber+answer;
    }
}
