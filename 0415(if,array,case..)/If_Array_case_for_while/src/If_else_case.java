import java.util.Scanner;

public class If_else_case {

	public static void main(String[] args) {
		//#1 If�� ��� �Ǻ� ���� 22.04.15 csh
		Scanner k41_sc = new Scanner(System.in);	// ���� �Է��ϱ� ���� Scanner Ŭ���� ��ü�� �����Ѵ�.
		System.out.println("Please input the score");	// ������ ���� �Է��� �� �ֵ��� ������Ų��.
		int k41_score = k41_sc.nextInt();	// k41_score��� ������ ������ �Է¹޾� �����Ѵ�.
		int k41_num = 0;	// ���, ���� �Ǻ��� ���� ������ �����Ѵ�.
		if(k41_score > 60) {	//�Է¹��� ������ 60���� ũ�ٸ� Pass!�� ����Ѵ�.
			System.out.println("Pass!");
		} 
		if(k41_score > 60)	//���� ����� ���� ����������, �߰�ȣ�� ��� �����Ѵ�.
			System.out.println("Pass!");
		
		if(k41_score > 60) {	//�Է¹��� ������ 60���� ũ�ٸ� Pass!�� ����Ѵ�.
			System.out.println("Pass!");
		} else {			// �Է¹��� ������ 60���� ũ�� ���� ��� No Pass!�� ����Ѵ�.
			System.out.println("No Pass!");
		}
		
		System.out.println("Please input a number");	//������ ���� �Է��� �� �ֵ��� ������Ų��.
		k41_num = k41_sc.nextInt();	//k41_num�� ���,���� �Ǻ��� ���� ���� ���� �����Ѵ�.
		if(k41_num > 0) {	//�Է� ���� ���� 0���� Ŭ ���, ����� ����Ѵ�.
			System.out.println("����Դϴ�!");
		} else if(k41_num < 0) { //�Է� ���� ���� 0���� ���� ���, ������ ����Ѵ�.
			System.out.println("�����Դϴ�!");
		} else {	// �Է� ���� ����� ������ �ƴ� ��� 0�̶�� ����Ѵ�.
			System.out.println("���Դϴ�.");
		}
		
		if(k41_score >= 90) {	//�Է� ���� ���� 90�̻��̸� A��� ���
			System.out.println("A���");
		} else if(k41_score >= 80 && k41_score < 90) {
			System.out.println("B���");	//�Է� ���� ���� 80�̻� 90�̸��̸� B��� ���
		} else if(k41_score >= 70 && k41_score < 80) {
			System.out.println("C���");	//�Է� ���� ���� 70�̻� 80�̸��̸� C��� ���
		} else {
			System.out.println("F���");	//������ ���� F����� ����Ѵ�.
		}
		
		
		
	}

}
