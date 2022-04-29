package api;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		long time1 = System.currentTimeMillis();
		// 현재시간을 읽어서 밀리세컨드값을 long으로 준다.
		System.out.println(time1);

		long time2 = System.nanoTime();
		// 현재시간을 읽어서 나노세컨드 값을 long으로 준다. 
		System.out.println(time2);

		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			// 시간체크
		}

		long end = System.currentTimeMillis();

		System.out.println("for문 만번 돈 시간: " + (end - start));

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("시스템 종료할까요? 1.YES 2.NO");

			int choice = scan.nextInt();

			if (choice == 1) {
				System.exit(0);
			}
			else {
				System.out.println("시스템은 계속 돌아갑니다.");
			}
		}

	}

}