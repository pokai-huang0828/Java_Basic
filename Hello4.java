// 變數＋數學計算
// 資料型態
// 整數 int
// 浮點數 double

public class Hello4 {
	public static void main(String[] args){
		// 半徑等於10，求圓面積 ＝ ？
		final double pi = 3.14; //final --> 表示設定後不變值
		int r = 12; 			// r 	-->	變數，可依需要改變

		System.out.println(r * r * pi);

		r = 20; 				// r 變數後的數值，不用重複定義
		// pi = 3.1415926; --> 因為 final ，無法重新定義
		System.out.println(r * r * pi);

		// 若 r = 15，球體積 = ?
		r = 15;
		double volume = 4.0/3*pi*r*r*r;
		
		System.out.println(volume);
	}
}