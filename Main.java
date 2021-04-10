package bird;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("WELCOME TO BIRD SANCTUARY");
		
		BirdSanctuaryManager BirdSanctuaryManager = new BirdSanctuaryManager();
		
		Duck duck = new Duck();
		Duck duck2 = new Duck(); 
		Parrot parrot = new Parrot();
		Penguin penguin = new Penguin();

		BirdSanctuaryManager.add(duck);
		BirdSanctuaryManager.add(duck2);
		BirdSanctuaryManager.add(parrot);
		BirdSanctuaryManager.add(penguin);
		
		BirdSanctuaryManager.remove(penguin);
		//BirdSanctuaryManager.remove(parrot);
		//BirdSanctuaryManager.remove(duck2);
		BirdSanctuaryManager.remove(duck);

		BirdSanctuaryManager.printEatingBirds();
		BirdSanctuaryManager.printFlyableBirds();
		BirdSanctuaryManager.printSwimmableBirds();
		
		System.out.println("Duck Count : "+ Duck.count);
		System.out.println("parrot Count : "+ Parrot.count);
		System.out.println("Penguin Count : "+ Penguin.count);
	}
}

