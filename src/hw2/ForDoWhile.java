package hw2;

public class ForDoWhile {
	public static void main(String[]args) {
		int i,j;
		for(i=1;i<=9;i++) {
			j=1;
			do {
				System.out.print(i+"*"+j+"="+i*j+'\t');
				j++;								
			}while (j<=9);
			System.out.println();
		}
		
	}

}
