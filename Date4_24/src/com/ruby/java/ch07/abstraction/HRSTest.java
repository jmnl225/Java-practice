package com.ruby.java.ch07.abstraction;

abstract class Employee {
	
	String name;
	int salary;
	
	
	public abstract void calcSalary();
}

abstract class Salesman extends Employee {
	
	public void calsSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매수당");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		
		System.out.println("Consultant 급여= 기본급+ 컨설팅 특별 수당");
	}
}

class Director extends Manager {
	
}

public class HRSTest {
	public static void main(String[] args) {
		Salesman s= new Salesman();
		Consultant c = new Consultant();
		Manager m= new Manager();
		
		s.calcSalary();
		c.calcSalary();

		
	}
}

