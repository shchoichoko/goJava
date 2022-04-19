import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt3 {

	public static void main(String[] args) {
		// ǰ��
		String[] k41_itemName = { "��������", "�ٳ�������", "������", "�������ֽ�", "���ڿ���", "�����ð�", "��ô���(1kg/��)", "�õ��ߴٸ�", "��귣�嵵�ö���",
				"�����Ӽҽ�230g", "���÷���ũ 500g", "����(1.8kg/��)", "��귣��ͽ���800g", "������ī(ȥ��)", "���� ��ȣ��", "�ε巯��ġ��252",
				"�޺���ݸ�(2��/��)", "�ķ������� �����", "���� ���ִ¿��� 1L", "���ϸ��緹�κ��청", "������ҺҰ��", "�����ڵ����250ml(�ΰ����Ǻο�)", "��귣�� �ֺ�����Ĩ",
				"����ݶ�(500ml*12/1Box)", "����������ġ100g*3", "������ä��ġ100g*3", "�������20L", "���� �ķ�ġ�������ڸ�", "�Ե�ũ��Ű3����102g",
				"ǥ�����(��)" };
		// �ܰ�
		int[] k41_price = { 1000, 2500, 3300, 25000, 500, 750, 3280, 4990, 4580, 2680, 3680, 2780, 9980, 1980, 2580,
				6600, 4580, 2680, 4580, 3500, 9900, 3600, 1480, 8500, 2220, 4480, 660, 2200, 2400, 3000 };
		// ����
		int[] k41_num = { 2, 4, 1, 1, 10, 5, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };
		// �鼼����. true�� ����, false�� �鼼
		boolean[] k41_taxfree = { true, true, false, true, true, true, false, false, true, true, true, false, true,
				false, false, true, false, false, true, true, false, true, true, true, true, true, false, true, true,
				false };
		// �鼼 �հ� ���� �� ����� ���� ����.
		int k41_taxExemption = 0;
		int k41_priceTotal = 0;
		double k41_tax = 0;
		// getTax(k41_iPrice1)
		// �޸����
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		// ��ºκ�
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.println("*�Ϻ� �귣����� ����(���� ����������)");
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("[����]%s %22s\n", getPresentTime(1), "POS:0011-9861");
		System.out.println("---------------------------------------------");
		System.out.printf("   �� ǰ ��            �� ��   ����    ��  ��\n");
		System.out.println("---------------------------------------------");
		for (int k41_i = 0; k41_i < k41_itemName.length; k41_i++) {	// ǰ�� ����ŭ �ݺ��ϱ�.
			if (k41_taxfree[k41_i] == false) { // �鼼���� false�� �տ� *�ְ� true��� ��ĭ�� �ֱ�.
				System.out.printf(" * ");
			} else {
				System.out.printf("   ");
			}	// ��µǴ� ���ڿ� ���̸� 20���� �������ѳ���, ������� ����ϱ�. DefimalFormat�� �̿��� �ܰ��� �ݾ׿� �޸��� �����Ѵ�. �߰��� ������ ���. 
			System.out.printf("%s %7s %3d %9s\n", subStrByte(k41_itemName[k41_i], 20), k41_df.format(k41_price[k41_i]),
					k41_num[k41_i], k41_df.format(k41_price[k41_i] * k41_num[k41_i]));
			if ((k41_i + 1) % 5 == 0) {	// ǰ���� ���Ƽ� 5���� ����� ������ ���پ� ����ش�.
				System.out.println("---------------------------------------------");
			}
			if (k41_taxfree[k41_i] == false) {	// �鼼 �ݾ׸� ���� �����ִ� ��.
				k41_taxExemption += k41_price[k41_i];
			} else {	// �鼼ǰ���� ������ ǰ����� �ΰ����� �ݾ��� �����ִ� ��.
				k41_tax += getTax(k41_price[k41_i]);	// �ΰ����� ��� k41_tax�� �����ش�.
				k41_priceTotal += k41_price[k41_i] - getTax(k41_price[k41_i]);	//������ǰ�� �ݾ��� ��� k41_priceTotal�� �����ش�.
			}

		}
		System.out.printf("%25s %14d\n", "�� ǰ�� ����", k41_price.length);
		System.out.printf("%26s %14s\n", "(*)�� ��  �� ǰ", k41_df.format(k41_taxExemption));
		System.out.printf("%26s %14s\n", "�� ��  �� ǰ", k41_df.format(k41_priceTotal));
		System.out.printf("%27s %14s\n", "��   ��   ��", k41_df.format((int) k41_tax));
		System.out.printf("%28s %14s\n", "��        ��",
				k41_df.format(k41_taxExemption + k41_priceTotal + (int) k41_tax));
		System.out.printf("%11s %27s\n", "�� �� �� �� �� ��",
				k41_df.format(k41_taxExemption + k41_priceTotal + (int) k41_tax));
		System.out.println("---------------------------------------------");
		System.out.printf("%14s %28s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%11s %18s %6s\n", "ī�����(IC)", "�Ͻú� /",
				k41_df.format(k41_taxExemption + k41_priceTotal + (int) k41_tax));
		System.out.println("---------------------------------------------");
		System.out.printf("%23s\n", "[�ż�������Ʈ ����]");
		System.out.println("   ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%10s %17s %9d\n", "��ȸ�߻�����Ʈ", "9350**9995", 164);
		System.out.printf("%12s %18s %5s\n", "����(���)����Ʈ", "5,637(", "5,473)");
		System.out.printf("%20s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.println("---------------------------------------------");
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%9s %30s\n", "������ȣ :", "34��****");
		System.out.printf("%9s %31s\n", "�����ð� :", getPresentTime(2));
		System.out.println("---------------------------------------------");
	}

	// �ΰ��� ���
	public static double getTax(int k41_iPrice) {	// �ܰ��� �Է¹޾� �ΰ����� �������� �Լ�
		double k41_dtax = 0;	//�Ҽ��� ����� ���� ���������� ���� �� �ʱ�ȭ.
		k41_dtax = k41_iPrice / 11.0;	// �ܰ� / 11 = �ΰ���
		if (k41_iPrice / 11.0 != k41_iPrice / 11) {
			k41_dtax = (int) k41_dtax + 1;	//����ȯ���� ���� ������ ���� �ٸ� ��, �ΰ����� +1�� �Ѵ�.
		}
		return k41_dtax;	// ���� �ΰ����� �������ش�.
	}

	// ����ð� ���ϱ�
	public static String getPresentTime(int order) {	// �Է� ���� �Ű������� ���� ���ϴ� ������� ����ð��� �������� �Լ�
		Calendar k41_cal = Calendar.getInstance();	// ���� �ð��� �ޱ����� ���� ��ü ����.
		String k41_getTime = "";	// �Ʒ� ���ǹ��� ���� ���� �ð��� ���ڿ��� �����Ѵ�.
		if(order == 1) {	// �Ű� ������ 1�� �Է� ������ �б����� �����ִ� ���� �ð��� ��������.
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm");
			k41_getTime = k41_time.format(k41_cal.getTime());	
		}
		else {	//�Ű� ������ 1�� ������ ���� �Է� ������ �ʱ��� ������ ���� �ð��� ��������.
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
			k41_getTime = k41_time.format(k41_cal.getTime());
		}
		return k41_getTime;	// ���ڿ��� �������� ��������.
	}

	// �ʱ��� �����ִ� ��

	// ���� �ڸ���
	public static String cutString(String k41_a) {
		String cut = k41_a.substring(0, 14);
		return cut;
	}
	// �ѱ� ����Ʈ�� �ڸ���
	public static String subStrByte(String k41_source, int k41_cutLength) {	//�Ű������� �ڸ� �����, �ڸ��� ���� �޴´�.
		if (!k41_source.isEmpty()) {	// ���ڿ��� �ƹ��͵� ���� �ʴٸ� �Ʒ� ������� �����Ѵ�.
			k41_source = k41_source.trim();// ���忡 �ִ� ���� ����
			if (k41_source.getBytes().length < k41_cutLength) { //�ڸ��� ������ ���̰� ª�ٸ�, �Ʒ� ������ �����Ѵ�.
				for (int k41_i = k41_cutLength - k41_source.getBytes().length; k41_i > 0; k41_i--) {
					k41_source += " ";	//���ڸ� ��ŭ ������ �߰����ش�.
				}
				return k41_source;	//���ڿ��� �ٽ� �����Ѵ�.
			} else {	// �ڸ��� ������ ���̰� ª�� �ʴٸ� �Ʒ� ������� �����Ѵ�.
				StringBuffer k41_sb = new StringBuffer(k41_cutLength);	// ���ڿ��� �߰��ϰų� �ڸ��� Ŭ������ ��ü ����.
				int k41_cnt = 0;	// 
				for (char k41_ch : k41_source.toCharArray()) {
					k41_cnt += String.valueOf(k41_ch).getBytes().length;
					if (k41_cnt > k41_cutLength)
						break;
					k41_sb.append(k41_ch);
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
