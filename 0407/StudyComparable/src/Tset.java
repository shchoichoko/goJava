public class Tset {
	public static void main(String[] args) {
		Student a = new Student(17, 2);
		Student b = new Student(18, 1);

		int isBig = a.compareTo(b);
		
		if(isBig > 0) {
			System.out.println("a객체가 b객체보다 큽니다.");
		}
		else if(isBig == 0) {
			System.out.println("두 객체의 크기가 같습니다.");
		}
		else {
			System.out.println("a객체가 b객체보다 작습니다.");
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