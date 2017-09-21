public class Instructor {
    public long id;
    public String name;
    public String title;
    public String department;
    public Book[] books;

    public Instructor(long id, String name, String title, String department, Book[] books) {
        //my code 
        this(id, name, title, department);
        this.books = books;
    }

    public Instructor(long id, String name, String title, String department) {
        //my code 
        this(id, name, title);
        this.department = department;
    }

     public Instructor(long id, String name, String title) {
        //my code 
        this(id, name);
        this.title = title;
    }

    public Instructor(long id, String name) {
        this.id = id; 
        this.name = name; 
    }

    public String getMostRecentBookTitle() {
        // Returns the title of the last book in the list 
        return books[books.length-1].getTitle(); 
    }

    public Book updateBook(int index, String title) {
       // Since we are suppose to return Book with title before updating,
        // we are creating a temporary variable to store that title
        Book oldBook = new Book(books[index].getTitle());
        //oldBook.setTitle(books[index].getTitle());
        
        // Updating current book with new title
        books[index].setTitle(title);   
        
        return oldBook;
    }
    

    public Book updateBook(int index, Book book) {
        //Note: This is an overloaded method. 
        Book oldBook = books[index];        
        books[index] = book;
        return oldBook;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java for Beginners");
        Book book2 = new Book("Scala for Beginners");
        Book book3 = new Book("Effective Python");

        Instructor instructor = new Instructor(101, "John", "Assistant Prof", "CS", new Book[] {book1,book2, book3});
        System.out.println(instructor.getMostRecentBookTitle());
        System.out.println("old book tittle: " + instructor.updateBook(1, "Effective C#").getTitle());

        Book book4 = new Book("Introduction to Data Mining");
        System.out.println("old book title " + instructor.updateBook(1, book4).getTitle());
    }
}