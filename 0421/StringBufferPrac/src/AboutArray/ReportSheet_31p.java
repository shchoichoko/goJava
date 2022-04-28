package AboutArray;

import java.util.ArrayList;

public class ReportSheet_31p {
	// #page31 성적 입력데이터 출력 22.04.20 최수혁
	static ArrayList<OneRec2> k41_ArrayOneRec = new ArrayList <OneRec2>();
	
	static int k41_sumkor = 0;
	static int k41_sumeng = 0;
	static int k41_summat = 0;
	static int k41_sumsum = 0;
	static int k41_sumave = 0;
	static final int k41_iPerson = 20;
	
	public static void dataSet() {
		for(int k41_i = 0; k41_i < k41_iPerson; k41_i++) {
			String k41_name = String.format("최수%02d", k41_i);
			int k41_kor = (int)(Math.random() * 100);
			int k41_eng = (int)(Math.random() * 100);
			int k41_mat = (int)(Math.random() * 100);
			k41_ArrayOneRec.add(new OneRec2(k41_i,k41_name,k41_kor,k41_eng,k41_mat));
		}
	}
	
	public static void HeaderPrint() {
		System.out.printf("*************************************************\n");
		System.out.printf("%2s %4s  %2s %2s %2s     %2s  	%2s\n","번호", "이름", 
				"국어", "영어", "수학", "합계", "평균");
		System.out.printf("*************************************************\n");
	}
	
	public static void itemPrint(int k41_i) {
		OneRec2 k41_rec;
		k41_rec = k41_ArrayOneRec.get(k41_i);
		System.out.printf("%3d    %4s %3d %3d %3d	%3d	%6.2f\n", k41_rec.k41_student_id(), 
				k41_rec.k41_name(), k41_rec.k41_kor(), k41_rec.k41_eng(), 
				k41_rec.k41_mat(), k41_rec.sum(), k41_rec.ave());
		
		k41_sumkor += k41_rec.k41_kor();
		k41_sumeng += k41_rec.k41_eng();
		k41_summat += k41_rec.k41_mat();
		k41_sumsum += k41_rec.sum();
		k41_sumave += k41_rec.ave();
	}
	
	public static void tailPrint() {
		System.out.printf("*************************************************\n");
		System.out.printf("국어합계 %d		국어평균 : %6.2f\n", k41_sumkor, k41_sumkor
				/(double)k41_ArrayOneRec.size());
		System.out.printf("영어합계 %d		영어평균 : %6.2f\n", k41_sumeng, k41_sumeng
				/(double)k41_ArrayOneRec.size());
		System.out.printf("수학합계 %d		수학평균 : %6.2f\n", k41_summat, k41_summat
				/(double)k41_ArrayOneRec.size());
		System.out.printf("*************************************************\n");
		System.out.printf("반평균합계 %d	반평균 : %6.2f\n", k41_sumave,k41_sumave
				/(double)k41_ArrayOneRec.size());
		System.out.println("");
	}
	

	
	public static void main(String[] args) {
		
		dataSet();
		HeaderPrint();
		for(int k41_i  = 0; k41_i < k41_ArrayOneRec.size(); k41_i ++) {
			itemPrint(k41_i);
			
		}
		tailPrint();
		
	}
}
