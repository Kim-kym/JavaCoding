package com.javacoding.Inheritance;

//	오버라이딩 조건 
//	-메소드 이름, -메소드 매개변수와 데이터타입 그리고 순서, 메소드의 리턴 타입이 같아야 한다 
//	부모 클래스가 가지고 있는 기본적인 기능에 필요에 따라 자식 클래스에서 변경 또는 추가하는 것 

class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	} 
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class SubstractionableCalculator extends Calculator {	//	확장 
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();		

	}

}
