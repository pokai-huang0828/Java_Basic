package demo;

public class Test3 {
	public static void main(String[] args) {
		// 判斷身分證

		// places = {
		// 	'A':(10, "臺北市"), 'B':(11, "臺中市"), 'C':(12, "基隆市"), 'D':(13, "臺南市"),
  //         	'E':(14, "高雄市"), 'F':(15, "新北市"), 'G':(16, "宜蘭縣"), 'H':(17, "桃園市"),
  //         	'I':(34, "嘉義市"), 'J':(18, "新竹縣"), 'K':(19, "苗栗縣"), 'M':(21, "南投縣"),
  //         	'N':(22, "彰化縣"), 'O':(35, "新竹市"), 'P':(23, "雲林縣"), 'Q':(24, "嘉義縣"),
  //         	'T':(27, "屏東縣"), 'U':(28, "花蓮縣"), 'V':(29, "臺東縣"), 'W':(32, "金門縣"),
  //         	'X':(30, "澎湖縣"), 'Z':(33, "連江縣")
  //     	}

		String id = "H123995957";

		char gender = id.charAt(1); // 取資料的第二碼
		char before = id.charAt(2); // 取資料的第三碼

		System.out.printf("身分證碼: %s\n", id);
		System.out.printf("身分證第二碼: %c\n", gender);
		System.out.printf("身分證第三碼: %c\n", before);

		// if - else 判斷性別
		if(gender == '1') {
			System.out.println("Gender: Male");
		} else if (gender == '2') {
			System.out.println("Gender: Female");
		} else {
			System.out.println("Error gender input.");
		}

		// switch 判斷性別
		// 使用時機：單一變數的恆等式(==)判斷可以使用
		switch (gender) {
			case '1':
				System.out.println("Gender: Male");
				break;
			case '2':
				System.out.println("Gender: Female");
				break;
			default:
				System.out.println("Error, not defind your gender.");
		}

		// 判斷設籍前身份 switch
		switch (before) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
				System.out.println("設籍前身份：其他");
				break;

			case '6':
				System.out.println("設籍前身份：取得國籍之外國人");
				break;

			case '7':
				System.out.println("設籍前身份：無戶籍國民");
				break;

			case '8':
				System.out.println("設籍前身份：港澳居民");
				break;

			case '9':
				System.out.println("設籍前身份：大陸地區人民");
				break;

			default:
				System.out.println("Error, 資料錯誤.");
		}

		// 擷取字串區間
		String name = "Kenny";
		System.out.println(name.substring(2,4)); // 顯示 2 - 3

	}
}