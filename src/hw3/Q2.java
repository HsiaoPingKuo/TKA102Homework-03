package hw3;

import java.util.Scanner;

//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息
//猜對則顯示正確訊息,如圖示結果
//進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
public class Q2 {
	public static void main(String[] args) {
		System.out.println("請輸入一個0~100的數字:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int	random=(int)(Math.random()*101);
		
		while(number>100||number<0) {
			System.out.println("請重新輸入:");
			number = sc.nextInt();
		}
		while(number!=random) {
			if(number>random) {
				System.out.println("猜錯了QQ 大於正確答案喔");
			}
			else{
				System.out.println("猜錯了QQ 小於正確答案喔");
			}
			System.out.println("請重新輸入數字:");
			number = sc.nextInt();
		}		
		System.out.println("猜對了~~~~~~數字就是"+random);
		
	}
}