package api;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int a = Math.abs(-10);
		// abs 메소드는 인자로 넘긴 데이터의 절대값을 반환
		System.out.println(a);
		
		int b = Math.max(1,  9);
		// max 메소드는 전달된 데이터 중 더 큰 수를 반환 
		System.out.println(b);
		
		int c = Math.min(1, 9);
		// min 메소드는 전달된 데이터 중 더 작은 수를 반환
		System.out.println(c);
		
		double d = Math.random();
		System.out.println(d);
		
		double e = Math.ceil(1.1);
		// 전달된 데이터를 올림하여 반환
		System.out.println(e);
		
		double f = Math.floor(9.9);
		// 전달된 데이터를 내림하여 반환
		System.out.println(f);
		
		long g = Math.round(5.3);
		long h = Math.round(5.7);
		// 전달된 데이터를 반올림하여 반환
		System.out.println(g);
		System.out.println(h);
		
		// Scanner 로 3개 수의 수를 입력받아 최대값 최소값 구하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 수를 입력: ");
		int num2 = scan.nextInt();
		
		System.out.print("세번째 수를 입력: ");
		int num3 = scan.nextInt();
		
		int max, min;
		
		max = Math.max(num1,  num2);
		max = Math.max(max,  num3);
		
		min = Math.min(num1,  num2);
		min = Math.min(min,  num3);
		
		System.out.println("최대값: " + max);
		System.out.println("최대값: " + min);
		
		
		
	}

}
