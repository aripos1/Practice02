package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력주세요.");
		System.out.print("키 : ");
		int h = sc.nextInt();
		sc.nextLine();
	
		System.out.print("몸무게 : ");
		int kg = sc.nextInt();
		
		double x = (h-100)*0.9; // 표준체중
		
		if(kg<x) {
			System.out.println("저체중 입니다.");
		}else if(kg==x) {
			System.out.println("표준 입니다.");
		}else if(kg>x) {
			System.out.println("과체중 입니다.");
		}
		
		System.out.println("표준체중: "+x);
		sc.close();
	}
}
