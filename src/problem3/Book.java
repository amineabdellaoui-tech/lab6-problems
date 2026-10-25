package problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;

    public Book(String title,String author,int nbrPages){
        super(title);
        this.author=author;
        this.nbrPages=nbrPages;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return super.toString()+", from the author "+this.author+", with "+this.nbrPages+" pages";
    }
}
