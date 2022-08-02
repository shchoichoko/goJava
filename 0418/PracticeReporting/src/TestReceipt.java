import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestReceipt {

	public static void main(String[] args) {
		// ǰ��
		String[] k41_itemName = { "LG�����", "�ٳ�������", "������", "�������ֽ�", "���ڿ���", "�����ð�", "��ô���(1kg/��)", "�õ��ߴٸ�", "��귣�嵵�ö���",
				"�����Ӽҽ�230g", "���÷���ũ 500g", "����(1.8kg/��)", "��귣��ͽ���800g", "������ī(ȥ��)", "���� ��ȣ��", "�ε巯��ġ��252",
				"�޺���ݸ�(2��/��)", "�ķ������� �����", "���� ���ִ¿��� 1L", "���ϸ��緹�κ��청", "������ҺҰ��", "�����ڵ����250ml(�ΰ����Ǻο�)", "��귣�� �ֺ�����Ĩ",
				"����ݶ�(500ml*12/1Box)", "����������ġ100g*3", "������ä��ġ100g*3", "�������20L", "���� �ķ�ġ�������ڸ�", "�Ե�ũ��Ű3����102g",
				"ǥ�����(��)" }; 
		// �ܰ�
		int[] k41_price = { 10000000, 2500, 3300, 25000, 500, 750, 3280, 4990, 4580, 2680, 3680, 2780, 9980, 1980, 2580,
				6600, 4580, 2680, 4580, 3500, 9900, 3600, 1480, 8500, 2220, 4480, 660, 2200, 2400, 3000 };
		// ����
		int[] k41_num = { 1, 4, 1, 1, 10, 5, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };
		// true�� ����, false�� �鼼
		boolean[] k41_TaxItems = { true, true, false, true, true, true, false, false, true, true, true, false, true,
				false, false, true, false, false, true, true, false, true, true, true, true, true, false, true, true,
				false };
		int k41_taxExemption = 0;	//�鼼 ���� �������� ����.
		int k41_priceTotal = 0;	//��ü�� �հ踦 �������� ����.
		int k41_supPrice = 0;	//���� ��ǰ�� ���� �������� ����.
		int k41_points = 5473;	// ���� �����ϰ��ִ� ��������Ʈ
		
		// �޸����
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		// ��ºκ�
		System.out.printf("%36s\n","�̸�Ʈ ������(031)888-1234");
		System.out.printf("%32s\n","206-86-50913 ����");
		System.out.printf("%31s\n","���� ������ ������� 552");
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.println("*�Ϻ� �귣����� ����(���� ����������)");
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.println("");
		System.out.printf("[����]%s %23s\n", getPresentTime(1), "POS:0011-9861");
		System.out.println("----------------------------------------------");
		System.out.printf("   �� ǰ ��            �� ��   ����    ��  ��\n");
		System.out.println("----------------------------------------------");
		
		for (int k41_i = 0; k41_i < k41_itemName.length; k41_i++) {	// ǰ�� ����ŭ �ݺ��ϱ�.
			if (k41_TaxItems[k41_i] == false) { // �鼼���� false�� �տ� *�ְ� true��� ��ĭ�� �ֱ�.
				System.out.printf(" * ");
				k41_taxExemption += k41_price[k41_i]*k41_num[k41_i];
			} else {
				System.out.printf("   ");
			}	
			// ��µǴ� ���ڿ� ���̸� �������ѳ���, ������� ����ϱ�. DefimalFormat�� �̿��� �ܰ��� �ݾ׿� �޸��� �����Ѵ�. 
			//�߰��� ������ ���. 
			System.out.printf("%s%10s% 3d %10s\n", subStrByte(k41_itemName[k41_i], 19), k41_df.format(k41_price[k41_i]),
					k41_num[k41_i], k41_df.format(k41_price[k41_i] * k41_num[k41_i]));
			if ((k41_i + 1) % 5 == 0) {	// ǰ���� ���Ƽ� 5���� ����� ������ ���پ� ����ش�.
				System.out.println("----------------------------------------------");
			}
			k41_priceTotal += k41_price[k41_i]*k41_num[k41_i];

		}
		int k41_tax = (k41_priceTotal - k41_taxExemption)/ 11;
		double k41_tax_check = (k41_priceTotal - k41_taxExemption) / 11.0;
		if (k41_tax == k41_tax_check) {
		} else {
			k41_tax = k41_tax + 1;
		}
		k41_supPrice = k41_priceTotal - k41_tax - k41_taxExemption;
		System.out.println("");
		System.out.printf("%22s %18d\n", "�� ǰ�� ����", k41_itemName.length);
		System.out.printf("%23s %18s\n", "(*)�� ��  �� ǰ", k41_df.format(k41_taxExemption));
		System.out.printf("%23s %18s\n", "�� ��  �� ǰ", k41_df.format(k41_supPrice));
		System.out.printf("%24s %18s\n", "��   ��   ��", k41_df.format(k41_tax));
		System.out.printf("%25s %18s\n", "��        ��",
				k41_df.format(k41_priceTotal));
		System.out.printf("%11s %28s\n", "�� �� �� �� �� ��",
				k41_df.format(k41_priceTotal));
		System.out.println("----------------------------------------------");
		System.out.printf("%s %32s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%s %19s %10s\n", "ī�����(IC)", "�Ͻú� /",
				k41_df.format(k41_priceTotal));
		System.out.println("----------------------------------------------");
		System.out.printf("%24s\n", "[�ż�������Ʈ ����]");
		System.out.println("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%6s %17s %13s\n", "��ȸ�߻�����Ʈ", "9350**9995", k41_df.format((k41_priceTotal)/1000));
		System.out.printf("%8s %15s(%12s)\n", "����(����)����Ʈ", k41_df.format(5473+(k41_priceTotal)/1000), k41_df.format(k41_points));
		System.out.printf("%19s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.println("----------------------------------------------");
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%s %34s\n", "������ȣ :", "34��****");
		System.out.printf("%s %35s\n", "�����ð� :", getPresentTime(3));	// ����ð����� 2�ð� ���� �ð��� ���.
		System.out.println("----------------------------------------------");
		System.out.printf("ĳ��:084599 ��00 %29s\n","1150");
		System.out.printf("%29s\n","|��|��|��|��|��|��|��|��|��|��|��");
		System.out.printf("%17s/00119861/00164980/31",getPresentTime(4));
		
	}

	// ����ð� ���ϱ�
	public static String getPresentTime(int order) {	// �Է� ���� �Ű������� ���� ���ϴ� ������� ����ð��� �������� �Լ�
		Calendar k41_cal = Calendar.getInstance();	// ���� �ð��� �ޱ����� ���� ��ü ����.
		String k41_getTime = "";	// �Ʒ� ���ǹ��� ���� ���� �ð��� ���ڿ��� �����Ѵ�.
		if(order == 1) {	// �Ű� ������ 1�� �Է� ������ �б����� �����ִ� ���� �ð��� ��������.
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY-MM-dd HH:mm");
			k41_getTime = k41_time.format(k41_cal.getTime());	
		}
		else if(order == 2) {	//�Ű� ������ 2�� �־����� ����ϴ� ������ YYYY/MM/dd HH:mm:ss�� �ٲ�
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			k41_getTime = k41_time.format(k41_cal.getTime());
		} else if(order == 3) {//�Ű� ������ 3�� �־����� ����ϴ� ���Ŀ� 2�ð� ���� �ð��� �ִ´�.(�����ð��� ���� ��)
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			k41_cal.add(Calendar.HOUR, -2);
			k41_getTime = k41_time.format(k41_cal.getTime());	
		}
		else {
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
				if (k41_sb.toString().getBytes().length == k41_cutLength-1) { //���ڿ��� �ѱ� ũ�� ������ �����ؼ� ��ĭ �����Ҷ�, �Ʒ� ������ �����Ѵ�.
					k41_sb.append(" ");	// ������ �߰��Ѵ�.
				}

				return k41_sb.toString();	//������ ���ڿ��� �������ش�.
			}
		} else {	// ���ڿ��� �ƹ��͵� ���ٸ� �Ʒ� ������ �����Ѵ�.
			return "";	//�״�� �����ش�.
		}
	}
}
