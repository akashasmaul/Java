package week3.exercises;

public class BookShop {
	private String authorName;
	private String bookId;
	private String bookTitle;
	
	public BookShop( String bookId) {
		this.bookId = bookId;
		}
	public void setBookTitle (String title) {
		this.bookTitle = title;
	}
	public void setAuthorName (String name) {
		this.authorName = name;
	}
	public String getBookTitle () {
		return this.bookTitle;
	}
	public String getAuthorName () {
		return this.authorName;
	}
	
	public void displayBookDetails () {
		System.out.println("Book ID: " + this.bookId);
		System.out.println("Book Title: " + this.bookTitle);
		System.out.println("Author Name: " + this.authorName);
	}
	public static void main(String[] args) {
		BookShop b1 = new BookShop("xxxxx");
				b1.setAuthorName("MyName");
				b1.setBookTitle("OOP");
				
				//b1.getAuthorName();
				//b1.getBookTitle();
				b1.displayBookDetails();
		}
}



