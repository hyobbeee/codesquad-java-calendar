package hyobbeee.calendar;

import java.util.Scanner;

public class Calendar {


	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
// 전단계와 비슷하게 반복입력을 받을 수 있게 구현한다.
//	입력하는 곳 앞에 프롬프트를 출력한다.
//	-1을 입력받는 경우 프로그램을 종료한다.

	public static void main(String[] args) {

		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1 ;
		
		while (true) { // month가 -1이 아닌동안 반복하겠다.
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				System.out.println("1~12 사이의 값만 입력할 수 있습니다.");
				break;
			}	
			if (month >= 13) {
				System.out.println("1~12 사이의 값만 입력할 수 있습니다.");
				continue; // 만나면 반복의 처음으로 돌아간다. 
			}
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month)); // 메소드 생성
		}

		System.out.println("--반복 횟수 종료--");
		scanner.close();
	}
}

//		int month = scanner.nextInt();
//
//		for (int i = 0; i < month; i++) { // n번 반복하는 코드
//			System.out.println("달을 입력하세요.");
//			System.out.print(PROMPT);
//			int month = scanner.nextInt();
//			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month)); // 메소드 생성
//		}

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
