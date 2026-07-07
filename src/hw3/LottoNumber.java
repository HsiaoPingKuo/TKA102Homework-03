package hw3;

import java.util.Scanner;

public class LottoNumber {
	public static void main(String[]args) {
		System.out.println("請輸入不要的數字:");
		Scanner sc = new Scanner(System.in);
		int numberDontWant = sc.nextInt();
		System.out.println("請輸入要抽取幾個數字:");
		int numberOfNumber = sc.nextInt();
		LottoNumber lotto = new LottoNumber();
		int[]result=lotto.getNumber(numberDontWant,numberOfNumber);
		lotto.printnumber(result);		
	}			
			
	public int[] getNumber(int number,int time) {
		int[] x = new int[time];
		int index = 0;
		while(number>9||number<1) {
				System.out.println("請重新輸入:");
		}
		
		while(index<time) {
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
		return x;	
	}		
			
			
	public void printnumber(int[] x) {		
			for(int i = 0;i<x.length;i++) {
				System.out.print(x[i]+"\t");
			}
	}

}
