package hyobbeee.calendar;

import java.util.Scanner;

public class Calendar {

// 변수와 if문, 배열을 활용해 월을 입력하면 그 달이 몇일로 구성되어 있는지 출력하는 프로그램 작성하기 


//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in); //scanner클래스 객체 생성 
//		System.out.println("달을 입력하세요.");
//		String s1;	// 변수 선언   
//		s1 = scanner.next();
//		int n = Integer.parseInt(s1); //정수를 받는다
//		
//		if (n % 2 == 0) { // 짝수
//			System.out.println(n + "월은 30일까지 있습니다.");
//			if (n == 2) {
//				System.out.println(n + "월은 27~29일까지 있습니다.");			
//			}
//		} else if (n % 2 != 0) { // 홀수 
//			System.out.println(n + "월은 31일까지 있습니다.");
//		} 
//	}
//}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int month = scanner.nextInt();
		scanner.close();
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d월은 %d일까지 있습니다. \n", month, maxDays[month - 1]);
	}
}