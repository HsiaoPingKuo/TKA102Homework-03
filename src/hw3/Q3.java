package hw3;
//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數

import java.util.Scanner;

public class Q3 {
	public static void main(String[]args ) {
		System.out.println("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
//		int	random=(int)(Math.random()*49);
			int i ;
			int sum = 0;
			while(number>9||number<1) {
				System.out.println("請重新輸入:");
				number = sc.nextInt();
			}
			while(number<=9 && number>=1) {
				for(i=1;i<=49;i++) {
					if(i/10!=number&&i%10!=number) {
						System.out.print(i+" ");
						sum++;
					}
				}
				System.out.print("可以選"+sum+"個數字");
			break;
		}
		
	}
}
