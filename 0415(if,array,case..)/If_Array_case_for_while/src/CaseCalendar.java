
public class CaseCalendar {
	// #10 case�� �� 22.04.15 csh
	public static void main(String[] args) {
		for (int k41_i = 1; k41_i < 13; k41_i++) {		//���� ������ �����ϱ� ���� ��
			System.out.printf(" %d�� =>", k41_i);		//���� �����ؼ� ǥ���ϱ� ���� ��
			LOOP: for (int k41_j = 1; k41_j < 32; k41_j++) {	// ���� ������ �����ϱ� ���� ��.
				System.out.printf("%d,", k41_j);	// ���ڸ� ����ϴ� ��
				switch (k41_i) {		//������ ������ ���������� switch case��
				case 4: case 6: case 9: case 11:
					if (k41_j == 30) {		//4,6,9,11�� �϶��� 30�ϱ����� ����ϴ� ��
						System.out.println("");	// ������ ���� ���� ���� ��
						break LOOP;			//������ �������� ��, ���� LOOP������ ���ư��� ��.
					}	break;
				case 2:
					if (k41_j == 28) {
						System.out.println("");// ������ ���� ���� ���� ��
						break LOOP;			//������ �������� ��, ���� LOOP������ ���ư��� ��.
					}	break;
				default:	//���� case �� ���� ������ ������ ������ ������ ����ϱ� ���� ��.
					if (k41_j == 31) {
						System.out.println("");// ������ ���� ���� ���� ��
						break;				// �ش� �ݺ����� ����� ��
					}
				}
			}
		}

	}

}
