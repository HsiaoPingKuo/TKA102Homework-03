package hw2;

public class WhileDoWhile {
	public static void main(String[]args) {
		int j;
		int i = 1;
		while(i<=9) {
			j=1;
			do {System.out.print(i+"*"+j+"="+i*j+'\t');
				j++;
			}while(j<=9);
			i++;
			System.out.println();
		}
		
	}

}
