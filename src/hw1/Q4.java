package hw1;
//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
public class Q4 {
	public static void main(String[] args) {
		double pi = 3.1415,r = 5 ;
		double areaOfCircle = r * r * pi ;
		double circumference = r * 2 * pi ;
		
			//半徑為五的圓面積
			System.out.println("當圓半徑為" + r + "，面積為" + areaOfCircle) ;
			//半徑為五的圓周長			
			System.out.println("當圓半徑為" + r + "，圓周長為" + circumference);
				
		}

}
