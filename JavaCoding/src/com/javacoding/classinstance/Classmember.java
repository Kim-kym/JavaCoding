package com.javacoding.classinstance;

//	인스턴스 메소드(Static 을 갖고 있지 않은)는 클래스 멤버에 접근할 수 있다 
//	클래스 메소드는 인스턴스 멤버에 접근 할 수 없다

//	인스턴스 변수 -> Non-Static Field
//	클래스 변수 -> Static Filed  

class C1 {
	static int static_variable = 1;
	int instance_variable = 2;
	static void static_static() {
		System.out.println(static_variable); //	클래스 메소드가 클래스 변수에 접근할 떄 
	}
	static void static_instance() {
		//	클래스 메소드에서는 인스턴스 변수에 접근할 수 없다. 
//			System.out.println(instance_Variable);
	}
	void instance_static() {
		//	인스턴스 메소드에서는 클래스 변수에 접근할 수 있다 
		System.out.println(static_variable);
	}
	void instance_instance() {
		System.out.println(instance_variable);
	}
}

//public class Classmember {
//
//	public static void main(String[] args) {
//		C1 c = new C1();
//		c.static_static();
//		c.static_instance();
//		c.intstance_static();
//		c.instance_instance();
//		C1.static_static();
//		C1.static_instance();
//		C1.instance_static();
//		C1.instance_instance();
//		
//		Calculator c1 = new Calculator();
//		c1.setOprands(10, 20);
//		c1.sum();
//		c1.avg();
//
//		Calculator c2 = new Calculator();
//		c2.setOprands(20, 40);
//		c2.sum();
//		c2.avg();
//	}
//}
