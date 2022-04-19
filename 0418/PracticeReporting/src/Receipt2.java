import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt2 {

	public static void main(String[] args) {

		// ���̼� ��ǰ	
		//ǰ��, �ڵ�, �ܰ�, ���� �Է�
		String k41_itemName1 = "���ǳ׾�ä�ڵ�&����ũ��50g�������̽�";
		String k41_itemCode1 = "1031235";
		int k41_iPrice1 = 3000;
		int k41_amount1 = 1;
		String k41_itemName2 = "�����̵�ĸ���(������) (100ȣ)";
		String k41_itemCode2 = "11008152";
		int k41_iPrice2 = 1000;
		int k41_amount2 = 1;
		String k41_itemName3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		String k41_itemCode3 = "1020800";
		int k41_iPrice3 = 1000;
		int k41_amount3 = 1;
		int k41_totalTax = 0; int k41_totalPrice = 0; int k41_supPrice = 0;
		// �ΰ��� �հ�, �ܰ� �հ�, �����հ踦 ���� ������ �����ϰ� �ʱ�ȭ ���ش�.
		// �ΰ��� ���
		k41_totalPrice = (k41_iPrice1*k41_amount1)+(k41_iPrice2*k41_amount2)+(k41_iPrice3*k41_amount3); // �ܰ� �հ踦 �����ش�.
		k41_totalTax = k41_totalPrice/ 11;	//�� �ΰ����� �����ش�.
		double k41_tax_check = k41_totalPrice/ 11.0;	// ���������ε� �� �ΰ����� ���Ѵ�.
		if (k41_totalTax == k41_tax_check) {
		} else {	// �������� �������� ���� �ٸ��ٸ� �ΰ����� 1�� �����ش�.
			k41_totalTax = k41_totalTax + 1;
		}
		k41_supPrice = k41_totalPrice - k41_totalTax;	// �� �հ迡�� �ΰ��� ���� ���� �����հ踦 ���Ѵ�.
		// �޸����
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		// �ؽ�Ʈ
		System.out.printf("%25s\n", "\"���ΰ���, ���̼�\"");
		System.out.println("(��)�Ƽ����̼�_�д缭����");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.println("����:���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.println("��ǥ:������,��ȣ�� 213-81-52063");
		System.out.println("����:��⵵ ������ �д籸 �д��53���� 11 (����");
		System.out.println("��)");
		System.out.println("================================================");
		System.out.printf("%27s\n", "�Һ����߽ɰ濵(CCM) �������");
		System.out.printf("%29s\n", "ISO 9001 ǰ���濵�ý��� �������");
		System.out.println("================================================");
		System.out.printf("          ��ȯ/ȯ�� 14��(%s)�̳�,\n", getPresentTime(2));
		//�Ű������� 2�� �־� ����ð��� 14���� ���� ��¥�� ����Ѵ�.
		System.out.printf("(����)������, ����ī�� ���� �� ���Ը��忡�� ����\n");
		System.out.printf("       ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("         üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.println("================================================");
		System.out.printf("[%s] %34s\n", "POS 1058231", getPresentTime(1)); //�Ű������� 1�� �־� ���� �ð��� ����Ѵ�.
		System.out.println("================================================");
		System.out.printf("%s %8s %2d %9s\n", subStrByte(k41_itemName1, 26), k41_df.format(k41_iPrice1), k41_amount1,
				k41_df.format(k41_iPrice1 * k41_amount1)); // ���ڸ� ���� �ִ� 26���� �ڸ���, �ܰ�, ���� , ���� �ݾ��� ����Ѵ�.
		System.out.printf("[%s]\n", k41_itemCode1);
		System.out.printf("%s %8s %2d %9s\n", subStrByte(k41_itemName2, 26), k41_df.format(k41_iPrice2), k41_amount2,
				k41_df.format(k41_iPrice2 * k41_amount2)); // ���ڸ� ���� �ִ� 26���� �ڸ���, �ܰ�, ���� , ���� �ݾ��� ����Ѵ�.
		System.out.printf("[%s]\n", k41_itemCode2);
		System.out.printf("%s %8s %2d %9s\n", subStrByte(k41_itemName3, 26), k41_df.format(k41_iPrice3), k41_amount3,
				k41_df.format(k41_iPrice3 * k41_amount3)); // ���ڸ� ���� �ִ� 26���� �ڸ���, �ܰ�, ���� , ���� �ݾ��� ����Ѵ�.
		System.out.printf("[%s]\n", k41_itemCode3);
		System.out.printf("              �����հ�%26s\n", k41_df.format(k41_supPrice)); //ǰ�� 3���� ���ް��� �� ���ļ� ����Ѵ�.
		System.out.printf("                �ΰ���%26s\n", k41_df.format(k41_totalTax));	//�ΰ����� �� ���ļ� ����Ѵ�.
		System.out.println("------------------------------------------------");
		System.out.printf("�Ǹ��հ�%40s\n", k41_df.format(k41_totalPrice)); 
		System.out.println("================================================");
		System.out.printf("�ſ�ī��%40s\n", k41_df.format(k41_totalPrice));
		System.out.println("------------------------------------------------");
		System.out.printf("�츮ī��                        538720**********\n");
		System.out.printf("���ι�ȣ %s %17s %5s\n", "77982843(0)", "���αݾ�",
				k41_df.format(k41_totalPrice));
		System.out.println("================================================");
		System.out.printf("%28s %s\n", getPresentTime(1), "�д缭����");	//�Ű������� 1�� �־� ���� �ð��� ����Ѵ�.
		System.out.printf("��ǰ �� ��Ÿ���� : 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("%32s\n", "2112820610158231");
		System.out.println("------------------------------------------------");
		System.out.printf("  �� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�\n");
		System.out.printf("    ȸ������ �� �پ��� ������ ����������! ��");

	}

	// ����ð� ���ϴ� �Լ�. ���ǿ� ���� ����ϴ� ������ �ٲ�.
	public static String getPresentTime(int order) {
		Calendar k41_cal = Calendar.getInstance();	// ���� �ð��� �ޱ����� ���� ��ü ����.
		String k41_getTime = "";	// �Ʒ� ���ǹ��� ���� ���� �ð��� ���ڿ��� �����Ѵ�.
		if(order == 1) {	//
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");	// ���� �ð� ����ϴ� ����� �����ش�.
			k41_getTime = k41_time.format(k41_cal.getTime());	//���� �ð��� �� ���ڿ��� �����Ѵ�.
		} else if(order == 2) {// �Ű����� ���� 1�� �ƴ� ��� 14���� ���ϰ� "MM/dd" �������� �ð��� �������ش�. 
			k41_cal.add(Calendar.DATE, 14);	// ���� �ð��� 14���� �����ִ� ��.
			SimpleDateFormat k41_time = new SimpleDateFormat("MM��dd��");	// ������ "MM/dd"�� �����ش�.
			k41_getTime = k41_time.format(k41_cal.getTime());	//���� �ð��� �� ���ڿ��� �����Ѵ�.( ��¥�� ������ 14�� ������)
		} 
		return k41_getTime;	//���ǿ� ���� ���� ���ڿ��� ��������.
	}

	// �ѱ� �ڸ��� ���� �߰��ϴ� �Լ�
	public static String subStrByte(String k41_source, int k41_cutLength) { // �Ű������� �ڸ� �����, �ڸ��� ���� �޴´�.
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
				if (k41_sb.toString().getBytes().length == k41_cutLength-1) { 
					//���ڿ��� �ѱ� ũ�� ������ �����ؼ� ��ĭ �����Ҷ�, �Ʒ� ������ �����Ѵ�.
					k41_sb.append(" ");	// ������ �߰��Ѵ�.
				}

				return k41_sb.toString();	//������ ���ڿ��� �������ش�.
			}
		} else {	// ���ڿ��� �ƹ��͵� ���ٸ� �Ʒ� ������ �����Ѵ�.
			return "";	//�״�� �����ش�.
		}
	}

}
