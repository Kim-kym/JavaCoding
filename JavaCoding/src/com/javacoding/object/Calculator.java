package com.javacoding.object;

public class Calculator {
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}

	public static void main(String[] args) {
		//	아래의 로직이 1000줄 짜리의복잡한 로직이라고 가정하자
//		System.out.println(10 + 20);
//		System.out.println(20 + 40); // 중복의 제거는 중요하다 
		sum(10,20);
		sum(20,40);
	
	}

}
