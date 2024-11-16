package com.javacoding.classinstance;



class CalculatorEx2 {
	
	//	sum 메소드는 static 키워드를 붙여줌으로서 클래스 메소드가 됨
	//	클래스에 직접 접근해	사용할 수 있다 
	//	단순한 계산을 위해서, 인스턴스를 만들어 메모리를 늘려나갈 필요없이 
	//	마치 일회용처럼 클래스 소속의 메소드를 활용해서 코드를 작성할 수도 있다 
	
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2); 
	}
}

public class Calculator2 {
	//	인스턴스가 존재하지 않음 

	public static void main(String[] args) {
		CalculatorEx2.sum(10, 20);
		CalculatorEx2.avg(10, 20);
		
		CalculatorEx2.sum(20, 40);
		CalculatorEx2.avg(20, 40);
		
		CalculatorEx2.sum(30, 60);
		CalculatorEx2.avg(30, 60);

	}

}
