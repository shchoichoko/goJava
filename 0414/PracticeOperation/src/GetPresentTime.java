import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetPresentTime {
	// #14 Get Present Time. 22.04.14 . csh
	public static void main(String[] args) {
		Calendar k41_calt = Calendar.getInstance(); //Calendar Ŭ������ ����ϱ� ���� ��ü�� ����.
		SimpleDateFormat k41_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");	//�⵵/��.����  �ð�:��:�� �� ���Ѵ�. ��ҹ��� ����!!
		//SimpleDateFormat Ŭ������ date ������ ��ü�� �ڽ��� ���ϴ� ����� ������ �� �ֵ��� ���ش�.
		System.out.printf("��������ð�: %s\n", k41_sdt.format(k41_calt.getTime()));
		//getTime()�޼���� ǥ�ؽÿ� ���� ������ ��¥�� �ð��� �ش��ϴ� ���� ���� ��ȯ�Ѵ�.
		System.out.printf("**************************************************\n");
		
	}

}
