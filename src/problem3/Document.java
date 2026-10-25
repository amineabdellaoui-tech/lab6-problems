package problem3;

public class Document {
    protected int numRec;
    protected String title;
    private static int counter = 0;

    public Document(String title){
        this.numRec=++counter;
        this.title=title;
    }

    public int getNumRec() {
        return this.numRec;
    }

    @Override
    public String toString() {
        return "Document #"+this.numRec+" : "+this.title;
    }
}
