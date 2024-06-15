package UserThread;

public class Book {

	private int bookId;
	private String bookName;
	private String status;
	private int bookPrice;

	public int getBookId() {
		return bookId;
	}

	public Book(int bookId, String bookName, int bookPrice) {
		// super(); super call the no args constructor of the super class.
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public boolean issueBook() {
		status="Issued";
		return true;
	}
}
//If you do not explicitly call super() or any other superclass constructor, Java automatically 
//inserts a call to the no-argument constructor of the superclass at the beginning of the subclass
//constructor. This is why it's important for the superclass to have a no-argument constructor, 
//especially if the subclass does not explicitly call a superclass constructor.