package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	Scanner sc = new Scanner(System.in);
	//마트에서 고객에게 할인 혜택을 제공하려고 한다
	//물건의 총 가격과 회원 여부를 입력받아, 
	//회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라	
	public void ex1(){
	System.out.print("가격을 입력하세요 : ");
	int numP = sc.nextInt();
	

	System.out.print("멤버십 있으세요?(있으면 true / 없으면 false 입력)");
	boolean mem = sc.nextBoolean();
	
	String result1 = mem ? "할인을 포함한 최종 금액"  + numP*0.9 + "원" :
		"할인을 포함한 최종 금액"  + numP*0.95 + "원";
	
	System.out.println(result1);
	
	

	}


	// ATM에서 사용자가 원하는 금액을 입력하면,
	// 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
	// ex) 사용자가 123000원을 입력하면,
	//	   5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함
	public void ex2() {
		System.out.print("출금할 금액 입력 : ");
		int v2 = sc.nextInt();
		
		int b50 = v2/50000;
		v2 %= 50000;
		
		int b10 = v2/10000;
		v2 %= 10000;
		
		int b5 = v2/5000;
		v2 %= 5000;
		
		int b1 = v2/1000;
		v2 %= 1000;
		
		System.out.println("50000원 : " + b50);
		System.out.println("10000원 : " + b10);
		System.out.println("5000원 : " + b5);
		System.out.println("1000원 : " + b1);
	}

	
	//사용자로부터 두 개의 정수를 입력받아, 
	//첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
	//만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력
	public void ex3() {
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		
		String result3 = num1%num2 == 0 ? "배수입니다" : "배수가 아닙니다";
		
		System.out.println(result3);
	}
}
