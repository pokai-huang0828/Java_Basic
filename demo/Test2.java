package demo;

import java.util.Scanner;
/*

Use if - else to check your score

*/

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入分數成績: ");
		int score = scanner.nextInt();
		System.out.println("您所輸入的成績是: " + score);
		System.out.println("\n系統判斷中...\n");

		// 判斷等第使用 if - else
		if(score <= 100 && score >= 90){
			System.out.println("A");
		} else if (score < 90 && score >= 80) {
			System.out.println("B");
		} else if (score < 80 && score >= 70) {
			System.out.println("C");
		} else if (score < 70 && score >= 60) {
			System.out.println("D");
		} else if (score < 60 && score >= 0){
			System.out.println("E");
		} else {
			System.out.println("成績輸入錯誤！\n輸入的值必須於 0 - 100 間！");
		}


		// 判斷等地使用 switch - case
		// 95/10 = 9
		// 90/10 = 9
		if(score >= 0 && score <= 100){
			switch(score/10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("E");
			}
		} else {
			System.out.println("成績輸入錯誤！\n輸入的值必須於 0 - 100 間！");
		}
		
	}
}