package PacA;

public class Character {
	int num;
	String name;
	int age;
	double offensePower;
	double defensePower;
	double hp;
	double mp;
	
	public Character(int num,String name, int age, double offensePower, double defensePower) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.offensePower = offensePower;
		this.defensePower = defensePower;
	}
	
	public Character(String name, int age, double offensePower, double defensePower) {
		this.name = name;
		this.age = age;
		this.offensePower = offensePower;
		this.defensePower = defensePower;
	}
	public Character(int num,String name, int age, double offensePower, double defensePower, double hp, double mp) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.offensePower = offensePower;
		this.defensePower = defensePower;
		this.hp = hp;
		this.mp = mp;
	}	
	
	public void print() {
		System.out.println(num+"." + name + " / age : " + age + "/ offensePower : " + offensePower + 
				" / defensePower : " + defensePower);
	}
	public void printPoints() {
		System.out.println(num+"." + name + " / age : " + age + "/ offensePower : " + offensePower + 
				" / defensePower : " + defensePower+" HP : " + hp + " MP : " + mp);
	}
}
