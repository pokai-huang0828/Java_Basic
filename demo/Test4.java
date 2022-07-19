package demo;

public class Test4 {
	public static void main(String[] args) {
		int money = 98765432;
		double bmi = 23.56789;
		double area = 1987.5678;
		char gender = '男';
		boolean isPass = true;
		String message = "Hello";

		// Format
		System.out.printf("money = %d\n", money);
		System.out.printf("money = %,d\n", money);

		System.out.printf("BMI = %f\n", bmi);
		System.out.printf("BMI = %.2f\n", bmi);
		System.out.printf("Area = %,.2f\n", area);
		System.out.printf("Gender = %c\n", gender);
		System.out.printf("Is pass? %b\n", isPass);
		System.out.printf("Message = %s\n", message);

		double h = 170;
		double w = 60;
		h = h / 100;
		bmi = w / (h*h);

		System.out.printf("\n身高(公分): %.1f\n體重(kg): %.1f\nBMI: %.1f\n", h*100, w, bmi);
		
	}
}