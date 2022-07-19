public class Hello5{

	public static void main(String[] args){

		int x = 11;
		int y = 0b01011; 	// 0b 表示後面是二進制資料
		int a = 0xab; 		// 0x 表示後面是16進位資料
		int b = 017;		// 0  表示後面為8進位資料

		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y); // == -> 等於
		System.out.println(a);
		System.out.println(b);
		System.out.println(20997462839L); // 數值過億要加 L 

		// =====================================================================
		// 工程標記(科學記號)
		// 表示 -> 4200000
		// 需要使用double

		double c = 42e5; 		// 42 * 10的5次方 Not a good answer
		System.out.println(c);

		double d = 4.2e6;		// 4.2 * 10的6次方
		System.out.println(d);	// 科學記號不可用兩位數 Good

		float f = 3.14f;		// 因為Java浮點預設值為double，所以無法執行
								// 需要在數值最後加上 f or F 轉變型態
		System.out.println(f);

		// =====================================================================
		// 字元

		char i = '中';
		char j = 'A';
		char k = 65;			// 放數字會轉成ASCII Code 於下面連結查詢
								// https://zh.wikipedia.org/wiki/ASCII

		char m = '\uu0041'; 	// \\u 表示 unicode 編碼，使用' '放字元， " "放字串
		System.out.println(i);
		System.out.println(j);
		System.out.println(k); 
		System.out.println(m);

		// =====================================================================
		// 布林值 Boolean
		// 不是放 true 就是 false

		boolean t = true;
		boolean u = false;
		boolean v = 85 >= 60;
		boolean w = 85 <= 60;

		System.out.println(t);
		System.out.println(u);
		System.out.println(v);
		System.out.println(w);

		// =====================================================================
		// 變數的宣告
		// type idnetifier = [value]

		int ageOfStudent = 18;		// 駝峰命名法 most used in Java
		char sex_of_student = 'M';	// 匈牙利命名法 most used in Python 

	}
}