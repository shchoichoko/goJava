package PacA;

import PacB.AdditionalB;

public class Main {

	public static void main(String[] args) {
		
		Character ch = new Character(1,"A",200,30.5,32.1);
		Character ch2 = new Character(2,"B",123,47.1,18.9);
		Character ch3 = new Character(3,"C",765,21.6,42.3);
		Character ch4 = new Character(4, "Bread", 30, 95, 55.5, 150, 100);
		ch.print();
		ch2.print();
		ch3.print();
		ch4.printPoints();
		AdditionalB addB = new AdditionalB();
		addB.printA();
		AdditionalA addA = new AdditionalA();
		addA.printA();
		
		
		
	}

}
