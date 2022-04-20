
public class InputData {
	// #19 성적 입력데이터 22.04.20 최수혁
	
	public String[] k41_name;	//이름을 배열로 넣을 변수 생성.
	public int[] k41_kor;	//국어 점수를 배열로 넣을 변수 생성.
	public int[] k41_eng;	//영어 점수를 배열로 넣을 변수 생성.
	public int[] k41_mat; 	//수학 점수를 배열로 넣을 변수 생성.
	public int[] k41_num;	//번호를 배열로 넣을 변수 생성.
	public int[] k41_sum;	//합계를 배열로 넣을 변수 생성.
	public double[] k41_avg;	//평균점수를 배열로 넣을 변수 생성.
	
	InputData(int k41_size){	// 매개변수로 배열의 크기를 입력 받기.
		//배열의 크기를 k41_size 만큼 크기를 지정한다.
		k41_name = new String[k41_size];	
		k41_kor = new int[k41_size];		
		k41_eng = new int[k41_size];		
		k41_mat = new int[k41_size];		
		k41_num = new int[k41_size];		
		k41_sum = new int[k41_size];		
		k41_avg = new double[k41_size];		

	}
	// 번호, 이름, 국어, 영어, 수학을 번호대로 저장하고, 합계와 평균도 동시에 만들어서 저장.
	public void SetData(int k41_totalPageNum,int k41_i, String k41_name, int k41_kor,int k41_eng, int k41_mat) {
		this.k41_num[k41_i] = k41_i; 	// 번호 입력받는 배열
		this.k41_name[k41_i] = k41_name; //이름 입력받는 배열
		this.k41_kor[k41_i] = k41_kor; //국어점수 입력받는 배열
		this.k41_eng[k41_i] = k41_eng; //영어점수 입력받는 배열
		this.k41_mat[k41_i] = k41_mat; //수학점수 입력받는 배열
		k41_sum[k41_i] = k41_kor + k41_eng + k41_mat;	//국어, 영어, 수학 점수의 합계를 저장하는 배열
		k41_avg[k41_i] = (k41_kor + k41_eng + k41_mat)/3; // 위 합계의 평균 점수를 저장하는 배열
	}
	
}
