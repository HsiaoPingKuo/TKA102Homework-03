package hw3;

import java.util.Arrays;
import java.util.Scanner;

//正三角形、等腰三角形、其它三角形或不是三角形
public class Q1 {
	public static void main(String[] args) {
		System.out.println("Input number:");
		Scanner sc = new Scanner(System.in);
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();

		int[] a = { data1, data2, data3 };
		Arrays.sort(a);
		if ((a[0]+a[1])<=a[2]) {
			System.out.println("不是三角形");
		} else if ((a[0] == a[1]) && (a[1] == a[2])) {
			System.out.println("正三角形");
		} else if ((a[0] * a[0] + a[1] * a[1]) == a[2] * a[2]) {
			System.out.println("直角三角形");
		} else if (((a[0] == a[1]) && (a[1] != a[2])) || ((a[1] == a[2] && a[2] != a[0]))) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}
	}

}
