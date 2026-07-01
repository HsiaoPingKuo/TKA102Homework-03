package hw2;
//使用for迴圈+while迴圈寫出九九乘法表
public class ForWhile {
	public static void main(String[]args) {
//		int i,j;
		for(int i=1;i<=9;i++) {
			int j=1;
			while(j<=9) {
				System.out.print(i+"*"+j+"="+i*j+'\t');
				j++;						
			}			
				System.out.println();				
		}
		
	}

}
