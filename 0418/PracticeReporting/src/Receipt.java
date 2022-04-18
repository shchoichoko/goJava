import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt {

	public static void main(String[] args) {
		// �ΰ��� ���
		int k41_iPrice = 28320;
		double k41_tax = getTax(k41_iPrice);
		int k41_price = k41_iPrice-(int)k41_tax;
		//�޸����
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		//�ؽ�Ʈ
		System.out.println("�ſ����");
		System.out.printf("�ܸ��� : 2N68665898 %16s\n", "��ǥ��ȣ : 041218");
		System.out.println("������ : �Ѿ��ġ�");
		System.out.println("�ּ� : ��� ������ �д籸 Ȳ�����351���� 10");
		System.out.println("1��");
		System.out.println("��ǥ�� : ��â��");
		System.out.printf("����� : 752-53-00558 %22s\n", "TEL : 7055695");
		System.out.println("--------------------------------------------");
		System.out.printf("��  ��%34s  ��\n",k41_df.format(k41_price));
		System.out.printf("�ΰ���%34s  ��\n",k41_df.format(k41_tax));
		System.out.printf("��  ��%34s  ��\n",k41_df.format(k41_iPrice));
		System.out.println("--------------------------------------------");
		System.out.println("�츮ī��");
		System.out.printf("ī���ȣ : 5387-20**-****-4613(S)      �Ͻú�\n");
		System.out.printf("�ŷ��Ͻ� : %s\n", getPresentTime());
		System.out.println("���ι�ȣ : 70404427");
		System.out.println("�ŷ���ȣ : 357734873739");
		System.out.printf("���� : ��ī���     ���� : 720068568\n");
		System.out.printf("�˸� : EDC����ǥ\n");
		System.out.printf("���� : TEL)1544 - 4700\n");
		System.out.println("--------------------------------------------\n");
		System.out.printf(" %24s","* �����մϴ� *\n");
		System.out.printf(" %41s","ǥ��V2.08_20200212");
		
		
	}
	//�ΰ��� ���
	public static double getTax(int k41_iPrice) {
		double k41_dtax = 0;
		k41_dtax = k41_iPrice/11.0; 
		if(k41_iPrice/11.0 != k41_iPrice/11) {
			k41_dtax = (int)k41_dtax+1;
		}
		return k41_dtax;
	}
	// ����ð� ���ϱ�
	public static String getPresentTime() {
		Calendar k41_cal = Calendar.getInstance();
		SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		return k41_time.format(k41_cal.getTime());
	}
}
