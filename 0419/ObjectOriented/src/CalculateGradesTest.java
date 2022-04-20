
public class CalculateGradesTest {
	// #11 �޼ҵ� �����ε� ����ǥ ��� �׽�Ʈ 22.04.20 �ּ���
	public static void main(String[] args) {
		printTitle(3);	//3���� �ش��ϴ� ����ǥ ��� �ؽ�Ʈ �κ��� �ҷ����� �Լ�.
		printGrades(3);	//3���� �ش��ϴ� �� ���� ����, ����, ����� ǥ�����ִ� �Լ�.
		printTitle(4);	//4���� �ش��ϴ� ����ǥ ��� �ؽ�Ʈ �κ��� �ҷ����� �Լ�.
		printGrades(4);	//4���� �ش��ϴ� �� ���� ����, ����, ����� ǥ�����ִ� �Լ�.
		printTitle(5);	//5���� �ش��ϴ� ����ǥ ��� �ؽ�Ʈ �κ��� �ҷ����� �Լ�.
		printGrades(5);	//5���� �ش��ϴ� �� ���� ����, ����, ����� ǥ�����ִ� �Լ�.
	}

	public static void printTitle(int k41_order) {
		//�Ű������� �޴� ���ڿ� ���� �ٸ� Ÿ��Ʋ�� ����Ʈ��.
		if (k41_order == 3) {
			System.out.println(k41_order + "�� ����ǥ");
			System.out.println("==========================================");
			System.out.println("�̸�     ����   ����   ����   ����   ���");
			System.out.println("==========================================");
		} else if (k41_order == 4) {
			System.out.println(k41_order + "�� ����ǥ");
			System.out.println("===============================================");
			System.out.println("�̸�    ����   ����   ����   ����  ����  ���");
			System.out.println("===============================================");

		} else {
			System.out.println(k41_order + "�� ����ǥ");
			System.out.println("===============================================");
			System.out.println("�̸�  ����  ����  ����  ����  ��ȸ ����  ���");
			System.out.println("===============================================");
		}
	}

	public static void printGrades(int k41_order) {
		CalculateGrades k41_calG = new CalculateGrades();
		//������ִ� Ŭ������ ��ü�� ����.
		int k41_korean = 100;
		int k41_english = 100;
		int k41_math = 100;
		int k41_science = 100;
		int k41_society = 100;
		double k41_avg = 0;
		int k41_sum = 0;
		if (k41_order == 3) {
			//sum()�Լ��� 3������ ������ �ջ��ؼ�, k41_sum�� ����.
			k41_sum = k41_calG.sum(k41_korean, k41_english, k41_math);
			//avg()�Լ��� ������ ���� �հ� ������� �־ ��հ� ���ϱ�.
			k41_avg = k41_calG.avg(k41_sum, 3);
			System.out.printf("������   %4d   %4d   %4d   %4d   %4.0f\n\n", 
					k41_korean, k41_english, k41_math, k41_sum, k41_avg);
		} else if (k41_order == 4) {
			//sum()�Լ��� 4������ ������ �ջ��ؼ�, k41_sum�� ����.
			k41_sum = k41_calG.sum(k41_korean, k41_english, k41_math, 
					k41_science);
			//avg()�Լ��� ������ ���� �հ� ������� �־ ��հ� ���ϱ�.
			k41_avg = k41_calG.avg(k41_sum, 4);
			System.out.printf("������  %4d   %4d   %4d   %4d  %4d %5.1f\n\n", 
					k41_korean, k41_english, k41_math, k41_science,
					k41_sum, k41_avg);
		} else {
			//sum()�Լ��� 5������ ������ �ջ��ؼ�, k41_sum�� ����.
			k41_sum = k41_calG.sum(k41_korean, k41_english, k41_math, k41_science, 
					k41_society);
			//avg()�Լ��� ������ ���� �հ� ������� �־ ��հ� ���ϱ�.
			k41_avg = k41_calG.avg(k41_sum, 5);
			System.out.printf("������%4d  %4d  %4d  %4d  %4d %4d %4.1f\n\n", k41_korean, k41_english,
					k41_math, k41_science,
					k41_society, k41_sum, k41_avg);
		}
	}

}
