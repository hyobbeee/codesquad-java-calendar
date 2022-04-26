package hyobbeee.calendar;

import java.util.Scanner;

public class Calendar {

// 키보드로 입력받은 두 숫자의 합을 구한다.
	
//	public static void main(String[] args) {
//		System.out.println("두 수를 입력하세요.");
//		Scanner scan = new Scanner(System.in); //scanner클래스 객체 생성 /system.in : 키보드로 받는다.
//		String[] data = scan.nextLine().split(",");
//		int n = Integer.parseInt(data[0]);
//		int m = Integer.parseInt(data[1]); 
//		System.out.println("두수의 합은 " + n * m + " 입니다.");
//	}

	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해 주세요.");
		s1 = scanner.next(); // 
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);

		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a + b); //printf => %d 자리 변수삽입 가
		scanner.close();// import 파일 열었으면 닫기 
	}
}
