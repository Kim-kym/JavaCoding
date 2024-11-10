package com.javacoding.overloading;

//	오버로딩 조건 
//	매개변수는 달라야 하지만 리턴 타입은 같아야 한다 
//	

class Calculator {
	int left, right;
	int third = 0;
	
	public void setOprands(int left, int right) {
		System.out.println("SetOprands(int left, int right)");
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right, int third) {
		System.out.println("setOprands(int left, int right, int third)");
		this.setOprands(left, right);
		this.third = third;
	}
	public void sum() {
		System.out.println(this.left+this.right+this.third);
	}
	public void avg() {
		System.out.println((this.left+this.right+this.third));
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.setOprands(10, 20, 30);
		c1.sum();
		c1.avg();
	}

}
