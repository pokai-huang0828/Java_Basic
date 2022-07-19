// Java 與 User 互動
import java.util.Scanner;

public class Hello7{
	public static void main(String[] args) {
		// 雞兔同籠，上有35顆頭，下有94足。問雞兔個幾隻？
		// System.out.println("雞兔同籠，上有35顆頭，下有94足。問雞兔個幾隻？\n");
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入雞 + 兔的總數: ");
		int h = scanner.nextInt();
		System.out.print("請輸入雞腳 + 兔腳的總數: ");
		int f = scanner.nextInt();

		int r = (f - (h*2))/2;
		int c = h - r;

		System.out.println("兔子有 " + r + " 隻");
		System.out.println("雞有 " + c + " 隻");

	}
}