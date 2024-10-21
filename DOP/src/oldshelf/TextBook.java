package oldshelf;


public class TextBook extends Book {

	// DONE: Make this a final field with most strict visiibility possible.
	private String subject;
	
	// DONE: Change the constructor if required? Correct any errors
	public TextBook(String subject) {
		this.subject = subject;
	}

	// DONE : create a getter if required.
	public String getSubject() {
		return subject;
	}
	
	
	
	
	// DONE: write a toString method
	@Override
	public String toString() {
		String s = "Subject : " + this.subject;
		return s;
	}


}
