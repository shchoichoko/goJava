import java.text.DecimalFormat;

public class PrintReceipt {

	public static void main(String[] args) {
		//#17 ĭ ���� �μ� (������) 22.04.15 csh  

		String k41_item = "���";	
		int k41_unit_price = 5000;
		int k41_num = 500;
		int k41_total = k41_num * k41_unit_price ;
		
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		
		System.out.printf("=========================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "ǰ��", "�ܰ�", "����", "�հ�");
		System.out.printf("=========================================================\n");
		
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",
				k41_item, k41_df.format(k41_unit_price),k41_df.format(k41_num),
				k41_df.format(k41_total));
	}

}
