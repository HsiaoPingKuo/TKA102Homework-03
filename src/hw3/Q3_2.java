package hw3;
//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數
//進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複???
//陣列、亂數、條件判斷、迴圈

import java.util.Arrays;
import java.util.Scanner;
public class Q3_2 {
	public static void main(String[]args) {
	System.out.println("請輸入數字:");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int[] x = new int[6];
	int index = 0;
		while(number>9||number<1) {
			System.out.println("請重新輸入:");
			number = sc.nextInt();
		}
		while(index<6) {
		int random =(int)(Math.random()*49+1);
			if(random%10!= number && random/10!= number) {
				boolean y = false;
				for(int i=0;i<=index;i++) {
					if(x[i]==random) {
						y= true;
					}
				}
				if(y == false) {
					x[index]= random;
					index++;
				}
			}
		}
		for(int i = 0;i<x.length;i++) {
			System.out.print(x[i]+"\t");
		}
	}
}
