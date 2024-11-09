package com.javacoding.method;

//	numbering 은 메소드 이름 
//	String 은 리턴할 값이 반드시 문자열이라는 것을 의미 
//	그렇다면 result 라는 메소드는 반드시 String 의 데이터 타입을 받는 그릇이라 할 수 있다 
//	void 가 메소드 이름 앞에 붙게 되면 메소드의 return 값은 존재하지 않다고 선언하는 것  

public class study2 {
	public static String numbering(int init, int limit) {
		int i = init;
		//	만들어지는 숫자들을 output 이라는 변수에 담기 위해서 변수에 빈 값을 준다 
		String output = " ";
		while ( i < limit) {
			//	숫자를 화면에 추력하는 대신 변수 output 에 담았다 
			output += i;
			i++;
		}
		//	중요!!! output 에 담겨 있 문자열을 메소드 외부로 반환하려면 아래와 같이 
		//	return 을 배치하면 된다 
		
		return output;
		
	}
	
	

	public static void main(String[] args) {
		//	메소드 numbering 이 리턴한 값이 변수 result 에 담긴다 
		String result = numbering(1, 5);
		//	변수 result 의 값을 화면에 출력한다  
		System.out.println(result);

	}

}
