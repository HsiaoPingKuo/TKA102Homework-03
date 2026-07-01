package hw1;
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class Q3 {
	public static void main(String[] args) {
		int s = 256559,m = 60, h = 60 , d = 24;
		int minute = s / m;
		int remainSecond = s-(minute*m);
		int hour = minute/ h;
		int remainMinute = minute-(hour*h);
		int day = hour / d;
		int remainHour = hour%d;
		
			System.out.println(day+"天"+remainHour+"小時"+remainMinute+"分"+remainSecond+"秒");	
		
				
	}
}
