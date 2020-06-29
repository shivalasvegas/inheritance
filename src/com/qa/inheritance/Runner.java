package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {
		
		boolean isCarnivore = true;
		boolean canSwim = false;
		boolean canFly = false;
		
		Eagle florin = new Eagle();
//		
//		florin.setCarnivore(false);
//		System.out.println(florin.isCarnivore());
		Dolphin adrian = new Dolphin();
		Wolf claudius = new Wolf();
		//Animal newan = new Dolphin();	
		
		// Introducing Florin the eagle
		canSwim = false;
		
		florin.noise();
		florin.setCarnivore(isCarnivore);
		florin.hunt(isCarnivore);
		florin.setCanSwim(canSwim);
		florin.swim(canSwim);
		florin.fly();
		
		// Introducing Adrian the Dolphin
		canSwim = true;
		canFly = false;
		adrian.noise();
		adrian.setCarnivore(isCarnivore);
		adrian.hunt(isCarnivore);
		adrian.setCanSwim(canSwim);
		adrian.swim(canSwim);
		adrian.setCanFly(canFly);
		adrian.fly(canFly);
		
		// Introducing Claudius the wolf
		claudius.noise();
		claudius.setCarnivore(isCarnivore);
		claudius.hunt(isCarnivore);
		claudius.setCanSwim(canSwim);
		claudius.swim(canSwim);
		claudius.setCanFly(canFly);
		claudius.fly(canFly);
			
		
	}

}
