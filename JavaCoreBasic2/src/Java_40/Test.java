package Java_40;

public class Test {
	public static void main(String[] args) {
		System.out.println("Kiểm tra: ");
		BabyDog bbd = new BabyDog();
		bbd.eat();
		bbd.bark();
		bbd.weep();
		
		Cat c = new Cat();
		c.eat();
		c.meow();
		
		Bird b = new Bird();
		b.eat();
		b.fly();
	}
}
