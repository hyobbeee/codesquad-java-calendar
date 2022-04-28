package hyobbeee.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> "; //변경이 없을시 대문자로 표기
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;

		while (true) { // 무한루프
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt(); // int형 정수를 입력받는 매서드
			if (month == -1) {
				System.out.println("1~12 사이의 값만 입력할 수 있습니다.");
				break;
			}
			if (month >= 13) {
				System.out.println("1~12 사이의 값만 입력할 수 있습니다.");
				continue; // 만나면 반복의 처음으로 돌아간다.
			}
			cal.printCalendar(2022, month); //
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
