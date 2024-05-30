package Java_32;

public class Test {
	public static void main(String[] args) {
		MyDate md = new MyDate(12 , 5 ,2001);
		System.out.println("Day: "+md.getDay());
		md.setDay(35);
		System.out.println("Day: "+md.getDay());
		md.setDay(26);
		System.out.println("Day: "+md.getDay());
		
		System.out.println("Month: "+md.getMonth());
		md.setMonth(13);
		System.out.println("Month: "+md.getMonth());
		md.setMonth(6);
		System.out.println("Month: "+md.getMonth());
	}
}
