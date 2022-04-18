import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt3 {

	public static void main(String[] args) {
		// ǰ��
		String [] k41_itemName = {"��������","�ٳ�������","������","�������ֽ�","���ڿ���","�����ð�","��ô���(1kg/��)","�õ��ߴٸ�","��귣�嵵�ö���","�����Ӽҽ�230g",
				"���÷���ũ 500g","����(1.8kg/��)","��귣��ͽ���800g","������ī(ȥ��)","���� ��ȣ��","�ε巯��ġ��252","�޺���ݸ�(2��/��)","�ķ������� �����","���� ���ִ¿��� 1L","���ϸ��緹�κ��청",
				"������ҺҰ��","�����ڵ����250ml(�ΰ����Ǻο�)","��귣�� �ֺ�����Ĩ","����ݶ�(500ml*12/1Box)","����������ġ100g*3","������ä��ġ100g*3","�������20L","���� �ķ�ġ�������ڸ�","�Ե�ũ��Ű3����102g","ǥ�����(��)"};
		// �ܰ�
		int[] k41_price = {1000, 2500, 3300, 25000, 500, 750, 3280, 4990, 4580, 2680,
				3680,2780,9980,1980,2580,6600,4580,2680,4580,3500,
				9900,3600,1480,8500,2220,4480,660,2200,2400,3000};
		// ����
		int[] k41_num = {2,4,1,1,10,5,1,2,1,1,
				1,1,1,2,2,1,1,1,2,1,
				1,1,1,1,1,1,1,1,1,2};
		// �鼼����. true�� ����, false�� �鼼
		boolean[] k41_taxfree = {true, true, false, true, true, true, false, false, true, true,
				true,false,true,false,false,true,false,false,true,true,
				false,true,true,true,true,true,false,true,true,false};
		//�鼼 �հ� ���� �� ����� ���� ����.
		int k41_taxExemption = 0; int k41_priceTotal = 0;
		double k41_tax = 0;
		//getTax(k41_iPrice1)
		//�޸����
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
		//��ºκ�
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.println("*�Ϻ� �귣����� ����(���� ����������)");
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("[����]%s %22s\n",getPresentTime(),"POS:0011-9861");
		System.out.println("---------------------------------------------");
		System.out.printf("   �� ǰ ��            �� ��   ����    ��  ��\n");
		System.out.println("---------------------------------------------");
		for(int k41_i = 0; k41_i < k41_itemName.length;k41_i++) {
			subStrBytes(k41_itemName[k41_i],26);
			if(k41_taxfree[k41_i] == false) {	// �鼼���� false�� *�ְ� �ƴϸ� ��ĭ �ֱ�.
				System.out.printf(" * ");
			} else {
				System.out.printf("   ");
			}
			System.out.printf("%s %7s %3d %9s\n",k41_subStrByte(k41_itemName[k41_i],20), k41_df.format(k41_price[k41_i]), k41_num[k41_i], k41_df.format(k41_price[k41_i] * k41_num[k41_i]));
			if((k41_i+1)%5==0) {
				System.out.println("---------------------------------------------");
			}
			if(k41_taxfree[k41_i] == false) {
				k41_taxExemption += k41_price[k41_i];
			} else {
				k41_tax += getTax(k41_price[k41_i]);
				k41_priceTotal += k41_price[k41_i] - getTax(k41_price[k41_i]);
			}
			
		}
		System.out.printf("%25s %14d\n", "�� ǰ�� ����", k41_price.length);
		System.out.printf("%26s %14s\n", "(*)�� ��  �� ǰ", k41_df.format(k41_taxExemption));
		System.out.printf("%26s %14s\n", "�� ��  �� ǰ", k41_df.format(k41_priceTotal));
		System.out.printf("%27s %14s\n", "��   ��   ��", k41_df.format((int)k41_tax));
		System.out.printf("%28s %14s\n", "��        ��", k41_df.format(k41_taxExemption+k41_priceTotal+(int)k41_tax));
		System.out.printf("%11s %27s\n", "�� �� �� �� �� ��", k41_df.format(k41_taxExemption+k41_priceTotal+(int)k41_tax));
		System.out.println("---------------------------------------------");
		System.out.printf("%14s %28s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%11s %18s %6s\n", "ī�����(IC)", "�Ͻú� /",k41_df.format(k41_taxExemption+k41_priceTotal+(int)k41_tax) );
		System.out.println("---------------------------------------------");
		System.out.printf("%23s\n", "[�ż�������Ʈ ����]");
		System.out.println("   ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%10s %17s %9d\n", "��ȸ�߻�����Ʈ", "9350**9995", 164);
		System.out.printf("%12s %18s %5s\n","����(���)����Ʈ", "5,637(", "5,473)");
		System.out.printf("%20s\n","*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.println("---------------------------------------------");
		System.out.printf("%22s\n","���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%9s %30s\n","������ȣ :", "34��****" );
		System.out.printf("%9s %31s\n","�����ð� :", getPresentTime2() );
		System.out.println("---------------------------------------------");
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
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm");
			return k41_time.format(k41_cal.getTime());
		}
		// �ʱ��� �����ִ� ��
		public static String getPresentTime2() {
			Calendar k41_cal = Calendar.getInstance();
			SimpleDateFormat k41_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
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
		   public static String k41_subStrByte(String k41_source, int k41_cutLength) {
		         if (!k41_source.isEmpty()) {
		            k41_source = k41_source.trim();// ���� �ڸ���
		            if (k41_source.getBytes().length < k41_cutLength) {
		               for (int k41_i = k41_cutLength - k41_source.getBytes().length; k41_i > 0; k41_i--) {
		                  k41_source += " ";
		               }
		               return k41_source;
		            } else {
		               StringBuffer k41_sb = new StringBuffer(k41_cutLength);
		               int k41_cnt = 0;
		               for (char k41_ch : k41_source.toCharArray()) {
		                  k41_cnt += String.valueOf(k41_ch).getBytes().length;
		                  if (k41_cnt > k41_cutLength)
		                     break;
		                  k41_sb.append(k41_ch);
		               }
		               
		               if(k41_sb.toString().getBytes().length == 19) {
		                  k41_sb.append(" ");
		               }
		               
		               return k41_sb.toString();
		            }
		         } else {
		            return "";
		         }
		      }
}
