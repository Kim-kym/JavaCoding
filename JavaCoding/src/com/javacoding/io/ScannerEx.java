package com.javacoding.io;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); //	System.in : 사용자가 입력할 값, 스캐너를 뉴하면, 
//		//	생성하게 되면 스캐너라는 객체는 사용자가 입력할 값을 스캐닝, 알아내겠다는 의미,
//		//	그리고 그 값을 sc라는 변수에 담겠다는 의미 
//		int i = sc.nextInt(); //	sc라는 객체는 nextInt라는 메소드를 가지고 있는데
//		//	실행을 멈추고 입력값을 기다리겠다는 의미. 듣고 있겠다는 의미 
//		System.out.println(i*1000);
//		sc.close();
		
//		Scanner sc = new Scanner(System.in); 
//		while(sc.hasNextInt()) { //	사용자가 값을 입력할 때까지 대기,
//			//	두가지 동작을 하는데 엔터를 치면 중지되어있던 자바를 다시 실행시키고 
//			//	정수라면 트루를 뜻하고 문자나 특수문자가 입력되면 false로 인식해 반복문을 멈추게한다 
//			System.out.println(sc.nextInt()*1000);
//		}
//		sc.close();	
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				while(sc.hasNextInt()) {
					System.out.println(sc.nextInt()*1000);	
				}
				sc.close();
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
	}

}
