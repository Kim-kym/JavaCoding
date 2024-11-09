package com.javacoding.object;

//	class 란 지금부터 칼큘레이터이엑스라는 객체의 설멸서를 컴퓨터에게 알려주겠다는 의미 
//	객체라는 것은 하나의 독립된 프로그램처럼 볼 필요가 있다
//	그 프로그램은 변수와 메소드의 집합, 프로그램 안에 작은 프로그램 

class CalculatorEx {
	
	int left, right;
	
	//  this. 은 우리가 생성한 c1 에 담겨있는 인스턴스를 가리킴 
	//	위에 적힌 변수를 가리키게 된다, 인스턴스 자신이다 
	//	우항의 값은 매개변수를 통해 들어온 값을 가리킨다 
	
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	
		//	위 인스턴스에 저장된 값들로 아래 메소드를 수행하게 된다 
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class Calculator3 {
	
	public static void main(String[] args) {
		//	실제(구체적인) 객체 c1을 인스턴스라고 한다
		//	c1 이라는 변수는 CalculatorEx라는 객체를 담을 수 있는 컨테이너라고 할 수도 있고 
		// 	CalculatorE 는 데이터 타입이라고 할 수 있다 
		//	결과적으로 우리는 데이터 타입을 직접 만든 거라고 할 수 있다 
		//	new CalculatorEx() 안에 위에 쓴 클래스의 모든 내용이 담겨있다 
		//	그래서 어떻게 보면 객체를 만들고 클래스를 만든다는 것은 사용자 정의 데이터 타입을 
		//	만든다는 것을 의미한다 
		
		CalculatorEx c1 = new CalculatorEx();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		CalculatorEx c2 = new CalculatorEx();
		c2.setOprands(20,40);
		c2.sum();
		c2.avg();		
		
	}
}
	
	

