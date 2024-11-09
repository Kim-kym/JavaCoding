package com.javacoding.method;

/*	메소드는 이미 정의해은 로직을 재활용할 수 있다
 *	이는 코드의 양을 줄일 수 있다는 의미. 
 *	즉 유지보수가 용이해진다 
 * 	물론 메소드의 활용법은 다양하다 
 * 	
 */ 

public class Study {
	public static void numbering( ) {
	int i = 0;
	while (i < 10) {
		System.out.println(i);
		i++;
	}
}	/* 중괄호 사이 구간이 numbering 메소드 내용 
	   즉 정의 

	   main 은 약속이다, 하고자 하는 작업이 있다면 main 이라는 이름을 갖고있는 
	   메소드를 정의해서 그 메소드의 본문에
	
	   하고자하는 작업을 위치시키게 된다. */
	
	/*	limit 라는 변수 정의 
	 * 	고정적인 것과 가변적인 것을 나누는 것이 프로그래밍의 기본 
	 *	int limit 는 매개 변수라고 하고 영어로는 parameter 라고 한다 
	 *	입력값을 정의하기 위한 변수 
	 */
	public static void numbering(int limit) {
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void numbering(int init, int limit) {	// 인자가 전달 될 순서를 결정하고 매개변수와 매개변수 사이를 ,로 구분한다 
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	


	public static void main(String[] args) {
//		numbering();	//메소드 호출(실행) 
//		numbering();
//		numbering();// 세번 반복 시행할 경우
		
		numbering(5);	//	입력값을 활용할 수도 있다 
						//	5는 인자, argument 이다
		numbering(3, 5);	//init 를 활용해 3부터 5까지의 값을 출력할 수 있다, 인자와 인자 사이의 구분은 , 
		
		}
	
	}
