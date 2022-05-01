package hyobbeee.calendar;

import java.util.Scanner;

public class Prompt {

	/**
	 * 
	 * @param week : 요일 
	 * @return 0 ~ 6 (0 = Sunday, 6 = Saturday)
	 */
	
	public int parseDay(String week) {
		if (week.equals("SU")) return 0; 
		else if (week.equals("MO")) return 1;
		else if (week.equals("TU")) return 2;
	 	else if (week.equals("WE")) return 3;
	 	else if (week.equals("TH")) return 4;
	 	else if (week.equals("FR")) return 5;
	 	else if (week.equals("SA")) return 6;
	 	else
			return 0; // 혹시 이상한거 하면 0번으로 한다.
		} 
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int year = 2022; // 디폴트 값 아무거나 해도 상관X
		int month = 1;
		int weekday = 0;

		while (true) { // 무한루프
			System.out.println("연도를 입력하세요.(exit : -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if (year == -1)
				break; // 무한루프 빠져나가는 코드
			
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt(); // int형 정수를 입력받는 매서드
			
			System.out.println("첫번째 요일을 입력하세요.(SU, MO, TU, WE, TH, FR, SA)");
			System.out.print("WEEKDAY> ");
//			char weekday = scanner.next().charAt(0); // 입력문자의 첫번째 값을 받는다.
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			if (month > 12 || month < 1) {
				System.err.println("1~12월 사이의 값만 입력할 수 있습니다.");
				continue; // 만나면 반복의 처음으로 돌아간다.
			}
			cal.printCalendar(year, month, weekday);
		}

		System.out.println("--반복 횟수 종료--");
		scanner.close();
	}
	public static void main(String[] args) {
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
