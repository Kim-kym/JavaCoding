package com.javacoding.classinstance;

//	유효범위란변수를 전역변수, 지역변수 나눠서 관리하기 편리하도록 한 것 
//	메소드가 전역변수를 사용하고 있다는 것은 메소드가 이 객체에 종속되어 있다는 걸 의미
//	이 객체에 의존하고 있기 때문에, 
//	만약에 메소드가 인자. 파라미터를 통해 메소드 안으로 데이터를 끌어올 수 있는 상황이라면
// 	전역변수를 사용하는 것보다 더 바람직하다고 볼 수 있다 



class C {
	int v = 10;	//	전역변수 
	
	void m() {
		int v = 20;	
		System.out.println(v);
		System.out.println(this.v);
			//this 가 붙게 되면 그 객체에 대한 전역의 의미를 갖게 된다 

	}
}


public class Scope {
	

	//	C라는 클래스를 c1이라는 인스턴스에 담고 c1 인스턴스에 있는 m 이라는 메소드 호출 
	public static void main(String[] args) {
		C c1 = new C();
		c1.m();

	}

}
