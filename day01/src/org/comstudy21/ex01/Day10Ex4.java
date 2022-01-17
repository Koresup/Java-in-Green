package org.comstudy21.ex01;

import java.util.Scanner;

public class Day10Ex4 {

//	public static void main01(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("원화를 입력하세요(단위 원) >> ");
//
//		int won = sc.nextInt();
//
//		double dollar = (double) won / 1100;
//		System.out.println(won + "원은 " + "$" + dollar + "입니다.");
//
//	}

//	public static void main02(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("2자리수 정수 입력(10~99) >> ");
//
//		int num = sc.nextInt();
//		int num10 = num / 10;
//		int num1 = num % 10;
//		String c;
//
//		c = (num10 == num1) ? "Yes! 10의 자리와 1의 자리가 값습니다." : "No! 10의 자리와 1의 자리가 다릅니다.";
//
//		System.out.println(c);
//
//	}

//	public static void main03(String[] args) {
//
//		int money = 0;
//		int[] cash = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
//		Scanner sc = new Scanner(System.in);
//		System.out.print("금액을 입력하시오 >> ");
//
//		money = sc.nextInt();
//
//		for (int i = 0; i < cash.length; i++) {
//			System.out.printf("%d원 : %d개\n", cash[i], money / cash[i]);
//			money %= cash[i];
//		}
//		sc.close();
//
//	}

//	public static void main04(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 3개 입력 >> ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//
//		if ((a > b && b > c) || (a < b && b < c)) {
//			System.out.println("중간 값은 " + b);
//		} else if ((a > c && c > b) || (a < c && c < b)) {
//			System.out.println("중간 값은 " + c);
//		} else {
//			System.out.println("중간 값은 " + a);
//		}
//		sc.close();
//
//	}

//	public static void main05(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 3개 입력하시오 >> ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		if ((a+b)<=c || (b+c)<=a || (c+a)<=b) {
//			System.out.println("삼각형이 안됩니다.");
//		} else {
//			System.out.println("삼각형이 됩니다.");
//		}
//		
//	}

//	public static void main06(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
//
//		int a = sc.nextInt();
//		int b = a / 10;
//		int c = a % 10;
//
//		if ((c == 3) || (c == 6) || (c == 9)) {
//			if ((b == 3) || (b == 6) || (b == 9)) 
//				System.out.println("박수짝짝");
//			else 
//				System.out.println("박수짝");
//		} else if ((b == 3) || (b == 6) || (b == 9)) {
//			System.out.println("박수짝");
//			
//		} else {
//			System.out.println("해당없습니다.");
//		}
//		
//	}

//	public static void main07(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점 (x, y)의 좌표를 입력하시오 >> ");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//
//		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
//			System.out.printf("(%d,%d)는 사각형 안에 있습니다", x, y);
//		else
//			System.out.printf("(%d,%d)는 사각형 안에 없습니다", x, y);
//
//	}

//	public static void main11_1(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("달을 입력하세요(1~12) >> ");
//		
//		int m = sc.nextInt();
//		
//		if ((m == 3) || (m == 4) || (m ==5))
//			System.out.println("봄");
//		else if ((m == 6) || (m == 7) || (m ==8))
//			System.out.println("여름");
//		else if ((m == 9) || (m == 10) || (m ==11))
//			System.out.println("가을");
//		else if ((m == 12) || (m == 1) || (m ==2))
//			System.out.println("겨울");
//		else
//			System.out.println("잘못입력");
//		
//	}

//	public static void main11_2(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("달을 입력하세요(1~12) >> ");
//		int m = sc.nextInt();
//		
//		switch(m) {
//		case 3: 
//		case 4: 
//		case 5: 
//			System.out.println("봄");
//			break;
//		case 6: 
//		case 7: 
//		case 8: 
//			System.out.println("여름");
//			break;
//		case 9: 
//		case 10: 
//		case 11: 
//			System.out.println("가을");
//			break;
//		case 12: 
//		case 1: 
//		case 2: 
//			System.out.println("겨울");
//			break;
//		default :
//			System.out.println("잘못입력");
//			break;
//		}
//	}

//	public static void main12_1(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("연산 >> ");
//
//		double n1 = sc.nextDouble();
//		String c = sc.next();
//		double n2 = sc.nextDouble();
//		double result = 0.0;
//
//		if (c.equals("+"))
//			result = n1 + n2;
//		else if (c.equals("-"))
//			result = n1 - n2;
//		else if (c.equals("*"))
//			result = n1 * n2;
//		else if (c.equals("/")) {
//			if (n1 == 0 || n2 == 0) {
//				System.out.println("0으로 나눌 수 없습니다.");
//			} else
//				result = n1 / n2;
//		}
//		System.out.printf("%.0f %s %.0f의 계산결과는 %.0f", n1, c, n2, result);
//		sc.close();
//
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산 >> ");

		double n1 = sc.nextDouble();
		String c = sc.next();
		double n2 = sc.nextDouble();
		double result = 0.0;

		switch (c) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/": {
			if (n1 == 0 || n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else
				result = n1 / n2;
		}
		}
		System.out.printf("%.0f %s %.0f의 계산결과는 %.0f", n1, c, n2, result);
		sc.close();
	}
}
