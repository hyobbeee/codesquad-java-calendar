package hyobbeee.calendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 평년
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 윤년

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) // 연수가 4로 떨어지면 윤년 그리고 연수가 100으로 나눠지면 평년 혹은 연수가 400으로 나눠떨어지면
																	// 윤년으로 둔다.
			return true;
		else
			return false;
	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1]; // 배열은 첫번째 자리가 0부터 시작하기 때문에 1빼줌 
		} else {
			return MAX_DAYS[month - 1];
		}
	}

//  월을 입력하면 해당월의 달력을 출력한다.
//	달력은 모양은 1단계에서 작성한 모양으로 만든다.
//	1일은 일요일로 정해도 무방하다.
//	-1을 입력받기 전까지 반복 입력받는다.
//	프롬프트를 출력한다.

	public void printCalendar(int year, int month) {
		System.out.printf("     <<%4d년%2d월>>\n", year, month); // % 뒤의숫자는 차지하는 자릿
		System.out.println(" SU MO TU WE TH FI SA");
		System.out.println("----------------------");

		
		
		int maxDay = getMaxDaysOfMonth(year, month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i); // %3d : 스페이스 포함 3칸 자리를 차지한다.
			if (i % 7 == 0) // 7 나눠서 나머지가 0 일때마다 줄바꿈 > 7번 돌때마다
				System.out.println();
		}
		System.out.println();

//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}
}