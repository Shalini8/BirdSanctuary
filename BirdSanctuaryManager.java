package bird;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuaryManager {
	List<Bird> birdList = new ArrayList();

	public void add(Bird birds) {
		birdList.add(birds);
		birds.incrementCount();
	}
	public void remove(Bird birds ) {
		birdList.remove(birds);
		birds.decrementCount();
	}
   
	public void printEatingBirds() {
		for (Bird bird : birdList) {
			bird.eat();
		}
	}

	public void printFlyableBirds() {
		for (Bird bird : birdList) {
			if (bird instanceof Flyable) {
				((Flyable)bird).fly();
			}
		}
	}

	public void printSwimmableBirds() {
		for (Bird bird : birdList) {
			if (bird instanceof Swimmable) {
				((Swimmable) bird).swim();
			}

		}
	}
}
