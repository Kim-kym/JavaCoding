package com.javacoding.classinstance;

//	인스턴스 변수는 인스턴스마다 다른 값을 가지는 변수인데 
//	클래스 변수는 클래스 변수이기 때문에 클래스에 따라 만들어진 모든 인스터스들은 
//	그 클래스 변수가 갖고 있는 값을 자연스레 가지게 된다 
// 	Static 이란 키워드가 가진 변수는 이 변수가 클래스에 소속이 된다는 것이고
//	모든 메소드에서, 인스턴스에서 동일한 값을 가져온다는 것을 의미한다 

//	클래스 변수를 사용하는 용도 
//	인스턴스에 따라변하지 않는 값이 필요한 경우 
//	인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우 
//	값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우 

class CalculatorEx {
	static double PI = 3.14;
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

public class Calculator {

	public static void main(String[] args) {
		
		CalculatorEx c1 = new CalculatorEx(); 
		System.out.println(c1.PI);
		
		CalculatorEx c2 = new CalculatorEx();
		System.out.println(c2.PI);
		
		System.out.println(CalculatorEx.PI);
		

	}

}
