
public class MethodTest2 {
	//#2 변수와 메서드2 22.04.19 최수혁
	static int k41_iStatic;
	
	public static void add(int k41_i) {
		k41_iStatic++;
		k41_i++;
		System.out.printf("add메소드에서->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("add메소드에서->k41_i=[%d]\n",k41_i);
		
	}
	
	public static int add2(int k41_i) {
		k41_iStatic++;
		k41_i++;
		System.out.printf("add메소드에서->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("add메소드에서->k41_i=[%d]\n",k41_i);
		return k41_i;
	}
	
	public static void main(String[] args) {

		int k41_iMain;
		k41_iMain = 1;
		k41_iStatic = 1;
		System.out.printf("*************************************\n");
		System.out.printf("메소드호출전 메인에서->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("메소드호출전 메인에서->k41_iMain=[%d]\n",k41_iMain);
		System.out.printf("*************************************\n");
		
		add(k41_iMain);
		
		System.out.printf("*************************************\n");
		System.out.printf("메소드호출후 메인에서->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("메소드호출후 메인에서->k41_iMain=[%d]\n",k41_iMain);
		System.out.printf("*************************************\n");
		
		k41_iMain = add2(k41_iMain);
		System.out.printf("*************************************\n");
		System.out.printf("메소드 add2호출후 메인에서->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("메소드 add2호출후 메인에서->k41_iMain=[%d]\n",k41_iMain);
		System.out.printf("*************************************\n");
		
		
	}
	

	
}
