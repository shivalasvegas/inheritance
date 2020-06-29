package com.qa.inheritance;

public class Animal {
	
	private boolean canFly = false;
	private boolean isCarnivore = false;
	private boolean canSwim = false;
	
	public Animal() {
		super();
	}
	
	// Constructor
	public Animal(boolean canFly, boolean isCarnivore, boolean canSwim) {
		super();
		this.canFly = canFly;
		this.isCarnivore = isCarnivore;
		this.canSwim = canSwim;
	}
	
	// getters and setters
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isCarnivore() {
		return isCarnivore;
	}
	public void setCarnivore(boolean isCarnivore) {
		this.isCarnivore = isCarnivore;
	}
	public boolean isCanSwim() {
		return canSwim;
	}
	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
	
	// hunt method
	public void hunt(boolean isCarnivore) {
		if (isCarnivore) {
			System.out.println("I'm gonna get you!");
		}else {
			System.out.println("Aaaargh I'm dinner!");
		}
	}
	
	// noise method
	public void noise() {
		
	}
	
	// fly method
	 
	public void fly(boolean canFly) {
		if (canFly) {
			System.out.println("Up, up and away!");
		}else {
			System.out.println("God dammit, I'm grounded!");
			
		}
	}
	
	// swim method
	
	public void swim(boolean canSwim) {
		if(canSwim) {
			System.out.println("Oh yeah, I am flying through the water!");
		}else {
			System.out.println("Blimey, I'm gonna get drenched ... no thanks!");
		}
	}

}
