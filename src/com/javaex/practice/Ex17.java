package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		/*
	• 세금계산법
    • 0원이상 1000만원 이하인 경우 tax:  0.09*수익
    • 1000만원 초과 4000만원 이하인 경우 tax:  1000*0.09 + 0.18*(수익-1000)
    • 4000만원 초과 8000만원 미만인 경우 tax:  1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
    • 8000만원 이상인 경우 tax:  1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금액: ");
		int price = sc.nextInt();
		
		if(price>=8000) {
			double tax =1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(price-8000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}else if(price>4000) {
			double tax =1000*0.09 + 3000*0.18 + 0.27*(price-4000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}else if(price>1000) {
			double tax =1000*0.09 + 0.18*(price-1000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}else if(price>=0) {
			double tax =0.09*price;
			System.out.println("소득세는 "+tax+" 입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
	}

}
