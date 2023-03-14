import java.io.Serializable;

public class Quote implements Serializable {
    protected Author author;

    protected String quote;


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Quote(){

    };

    public Quote(Author author, String quote) {
        this.author = author;
        this.quote = quote;
    }
}
