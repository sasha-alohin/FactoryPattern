package example;

class Poodle implements Dog {
	public void speak() {
		System.out.println("The poodle says \"arf\"");
	}
}

class Rottweiler implements Dog {
	public void speak() {
		System.out.println("The Rottweiler says (in a very deep voice) \"WOOF!\"");
	}
}

class SiberianHusky implements Dog {
	public void speak() {
		System.out.println("The husky says \"Dude, what's up?\"");
	}
}

public class Factory {
	public static void main(String[] args) {
		// create a small dog
		Dog dog = DogFactory.getDog("small");
		dog.speak();

		// create a big dog
		dog = DogFactory.getDog("big");
		dog.speak();

		// create a working dog
		dog = DogFactory.getDog("working");
		dog.speak();
	}
}

class DogFactory {
	public static Dog getDog(String criteria) {
		if (criteria.equals("small"))
			return new Poodle();
		else if (criteria.equals("big"))
			return new Rottweiler();
		else if (criteria.equals("working"))
			return new SiberianHusky();

		return null;
	}
}