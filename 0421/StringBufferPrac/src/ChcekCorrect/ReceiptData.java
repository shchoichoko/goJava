package ChcekCorrect;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReceiptData {


	static int k41_taxExemption = 0;	//�鼼 ���� �������� ����.
	static int k41_priceTotal = 0;	//��ü�� �հ踦 �������� ����.
	static int k41_supPrice = 0;	//���� ��ǰ�� ���� �������� ����.
	static int k41_points = 5473;	// ���� �����ϰ��ִ� ��������Ʈ
	// ǰ��
	static String[] k41_itemName = { "LG�����", "�ٳ�������", "������", "�������ֽ�", "���ڿ���", "�����ð�", "��ô���(1kg/��)", "�õ��ߴٸ�", "��귣�嵵�ö���",
			"�����Ӽҽ�230g", "���÷���ũ 500g", "����(1.8kg/��)", "��귣��ͽ���800g", "������ī(ȥ��)", "���� ��ȣ��", "�ε巯��ġ��252",
			"�޺���ݸ�(2��/��)", "�ķ������� �����", "���� ���ִ¿��� 1L", "���ϸ��緹�κ��청", "������ҺҰ���", "�����ڵ����250ml(�ΰ����Ǻο�)", "��귣�� �ֺ�����Ĩ",
			"����ݶ�(500ml*12/1Box)", "����������ġ100g*3", "������ä��ġ100g*3", "�������20L", "���� �ķ�ġ�������ڸ�", "�Ե�ũ��Ű3����102g",
			"ǥ������(��)" };
	// �޸����
	static DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
	
	public static void main(String[] args) {
		int itemCount = k41_itemName.length;	//�� �׸� ��
		titlePrint();	// Ÿ��Ʋ ��� �κ�
		for(int k41_i = 0; k41_i < itemCount; k41_i++) {	
			itemPrint(k41_i);	//�� �׸� ������ �ݺ��ϸ鼭 ǰ��,�ܰ�,����,�ݾ� ���� ���
		}
		totalPrint(getTax(),itemCount);	//�հ� ���׵��� �μ�
	}

	// ����ð� ���ϱ�
	public static String timeStamp(int order) {	// �Է� ���� �Ű������� ���� ���ϴ� ������� ����ð��� �������� �Լ�
		Calendar k41_cal = Calendar.getInstance();	// ���� �ð��� �ޱ����� ���� ��ü ����.
		String k41_getTime = "";	// �Ʒ� ���ǹ��� ���� ���� �ð��� ���ڿ��� �����Ѵ�.
		if(order == 1) {	// �Ű� ������ 1�� �Է� ������ �б����� �����ִ� ���� �ð��� ��������.
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY-MM-dd HH:mm");
			k41_getTime = k41_time.format(k41_cal.getTime());	
		} else if(order == 2) {//�Ű� ������ 3�� �־����� ����ϴ� ���Ŀ� 2�ð� ���� �ð��� �ִ´�.(�����ð��� ���� ��)
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			k41_cal.add(Calendar.HOUR, -2);
			k41_getTime = k41_time.format(k41_cal.getTime());	
		} else {
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYYMMdd");
			k41_getTime = k41_time.format(k41_cal.getTime());
		}
		return k41_getTime;	// ���ڿ��� �������� ��������.
	}
	
	// �ѱ� �ڸ��� ���� �߰��ϴ� �Լ�
	public static String subStrByte(String k41_source, int k41_cutLength) {	//�Ű������� �ڸ� �����, �ڸ��� ���� �޴´�.
		if (!k41_source.isEmpty()) {	// ���ڿ��� �ƹ��͵� ���� �ʴٸ� �Ʒ� ������� �����Ѵ�.
			k41_source = k41_source.trim();// ���忡 �ִ� ���� ����
			if (k41_source.getBytes().length < k41_cutLength) { //�ڸ��� ������ ���̰� ª�ٸ�, �Ʒ� ������ �����Ѵ�.
				for (int k41_i = k41_cutLength - k41_source.getBytes().length; k41_i > 0; k41_i--) {
					k41_source += " ";	//���ڸ� ��ŭ ������ �߰����ش�.
				}
				return k41_source;	//���ڿ��� �ٽ� �����Ѵ�.
			} else {	// �ڸ��� ������ ���̰� ª�� �ʴٸ� �Ʒ� ������� �����Ѵ�.
				StringBuffer k41_sb = new StringBuffer(k41_cutLength);	// ���ڿ��� �߰��ϰų� �ڸ��� ��ü ����.
				int k41_num = 0;	// ���� �񱳸� ���� ���� ����.
				for (char k41_ch : k41_source.toCharArray()) {	// ���ڿ��� ���ڷ� ��ȯ.
					k41_num += String.valueOf(k41_ch).getBytes().length;	//�ش� ������ ����Ʈ ���̸� k41_num�� �־���.
					if (k41_num > k41_cutLength)	// �Ű������� ���� ���̺��� ũ�ٸ� �ݺ��� ���.
						break;
					k41_sb.append(k41_ch);	//���ڿ� ���� ���ڸ� �߰��Ѵ�.
				}
				if (k41_sb.toString().getBytes().length == k41_cutLength-1) { //���ڿ��� �ѱ� ũ�� ������ �����ؼ� ��ĭ �����Ҷ�, 
					//�Ʒ� ������ �����Ѵ�.
					k41_sb.append(" ");	// ������ �߰��Ѵ�.
				}

				return k41_sb.toString();	//������ ���ڿ��� �������ش�.
			}
		} else {	// ���ڿ��� �ƹ��͵� ���ٸ� �Ʒ� ������ �����Ѵ�.
			return "";	//�״�� �����ش�.
		}
	}
	//������ �� ������ Ÿ��Ʋ ���
	public static void titlePrint() {
		System.out.printf("%31s\n","�̸�Ʈ ������(031)888-1234");
		System.out.printf("%27s\n","206-86-50913 ����");
		System.out.printf("%26s\n","���� ������ ������� 552");
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.println("*�Ϻ� �귣����� ����(���� ����������)");
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.println("");
		System.out.printf("[����]%s %18s\n", timeStamp(1), "POS:0011-9861");
		System.out.println("-----------------------------------------");
		System.out.printf("  �� ǰ ��        �� ��    ����    ��  ��\n");
		System.out.println("-----------------------------------------");
	}
	
	public static void itemPrint(int k41_i) {

		// �ܰ�
		int[] k41_price = { 100000, 2500, 3300, 25000, 500, 750, 3280, 4990, 4580, 2680, 3680, 2780, 9980, 1980, 2580,
				6600, 4580, 2680, 4580, 3500, 9900, 3600, 1480, 8500, 2220, 4480, 660, 2200, 2400, 3000 };
		// ����
		int[] k41_num = { 1, 4, 1, 1, 10, 5, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };
		// true�� ����, false�� �鼼
		boolean[] k41_TaxItems = { true, true, false, true, true, true, false, false, true, true, true, false, true,
				false, false, true, false, false, true, true, false, true, true, true, true, true, false, true, true,
				false };
			
				System.out.printf("%02d",k41_i+1 );
				if (k41_TaxItems[k41_i] == false) { // �鼼�϶�
					System.out.printf("%-2s", "*  "); // �׸� �տ� * ���
					k41_taxExemption += k41_price[k41_i] * k41_num[k41_i];
				} else { // �����϶� 
					System.out.printf("%-2s", "   "); // ��ĭ ��� �ϴ� �κ�.
				}
				System.out.printf("%s%9s%3d%9s\n",subStrByte(k41_itemName[k41_i], 20),
						// ��ǰ���� �Լ��� ����� 15����Ʈ�� �ڸ���, �ܰ�, ����, �ݾ��� ���Ŀ� �°� ���
						k41_df.format(k41_price[k41_i]), k41_num[k41_i], k41_df.format(k41_price[k41_i] * k41_num[k41_i]));

				if ((k41_i + 1) % 5 == 0) { // ������ ���� i+1�� 5�� ���� �������� 0�̶�� (5�� ����)
					System.out.println("-----------------------------------------"); // ���м� ���
				}
				
				k41_priceTotal += k41_price[k41_i] * k41_num[k41_i];	//���� �ݾ� �հ�
	}
	public static int getTax() {	//�ΰ��� ���ϴ� �Լ�.
		int k41_tax = (k41_priceTotal - k41_taxExemption)/ 11;	
		double k41_tax_check = (k41_priceTotal - k41_taxExemption) / 11.0;
		if (k41_tax == k41_tax_check) {
		} else {// ���� �ٸ� �� �ΰ����� 1�� ������.
			k41_tax = k41_tax + 1;
		}
		return k41_tax;
	}
	public static void totalPrint(int k41_tax, int itemCount) {
		k41_supPrice = k41_priceTotal - k41_tax - k41_taxExemption;
		System.out.println("");
		System.out.printf("%22s %13d\n", "�� ǰ�� ����", itemCount);
		System.out.printf("%23s %13s\n", "(*)�� ��  �� ǰ", k41_df.format(k41_taxExemption));
		System.out.printf("%23s %13s\n", "�� ��  �� ǰ", k41_df.format(k41_supPrice));
		System.out.printf("%24s %13s\n", "��   ��   ��", k41_df.format(k41_tax));
		System.out.printf("%25s %13s\n", "��        ��",
				k41_df.format(k41_priceTotal));
		System.out.printf("%11s %23s\n", "�� �� �� �� �� ��",
				k41_df.format(k41_priceTotal));
		System.out.println("-----------------------------------------");
		System.out.printf("%s %27s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%s %14s %10s\n", "ī�����(IC)", "�Ͻú� /",
				k41_df.format(k41_priceTotal));
		System.out.println("-----------------------------------------");
		System.out.printf("%20s\n", "[�ż�������Ʈ ����]");
		System.out.println("ȫ*�� �������� ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%6s %17s %8s\n", "��ȸ�߻�����Ʈ", "9350**9995", k41_df.format((k41_priceTotal)/1000));
		System.out.printf("%8s %12s(%10s)\n", "����(����)����Ʈ", k41_df.format(5473+(k41_priceTotal)/1000), 
				k41_df.format(k41_points));
		System.out.printf("%19s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.println("-----------------------------------------");
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%s %29s\n", "������ȣ :", "34��****");
		System.out.printf("%s %30s\n", "�����ð� :", timeStamp(2));	// ����ð����� 2�ð� ���� �ð��� ���.
		System.out.println("-----------------------------------------");
		System.out.printf("ĳ��:084599 ��00 %24s\n","1150");
		System.out.printf("%27s\n","|��|��|��|��|��|��|��|��|��|��|��");
		System.out.printf("%14s/00119861/00164980/31",timeStamp(4));
	}

}