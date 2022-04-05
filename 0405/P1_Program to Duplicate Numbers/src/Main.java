import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		print();

	}

	public static void print() {
		Scanner sc = new Scanner(System.in);
		String inputStr1 = " ", inputStr2 = " ";
		int cnt = 0;

		System.out.println("Please input the first number set");
		inputStr1 = sc.nextLine();
		String[] splitArr = inputStr1.split(" ");
		double[] arr1 = new double[splitArr.length];
		for (int i = 0; i < splitArr.length; i++) {
			double temp = Double.parseDouble(splitArr[i]);
			arr1[i] = temp;
		}
		System.out.println("Please input the second number set");
		inputStr2 = sc.nextLine();
		String[] splitArr2 = inputStr2.split(" ");
		double[] arr2 = new double[splitArr2.length];
		for (int i = 0; i < splitArr2.length; i++) {
			double temp = Double.parseDouble(splitArr2[i]);
			arr2[i] = temp;
		}
		System.out.println("Print Same Numbers!");
		// 비교해서 같은 수 찾기
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					cnt++;
				}
			}
			if (cnt == 1) {
				System.out.print(arr1[i] + " ");
				cnt--;
			}

		}
	}

}
