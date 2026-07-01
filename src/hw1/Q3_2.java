package hw1;

public class Q3_2 {
		public static void main(String[] args) {
			int second = 256559,m = 60, h = 60 , d = 24;
			int minute = second / m;
			int remainSecond = second%m;
			int hour = minute/ h;
			int remainMinute = minute%h;
			int day = hour / d;
			int remainHour;
			remainHour = hour%d;
			
//System.out.println(second+"秒="+day+"天"+remainHour+"小時"+remainMinute+"分"+remainSecond+"秒");
			System.out.println(second+"秒等於");
			System.out.println(day+"天");	
			System.out.println(remainHour+"小時");
			System.out.println(remainMinute+"分");
			System.out.println(remainSecond+"秒");
		
		}
}
