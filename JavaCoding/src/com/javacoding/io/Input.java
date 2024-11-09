package com.javacoding.io;

public class Input {
	//	String 은 문자열, []은 문자를 담을 수 있는 배열을 의미
	//	args 라는 이름을 가진 변수를 정의할 건데 그 변수는 
	//	문자열을 담을 수 있는 배열이라는 의미 
	//	중괄호 사이에 있다라는 것은 메인이라는 메소드의 파라미터, 즉 입력값이라는 의미
	//	void 는 출력값이 존재하지 않는다는 의미 
	//	System~ 은 파라미터 
	//	args.length	사용자가 인풋이라는 애플리케이션을 실행할 때
	//	이 프로그램 안으로 전달한 입력값의 수를 의미한다 

	
	public static void main(String[] args) {
//		System.out.println(args.length);
		for(String e : args) {
			System.out.println(e); 
		}

	}

}
