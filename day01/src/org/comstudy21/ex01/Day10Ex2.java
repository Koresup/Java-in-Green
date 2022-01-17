package org.comstudy21.ex01;

import java.util.Scanner;
import static java.lang.System.out;

public class Day10Ex2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 가위 바위 보 게임
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		System.out.print("철수 >> ");
		String str1 = sc.next();
		System.out.print("영희 >> ");
		String str2 = sc.next();
		
		if (str1.equals("가위")) {
			if (str2.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			} else if (str2.equals("가위")) {
				System.out.println("비겼습니다.");
			} else if (str2.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}
		}
		
		if (str1.equals("바위")) {
			if (str2.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			} else if (str2.equals("바위")) {
				System.out.println("비겼습니다.");
			} else if (str2.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
		}
		
		if (str1.equals("보")) {
			if (str2.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			} else if (str2.equals("보")) {
				System.out.println("비겼습니다.");
			} else if (str2.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}
		}
		
		sc.close();
	}
}
