package practice27;

public enum AnimalType {
	犬(new Dog()),
	猫(new Cat());

	private Animal animal;

	private AnimalType(Animal animal) {
		this.animal = animal;
	}

	public Animal getAnimal() {
		return this.animal;
	}
}
