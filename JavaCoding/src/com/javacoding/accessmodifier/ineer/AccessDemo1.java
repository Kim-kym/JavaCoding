package com.javacoding.accessmodifier.ineer;

class A {
	public String y() {	//public 은 누구나 사용할 수 있다 
	return "public void y()";
	}
	private String z() { //private 클래스 내부에서만 사용할 수 있다 
		return "public void z()";
	}
	public String x() {
		return z();
	}
	

public class AccessDemo1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		//	아래 코드는 오류가 발생한다.
		//System.out.println(a.z());
		//	따라서 private 요소인 z()를 사용하려면 아래와 같이 코드를 작성한다  
		System.out.println(a.x());
		
	}

	}

}
