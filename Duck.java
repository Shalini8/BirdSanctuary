package bird;

public class Duck extends Bird implements Flyable, Swimmable {
	public static int count;

	public void fly() {
		System.out.println("duck is flying  ");
	}

	public void eat() {
		System.out.println("duck is eating ");
	}

	public void swim() {
		System.out.println("duck is swimming ");
	}

	public  int getCount() {
		return count;
	}

	public int incrementCount() {
		return count+=1;
	}
	public int decrementCount() {
		return count--;
	}
}

