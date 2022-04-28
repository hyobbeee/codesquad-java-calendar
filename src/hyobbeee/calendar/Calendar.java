package hyobbeee.calendar;

import java.util.Scanner;

public class Calendar {

//	반복횟수를 입력하세요.
//	3 (엔터)
//
//	월을 입력하세요.
//	1
//	2
//	3
//
//	1월은 31일까지 있습니다.
//	2월은 28일까지 있습니다.
//	3월은 31일까지 있습니다.

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		System.out.println("반복 횟수를 입력하세요.");
		int times = scanner.nextInt();
		
		for (int i = 0; i < times; i++) { // n번 반복하는 코드
			System.out.println("달을 입력하세요.");
			int month = scanner.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month)); // 메소드 생성
		}

		System.out.println("--반복 횟수 종료--");
		scanner.close();
	}
}
/*			
// 내가 만든 코드 
		int i = 1;
		while (i <= times) {
			System.out.println(times + "번");
			i++; // 없으면 무한루프 됨.
		
		System.out.println("월을 입력하세요.");
		int month = scanner.nextInt();
		int cnt = times;

		while (cnt <= month) {
			cnt++;
			System.out.printf("%d월은 %d일까지 있습니다. \n", cnt, cal.getMaxDaysOfMonth(cnt)); // 메소드 생성
		}
*/
