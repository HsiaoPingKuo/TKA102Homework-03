package hw1;
/*請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
5 + 5
5 + ‘5’
5 + “5”
並請用註解各別說明答案的產生原因
 */
public class Q6 {
	public static void main(String[]arge) {
		
		System.out.println(5 + 5);//數字5和數字5的數學相加
		
		System.out.println(5 + '5');//數字5和'5'的unicode 35(十六進位)轉換為十進位後的數值53的數學相加
		
		System.out.println(5 + "5");//數字5和文字5的字串串聯
				
				
	}

}
