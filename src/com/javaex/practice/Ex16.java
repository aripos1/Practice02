package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자 : ");
		
		int x =sc.nextInt();
		
		if(x<=0) {
			double result=x*x*x-(9*(x))+2;
			System.out.println("계산결과는 "+result+" 입니다.");
		}else if(x>0) {
			double result=(7*(x))+2;
			System.out.println("계산결과는 "+result+" 입니다.");
		}
		
	}

}
