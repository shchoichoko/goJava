package ChcekCorrect;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CheckPriceError {
	
	public static void main(String[] args) {

		String[] k41_OneRec = {
				"01   LG�����                  100,000   1  105,000",
				"02   �ٳ�������                  2,500   4   19,000",
				"03*  ������                      3,300   1    3,300",
				"04   �������ֽ�                 25,000   1   25,000",
				"05   ���ڿ���                      500  10    5,000",
				"06   �����ð�                      750   5    3,750",
				"07*  ��ô���(1kg/��)            3,280   1    3,280",
				"08*  �õ��ߴٸ�                  4,990   2    9,980",
				"09   ��귣�嵵�ö���            4,580   1    4,580",
				"10   �����Ӽҽ�230g              2,680   1    2,680",
				"11   ���÷���ũ 500g             3,680   1    3,680",
				"12*  ����(1.8kg/��)              2,780   1    2,780",
				"13   ��귣��ͽ���800g          9,980   1    9,980",
				"14*  ������ī(ȥ��)              1,980   2   15,960",
				"15*  ���� ��ȣ��                 2,580   2    5,160",
				"16   �ε巯��ġ��252             6,600   1    6,600",
				"17*  �޺���ݸ�(2��/��)          4,580   1    4,580",
				"18*  �ķ������� �����           2,680   1    2,680",
				"19   ���� ���ִ¿��� 1L          4,580   2    9,160",
				"20   ���ϸ��緹�κ��청          3,500   1    3,500",
				"21*  ������ҺҰ��              9,900   1    9,900",
				"22   �����ڵ����250ml(�ΰ���    3,600   1    3,600",
				"23   ��귣�� �ֺ�����Ĩ         1,480   1    1,480",
				"24   ����ݶ�(500ml*12/1Box)     8,500   1  155,500",
				"25   ����������ġ100g*3          2,220   1    2,220",
				"26   ������ä��ġ100g*3          4,480   1    4,480",
				"27*  �������20L                 660   1      660",
				"28   ���� �ķ�ġ�������ڸ�       2,200   1    2,200",
				"29   �Ե�ũ��Ű3����102g         2,400   1    2,400",
				"30*  ǥ�����(��)                3,000   2    6,000"
				
		};
		List<Integer> k41_wrongNum = new ArrayList<Integer>();	
		//���� �߻����� �� ������ �ľ��ϱ� ���� ����
		for (int k41_i = 0; k41_i < k41_OneRec.length; k41_i++) {
			//������ �ľ��ϱ� ���� for��
			System.out.println(k41_OneRec[k41_i]);
			if(getTotalPrice(k41_OneRec[k41_i]) != (getPrice(k41_OneRec[k41_i])*getEA(k41_OneRec[k41_i]))){
				k41_wrongNum.add(k41_i);	
				//�հ� �ݾװ� ���� �ܰ�*������ �հ� �ݾװ� ���̰� ������� �� ������ ����.
			}
		}
		for(int k41_i = 0; k41_i < k41_wrongNum.size(); k41_i++) {
			//������ �߻��� ����� �հ� �ݾ� ������ ���� ���.
			//���� �߻��� �Ǽ��� ���� �ݺ� �� ����.
			System.out.println("***********************************************************");	
			System.out.printf("����[%s]\n",k41_OneRec[k41_wrongNum.get(k41_i)]);
			String k41_fixed = fixTotalPrice(k41_OneRec[k41_wrongNum.get(k41_i)],
					(getPrice(k41_OneRec[k41_i])*getEA(k41_OneRec[k41_i])));
			// ������ ���ڿ�
			System.out.printf("����[%s]\n",k41_fixed);
			System.out.println("***********************************************************");	
		}
	}
	//���ڿ����� �ܰ� �κи� ������, ���������� �ٲ� ���� ��ȯ���ִ� �Լ�.
	public static int getPrice(String k41_inputString) {
		//�� ���� byteũ��� 51. String(k41_inputString.getBytes(),�ڸ��� ������ ����Ʈ ����,�ڸ� ����Ʈ ��)
		String k41_price = new String(k41_inputString.getBytes(),29,9);	//30��°���� 9byte��ŭ �ڸ���.
		k41_price = k41_price.trim().replaceAll(",", ""); //�޸��� �������ش�.
		int k41_intPrice = Integer.parseInt(k41_price); // ���ڿ��� ���������� ��ȯ.
		return k41_intPrice;
	}
	//���ڿ����� ���� �κи� ������, ���������� �ٲ� ���� ��ȯ���ִ� �Լ�.
	public static int getEA(String k41_inputString) {
		//�� ���� byteũ��� 51. String(k41_inputString.getBytes(),�ڸ��� ������ ����Ʈ ����,�ڸ� ����Ʈ ��)
		String k41_ea = new String(k41_inputString.getBytes(),38,4);	//39��°���� 4byte��ŭ �ڸ���.
		k41_ea = k41_ea.trim().replaceAll(",", "");//�޸��� �������ش�.
		int k41_intEA = Integer.parseInt(k41_ea);	// ���ڿ��� ���������� ��ȯ.
		return k41_intEA;
	}
	//���ڿ����� �հ� �ݾ� �κи� ������, ���������� �ٲ� ���� ��ȯ���ִ� �Լ�.
	public static int getTotalPrice(String k41_inputString) {
		//�� ���� byteũ��� 51��. String(k41_inputString.getBytes(),�ڸ��� ������ ����Ʈ ����,�ڸ� ����Ʈ ��)
		String k41_Totalprice = new String(k41_inputString.getBytes(),42,9);
		k41_Totalprice = k41_Totalprice.trim().replaceAll(",", ""); //�޸��� �������ش�.
		int k41_intTotalPrice = Integer.parseInt(k41_Totalprice); // ���ڿ��� ���������� ��ȯ.
		return k41_intTotalPrice;
	}
	//���� ����� ������ �ݾ��� �Ű������� �޾Ƽ� �޸� �߰��� ���ڿ��� �ٲ㼭 ��ȯ�ϴ� �Լ�.
	public static String fixTotalPrice(String k41_inputString,int k41_fixedPrice) {
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###");
		//�޸��� �ٽ� �߰��ϱ� ���� ��ü ����.
		String k41_Totalprice = new String(k41_inputString.getBytes(),0,42);
		// �հ� �ݾ� �κ��� ������ ���ڿ��� �̾Ƴ�.
		String k41_perfectVal = k41_df.format(k41_fixedPrice);	
		// k41_perfectVal : �հ�ݾ��� ������ ������ ������ ����.
		// �Ű������� �Է¹��� ������ �ݾ׿� �޸��� ��� ���ڿ��� ��ȯ.
		int k41_priceLength = k41_df.format(k41_fixedPrice).getBytes().length;
		// ��½� ���� ��Ʈ������ �ʵ��� �켱 ���� ����Ʈ ũ�⸦ ���ؼ� ������ ����.
		String k41_addBlank = "";	// ���ڶ� ����Ʈ ũ�⸦ ä���ֱ� ���� ���� ����� ����.
		if(k41_df.format(k41_fixedPrice).getBytes().length < 9) {
			//����Ʈ ũ�Ⱑ 9���� ���� ��� ������ �־��ִ� ��
			for(int k41_j = 0; k41_j <9-k41_priceLength; k41_j++ ) {
				k41_addBlank += " ";
			}
			k41_perfectVal = k41_addBlank + k41_perfectVal;
			// ������ �տ��� �־���� �ϱ� ������ ���� ������ ���ʿ� �ΰ� ����.
		}
		return k41_Totalprice+k41_perfectVal;	// ũ�⸦ 9����Ʈ�� ���缭 ������ ���� ��ȯ����.
	}
}
