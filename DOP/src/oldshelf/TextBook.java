package oldshelf;


public class TextBook extends Book {

	// DONE: Make this a final field with most strict visiibility possible.
	private String subject;
	
	// DONE: Change the constructor if required? Correct any errors
	public TextBook(String subject) {
		this.subject = subject;
	}

	// DONE : create a getter if required.
	public String subject() {
		return subject;
	}

	@Override
	public final int hashCode(){
		return this.hashCode();
	}

	@Override
	public final boolean equals(Object o){
		return this==o;
	}
	
	
	
	// DONE: write a toString method
	@Override
	public final String toString() {
		return "Subject : " + this.subject;
	}


}
