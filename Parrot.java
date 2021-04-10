package bird;

public  class Parrot extends Bird implements Flyable {
	public static int count;

	public void fly() {
		System.out.println("parrot is flying");
	}

	public void eat() {
		System.out.println("parrot is eating ");

	}
	public  int getCount() {
		return count;
	}

	public int incrementCount() {
		return count += 1;
	}
	public int decrementCount() {
		return count--;
	}
}