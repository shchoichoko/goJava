package AboutString;

import java.util.Scanner;

public class No10809 {

	public static void main(String[] args) {
//		���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
//		������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
//		���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		StringBuffer word = new StringBuffer(sc.nextLine());
		checkWord(word);
	}

	public static void checkWord(StringBuffer word) {

		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", 
				"i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		for (int i = 0; i < 26; i++) {
			System.out.print(word.indexOf(alphabet[i]));
			if(i!=25) {
				System.out.print(" ");
			}
		}
	}
}
