import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt {

	public static void main(String[] args) {
		// �ΰ��� ���
		int k41_iPrice = 33000;
		int k41_tax = k41_iPrice/ 11;	// �ܰ��� 11�� ������ �ΰ����� ���Ѵ�.
		double k41_tax_check = k41_iPrice/ 11.0;	// ���������ε� �ΰ����� ���Ѵ�.
		if (k41_tax == k41_tax_check) {
		} else {	// �������� �������� ��� ����� �ٸ��ٸ� �ΰ����� 1�� �����ش�.
			k41_tax = k41_tax + 1;
		}
		int k41_price = k41_iPrice-k41_tax; //�ܰ����� �ΰ����� ���� �ݾ��� ���Ѵ�.
		//�޸����
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		//�ؽ�Ʈ
		System.out.println("�ſ����");
		System.out.printf("�ܸ��� : 2N68665898 %21s\n", "��ǥ��ȣ : 041218");
		System.out.println("������ : �Ѿ��ġ�");
		System.out.println("��  �� : ��� ������ �д籸 Ȳ�����351����10");
		System.out.println("1��");
		System.out.println("��ǥ�� : ��â��");
		System.out.printf("����� : 752-53-00558 %23s\n", "TEL : 7055695");
		System.out.println("---------------------------------------------");
		System.out.printf("��  ��%35s ��\n",k41_df.format(k41_price));
		System.out.printf("�ΰ���%35s ��\n",k41_df.format(k41_tax));
		System.out.printf("��  ��%35s ��\n",k41_df.format(k41_iPrice));
		System.out.println("---------------------------------------------");
		System.out.println("�츮ī��");
		System.out.printf("ī���ȣ : 5387-20**-****-4613(S)      �Ͻú�\n");
		System.out.printf("�ŷ��Ͻ� : %s\n", getPresentTime());	//���� �ð��� ���
		System.out.println("���ι�ȣ : 70404427");
		System.out.println("�ŷ���ȣ : 357734873739");
		System.out.printf("���� : ��ī���       ���� : 720068568\n");
		System.out.printf("�˸� : EDC����ǥ\n");
		System.out.printf("���� : TEL)1544-4700\n");
		System.out.println("---------------------------------------------");
		System.out.printf(" %24s","* �����մϴ� *\n");
		System.out.printf(" %42s","ǥ��V2.08_20200212");
	}
	// ����ð� ���ϱ�
	public static String getPresentTime() {
		Calendar k41_cal = Calendar.getInstance();	
		// ���� �ð��� �ޱ����� ���� ��ü ����.
		SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");	
		// �� ���·� ����ð��� �����ϵ��� �����Ѵ�.
		return k41_time.format(k41_cal.getTime());	
		// ���� �ð��� ������ ���ڿ��� �������ش�.
	}
}
