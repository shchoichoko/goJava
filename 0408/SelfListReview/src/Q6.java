import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ���� [1, 3, 5, 4, 2] ����Ʈ�� [5, 4, 3, 2, 1]�� ����� ����.
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,4,2));
		
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
	}

}
