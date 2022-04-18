import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt2 {

	public static void main(String[] args) {

		//���̼� ��ǰ
		String k41_itemName1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";
		String k41_itemCode1 = "1031615";
		int k41_iPrice1 = 3000;
		int k41_amount1 = 1;
		String k41_itemName2 = "�����̵�ĸ���(������)(100ȣ)";
		String k41_itemCode2 = "11008152";
		int k41_iPrice2 = 1000;
		int k41_amount2 = 1;
		String k41_itemName3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		String k41_itemCode3 = "1020800";
		int k41_iPrice3 = 1000;
		int k41_amount3 = 1;
		// �ΰ��� ���
		double k41_tax1 = getTax(k41_iPrice1);
		int k41_price1 = k41_iPrice1 - (int)k41_tax1;
		double k41_tax2 = getTax(k41_iPrice2);
		int k41_price2 = k41_iPrice2 - (int)k41_tax2;
		double k41_tax3 = getTax(k41_iPrice3);
		int k41_price3 = k41_iPrice3 - (int)k41_tax3;
		cutString(k41_itemName1);
		//�޸����
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		//�ؽ�Ʈ
		System.out.printf("%23s\n","���ΰ���, ���̼�");
		System.out.println("(��)�Ƽ����̼�_�д缭����");
		System.out.printf("��ȭ: 031-702-6016\n");
		System.out.println("����:���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.println("��ǥ:������,��ȣ�� 213-81-52063");
		System.out.println("����:��⵵ ������ �д籸 �д��53���� 11(����");
		System.out.println("��)");
		System.out.println("================================================");
		System.out.printf("%27s\n","�Һ����߽ɰ濵(CCM) �������");
		System.out.printf("%29s\n","ISO 9001 ǰ���濵�ý��� �������");
		System.out.println("================================================");
		System.out.printf("          ��ȯ/ȯ�� 14��(%s)�̳�,\n",getRefundTime());
		System.out.printf("(����)������, ����ī�� ���� �� ���Ը��忡�� ����\n");
		System.out.printf("       ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("         üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.println("================================================");
		System.out.printf("%.14s %11d %2d %6d\n",subStrBytes(k41_itemName1,26),k41_iPrice1, k41_amount1, k41_iPrice1 * k41_amount1);
		System.out.printf("[%s]\n",k41_itemCode1);
		System.out.printf("%.14s %13d %2d %6d\n",subStrBytes(k41_itemName2,26),k41_iPrice2, k41_amount2, k41_iPrice2 * k41_amount2);
		System.out.printf("[%s]\n",k41_itemCode2);
		System.out.printf("%.14s %11d %2d %6d\n",subStrBytes(k41_itemName3,26),k41_iPrice3, k41_amount3, k41_iPrice3 * k41_amount3);
		System.out.printf("[%s]\n",k41_itemCode3);
		System.out.printf("              �����հ�%26s\n",k41_df.format(k41_price1 + k41_price2 + k41_price3));
		System.out.printf("              �ΰ���%28s\n",k41_df.format(k41_tax1 + k41_tax2 + k41_tax3));
		System.out.println("------------------------------------------------");
		System.out.printf("�Ǹ��հ�%40s\n",k41_df.format(k41_iPrice1 + k41_iPrice2 + k41_iPrice3));
		System.out.println("================================================");
		System.out.printf("�ſ�ī��%40s\n",k41_df.format(k41_iPrice1 + k41_iPrice2 + k41_iPrice3));
		System.out.println("------------------------------------------------");
		System.out.printf("�츮ī��                        538720**********\n");
		System.out.printf("���ι�ȣ %s %17s %s\n", "77982843(0)","���αݾ�",k41_df.format(k41_iPrice1 + k41_iPrice2 + k41_iPrice3));
		System.out.println("================================================");
		System.out.printf("%28s %s\n", getPresentTime(),"�д缭����");
		System.out.printf("��ǰ �� ��Ÿ���� : TEL)1522 - 4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("%32s\n","2112820610158231");
		System.out.println("------------------------------------------------");
		
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
	// ȯ������ ���ϱ�
	public static String getRefundTime() {
		Calendar k41_cal = Calendar.getInstance();
		k41_cal.add(Calendar.DATE, 14);
		SimpleDateFormat k41_time = new SimpleDateFormat("MM/dd");
		return k41_time.format(k41_cal.getTime());
	}
	
	//���� �ڸ���
	public static String cutString(String k41_a) {
		String cut = k41_a.substring(0,14);
		return cut;
	}
	//�ѱ� ����Ʈ�� �ڸ���
	public static String subStrBytes(String source, int cutLength) {
		if(!source.isEmpty()) {
			source = source.trim();
			if(source.getBytes().length <= cutLength) {
				return source;
			} else {
				StringBuffer sb = new StringBuffer(cutLength);
				int cnt = 0;
				for(char ch : source.toCharArray()) {
					cnt += String.valueOf(ch).getBytes().length;
					if(cnt > cutLength) break;
					sb.append(ch);
				}
				return sb.toString() + " ";
				
			}
			
		} else {
			return "";
		}
	}

}
