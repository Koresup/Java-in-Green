package org.comstudy21.ex01;

import java.util.Scanner;
import static java.lang.System.out;

public class Day10Ex01 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 준비물 : 연습장(모눈종이 연습장), 연필, 지우개
		// 공부습솬, 실습습관 ... 하루에 12시간 정도 공부하기
		// 주말에도 공부습관
		
		// 반복문 활용
		int money = 0;
		int price = 240;
		int[] coin = { 5000, 1000, 500, 100, 50, 10 };

		out.printf("물건 값이 %d원입니다.\n", 240);
		out.print("현금 입력 : ");
		money = scan.nextInt();

		// 10,000원을 입력받았다면...?
		// 5,000원권 1장
		// 1,000원권 4장
		// 500원 1개
		// 100원 2개
		// 50원 1개
		// 10원 1개

		int change = money - price;
		out.println("잔돈은 총 : " + change + "원");
		for (int i = 0; i < coin.length; i++) {
			out.println(coin[i] + "원권 : " + change / coin[i]);
			change %= coin[i];
		}

	}
}
