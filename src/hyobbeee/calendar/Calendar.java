package hyobbeee.calendar;

public class Calendar {

	private static final int[] LAST_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 평년
	private static final int[] LEAP_LAST_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 윤년

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) // 연수가 4로 떨어지면 윤년 그리고 연수가 100으로 나눠지면 평년 혹은 연수가 400으로 나눠떨어지면 윤년으로 둔다.
			return true;
		else
			return false;
	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_LAST_DAYS[month - 1]; // 배열은 첫번째 자리가 0부터 시작하기 때문에 1빼줌 
		} else {
			return LAST_DAYS[month - 1];
		}
	}

//	월을 입력받는다.
//	1일의 요일을 입력받는다.
//	출력한다.

	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("     <<%4d년%2d월>>\n", year, month); // % 뒤의숫자는 차지하는 자릿
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");
		
		//print blank space
				for (int i = 0; i < weekday; i++) {
					System.out.print("   ");
				}
		
		int maxDay = getMaxDaysOfMonth(year, month);
		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;
		/*
		 if (count < 7){
		 	delim = count;
		 } else {
		 	delim = 0;
		 }	
		 */
		
		//print first line
		for(int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println(); // 줄바꿈 문자
		
		//print from second line to last
		count++;	// 4부터 숫자 출력?
		for (int i = count; i <= maxDay; i++) {
			System.out.printf("%3d", i); // %3d : 스페이스 포함 3칸 자리를 차지한다.
			if (i % 7 == delim) // 7 나눠서 나머지가 delim 일때마다 줄바꿈 > 7번 돌때마다
				System.out.println(); // 줄바꿈 문자
		}
		System.out.println();
		System.out.println();
	}
}
