package Java_34;

public class Test {
	public static void main(String[] args) {
		MyDate md = new MyDate(12 , 5 ,2001);
		MyDate md1 = new MyDate(13 , 9 ,2001);
		MyDate md2 = new MyDate(12 , 5 ,2001);
		
		System.out.println(md1);//13 , 9 ,2001
		System.out.println(md);
		System.out.println(md2);
		
		System.out.println("md so sanh bang md2: "+md.equals(md2));
		
		System.out.println("md1 so sanh bang md2: "+md1.equals(md2));
		
		System.out.println("hasd code md: "+md.hashCode());
		
		System.out.println("hasd code md1: "+md1.hashCode());
		
		System.out.println("hasd code md2: "+md2.hashCode());
		
	}
	
}
