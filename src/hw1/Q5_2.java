package hw1;

public class Q5_2 {
//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行
//請用程式計算10年後，本金加利息共有多少錢
/*FV = PV(1 + R)^n
* FV（Future Value，未來總值）
* PV（Present Value，期初本金） 
* R（Interest Rate，每期利率）
* n（Number of Periods，總期數）*/

public static void main(String[]args) {
			double pv = 150 , r = 0.02 ;
			int n = 10 ;
			double x = 1 + r;
			//次方的公式
			double futureValue = pv * Math.pow(x, n);
			System.out.println(n + "年後本金加利息共有");
			System.out.println(futureValue + "萬元");			
	}

}
