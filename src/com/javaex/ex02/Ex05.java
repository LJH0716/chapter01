package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
	
	//숫자->문자열 받을 때 생기는 버그 해결법(문자->숫자는 버그 X)
			Scanner sc = new Scanner(System.in);
			
			System.out.println("나이를 입력해주세요");
			System.out.print("나이:");
			int age = sc.nextInt();
			
			sc.nextLine(); //<--개행문자로 처리해주기!
			
			System.out.println("이름을 입력해주세요");
			System.out.print("이름:");
			String name = sc.nextLine();
			
			
			System.out.println("당신의 이름은 "+ name +" 나이는 " +age+" 입니다.");
			
			sc.close();
		
		
		
	}

}
