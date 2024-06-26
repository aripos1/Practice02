package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해주세요");
		System.out.print("년도 : ");
		
		int y = sc.nextInt();
		int old = 2023 - y;
		
		if (old>=65||old<15) {
			System.out.println(old+"살 무료예방접종대상자 입니다.");
		}else {
			System.out.println(old+"살 무료예방접종대상자가 아닙니다.");
		}
	
		sc.close();
	}
}
