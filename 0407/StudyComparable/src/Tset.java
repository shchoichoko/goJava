public class Tset {
	public static void main(String[] args) {
		Student a = new Student(17, 2);
		Student b = new Student(18, 1);

		int isBig = a.compareTo(b);
		
		if(isBig > 0) {
			System.out.println("a��ü�� b��ü���� Ů�ϴ�.");
		}
		else if(isBig == 0) {
			System.out.println("�� ��ü�� ũ�Ⱑ �����ϴ�.");
		}
		else {
			System.out.println("a��ü�� b��ü���� �۽��ϴ�.");
		}

	}
}

class Student implements Comparable<Student> {
	int age;
	int classNumber;

	Student(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}

	@Override
	public int compareTo(Student o) {
		return this.age = o.age;
	}

}