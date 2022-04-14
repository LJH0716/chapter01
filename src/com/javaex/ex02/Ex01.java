package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		String s = "한";		
		String str = "굿모닝";
		String name = "이정화";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		
		System.out.print("안녕");
		System.out.println("하세요");
		//ln은 줄바꿈
		
		
		System.out.println(str + str + "안녕하세요");
		System.out.println(str + i);
		String var01 = str+i; //i가 문자열로 형 변환 
		System.out.println(var01);
		
		System.out.println(str + "랑" + i);
		System.out.println(str + " 랑 " + i);//공백 ,띄어쓰기
		
		System.out.println(str + " " + d);
		
		System.out.println(i + i);
		System.out.println(d + d);
		System.out.println(d + i);
		
		System.out.println(c);
		System.out.println(c + c); //결과값이 한한 이 아니라 코드값으로 계산처리해버림
		
		System.out.println(s);
		System.out.println(s + s);
		
		System.out.println("제이름은 " + name + " 입니다.");
		
		System.out.println("===========================");
		
		System.out.println("안녕\n하세요"); // \n은 줄바꿈
		System.out.println("안녕\t하세요"); //spacebar와 tab의 차이
		System.out.println("안녕히\t하세요");
		
		System.out.println("안녕\"하\"세요"); //문자열 안에 있는 따옴표,하나의 문자처럼 처리
		System.out.println("안녕\\하\\세요");
		
		
	
	}
}
