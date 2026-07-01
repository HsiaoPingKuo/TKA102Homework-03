package hw1;

public class Q5_3 {
//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行
//請用程式計算10年後，本金加利息共有多少錢
/*FV = PV(1 + R)^n
 * FV（Future Value，未來總值）
 * PV（Present Value，期初本金） 
 * R（Interest Rate，每期利率）
 * n（Number of Periods，總期數）
 */

	public static void main(String[]args) {
		double pv = 150 , r = 1.02 ;
		int n;	
		for(n=1; n<=10;n++) {
			pv*=r;
		}
	System.out.print(pv+"萬元");
		
		}
		
}
