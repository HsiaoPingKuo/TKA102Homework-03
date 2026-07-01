package hw1;
//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行
//請用程式計算10年後，本金加利息共有多少錢
/*FV = PV(1 + R)^n
 * FV（Future Value，未來總值）
 * PV（Present Value，期初本金） 
 * R（Interest Rate，每期利率）
 * n（Number of Periods，總期數）
 */
public class Q5 {
	public static void main(String[]args) {
		double pv = 150 , r = 0.02 ;
		int n = 10 ; 
//先將每年的利率做梯度運算		
		double x1 = r + 1;
		double x2 = x1 *(r + 1);
		double x3 = x2 *(r + 1);
		double x4 = x3 *(r + 1);
		double x5 = x4 *(r + 1);
		double x6 = x5 *(r + 1);
		double x7 = x6 *(r + 1);
		double x8 = x7 *(r + 1);
		double x9 = x8 *(r + 1);
		double x10 = x9 * (r + 1);
//為了說明計算過程而呈現的文字		
		System.out.println("初始本金為" + pv + "萬元");
		System.out.println("銀行年利率為" + r);
		System.out.println(n + "年後本金加利息共有");	
//以年為單位逐個帶入不同的利率變數		
		if (n <= 1)
			{ 
			System.out.println(pv * x1+ "萬元");	
			}
		else if (n <= 2)
			{
			System.out.println(pv * x2+ "萬元");
			}
		else if (n <= 3) 
			{
			System.out.println(pv * x3+ "萬元");
			}
			
		else if (n <= 4) 
			{
			System.out.println(pv * x4+ "萬元");
			}
		else if (n <= 5) 
			{
			System.out.println(pv * x5+ "萬元");
			}
		else if (n <= 6) 
			{
			System.out.println(pv * x6+ "萬元");
			}
		else if (n <= 7) 
			{
			System.out.println(pv * x7+ "萬元");
			}
		else if (n <= 8) 
			{
			System.out.println(pv * x8+ "萬元");
			}
		else if (n <= 9) 
			{
			System.out.println(pv * x9+ "萬元");
			}
		
		else if (n <= 10) 
			{
			System.out.println(pv * x10+ "萬元");
			}
	
	}
		
}
		
				
		
		
		
				
				
		
		

