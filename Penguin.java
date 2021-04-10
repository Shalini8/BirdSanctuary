package bird;

public class Penguin extends Bird implements Swimmable {
	public static int count;

	public void eat() {
		System.out.println("penguin is eating ");
	}

	public void swim() {
		System.out.println("penguin is swimming ");
	}

	public  int getCount(){
		return count;
	}

	public int incrementCount() {
		return count+=1;
	}
	public int decrementCount() {
		return count--;
	}
}

