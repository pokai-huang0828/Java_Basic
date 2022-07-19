package demo;
import java.text.DecimalFormat;

public class Test5{
	public static void main(String[] args) {
		double balance = 123456.789;
		// 加上千分號與小數點二位之字串放在 message 變數中
		// Print message by println()
		
		// 1. use String.format() 字串格式化
		String message = String.format("%,.2f", balance);

		System.out.println(message); // result = 123,456,79

		// ==================================================

		double exchange = 12345.5;

		DecimalFormat nf = new DecimalFormat("####,####.00");

		System.out.println(nf.format(exchange)); // result = 1,2345.50
	}
}