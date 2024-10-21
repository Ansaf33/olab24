package oldshelf;

public class Comic extends Book {

	/* TODO: Add most strict modifiers here*/ 
	private final String Title;

	// TODO: Warning to be removed.
	private final int ageOfMainCharacter;

	// TODO Correct the error
	public Comic(String Title,int ageOfMainCharacter) {
		this.Title = Title;
		this.ageOfMainCharacter = ageOfMainCharacter;
	}
	
	// TODO : create a getter if required.
	
	
	// TODO: Create a setter if required

	// TODO: write a toString method
	@Override
	public String toString() {
		String s = "Title : " + this.getTitle();
		String s1 = "Age of Main Character : " + this.getAgeOfMainCharacter();
		return s + "\n" + s1;
	}

	public String getTitle() {
		return Title;
	}

	public int getAgeOfMainCharacter() {
		return ageOfMainCharacter;
	}

	// TODO: Bonus: 
	@Override
	public int hashCode() {
		return Integer.hashCode(ageOfMainCharacter);

		}

		// TODO: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
	
	// TODO: Bonus: 
	@Override
	public boolean equals(Object o) {
		// TODO: Based on the information about hashCode write the equals method.
		if( this == o ){
			return true;
		}
		else if( o.getClass() != getClass() ){
			return false;
		}
		else{
			return hashCode() == o.hashCode();
		}


	}
}
