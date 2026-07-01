package hw1;
//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)

public class Q2 {
	public static void main(String[] args) {
		int egg = 200 , unit = 12;
		
		int dozon1 = egg / unit;
		int remainder1 = egg % unit;
		
	System.out.println(egg+"個雞蛋等於");
//		System.out.println(dozon1 + "打");
//		System.out.println(remainder1 + "顆");
		System.out.println(dozon1 + "打"+ remainder1 + "顆");
		
	}
}
