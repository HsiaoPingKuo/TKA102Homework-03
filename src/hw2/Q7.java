package hw2;
//請設計一隻Java程式，輸出結果為以下：
//A 65
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF 70
public class Q7 {
	public static void main(String[]args) {
	char a = 'A';
	int x = a;
	int i;
	int j ;
		for(j = 1;j<=6;j++) {
			for(i = 1;i<=j;i++) {
				System.out.print((char)x);			}
			x++;
			System.out.println();
		}		
	}
}
