package com.javacoding.polymorphism;

class A {}

class B extends A {}

public class PolymorphismDemo1 {
	

	public static void main(String[] args) {
		A obj = new B ();
		// 클래스 B 로 객체를 만드는데 객체가 담겨 있변수의 데이터 타입이 A이다
		// 클래스 B 로 인스턴스를 만들었지만 obj 는 클래스 A의 데이터타입 행세를 하고 있다는 것이다
		// 이는 클래스 B 에 없는 메소드는 호출할 수 없다는 걸 의미한다 

	}

}
