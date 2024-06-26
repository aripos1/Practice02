package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해주세요");
		System.out.print("년도 : ");
		int birth = sc.nextInt();
		int year = 2023;
		int age = year-birth;
		
		System.out.println("올해 :"+ year);
		System.out.println("태어난해 : "+birth);
		System.out.println("나이 : "+ age);
		System.out.println("=======================");
		
		boolean even = birth%2==0;
		boolean odd = year%2==0;
		
		if (age<20) {
			System.out.println("20살미만 건강검진대상이 아님");
		}else if(age>=20) {
			System.out.println("20살이상");
			
			if(even&&odd||!even&&!odd) {
				System.out.println("건강검진해");
				if(age>40) {
					System.out.println("암 검사O");
				}else {
					System.out.println("암 검사X");
				}
			
			}else {
				System.out.println("건강검진 X");
			}
		}
		
	}
}
