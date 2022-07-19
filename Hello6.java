// 變數Java與使用者User互動
import java.util.Scanner;

public class Hello6 {
	public static void main(String[] args){
		// 建立一個 Scanner 物件
		// System.in -> 系統輸入，預設指的是鍵盤。
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入身高：");
		double h = scanner.nextDouble(); // 將輸入資料轉換成 double

		System.out.print("請輸入體重：");
		double w = scanner.nextDouble();

		System.out.println("身高：" + h);
		System.out.println("體重：" + w);

		// 計算BMI 
		double hInM = h * 0.01;
		double bmi = w/(hInM*hInM);
		double bmi_format = 

		System.out.println("您的BMI值為:" + bmi);

	}
}