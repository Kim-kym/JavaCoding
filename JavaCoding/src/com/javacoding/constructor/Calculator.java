package com.javacoding.constructor;

class CalculatorEx {
	int left, right;
	
	//	클래스 이름과 동일한 메소드 선언 
	//	메소드에는 파라미터, 매개변수가 존재 
	//	전역변수에 값을 세팅  
	//	생성자, constructor 
	//	클래스가 생성될 때 자동으로 클래스와 똑같은 이름의 생성자가 
	//	실행되도록 약속되어 있고 어떤 메소드보다 먼저 실행되기로 약속됨 
	//	그러니까 초기화 작업을 할 수 있다 
	public CalculatorEx(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println(this.left + this.right);
	}
}


public class Calculator {

	public static void main(String[] args) {
		
		
		//	그러니까 CalculatorEx(10, 20)
		//	=>클래스가 아니라 생성자라는 걸 의미
		// 	인스턴스 = new 생성자
		//	뭔가 어떤 객체를 만들 때 반드시 해야될 일이 있다면
		//	생성자에게 그 절차를 포함시켜서 놓치지않게 할 수 있다
		CalculatorEx c1 = new CalculatorEx(10, 20);
		c1.sum();
		c1.avg();

		CalculatorEx c2 = new CalculatorEx(20, 40);
		c2.sum();
		c2.avg();
	}

}
