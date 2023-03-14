import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Author author1 = new Author("Jim Kwik");
        Author author2 = new Author("Ruben Chavez");
        Author author3 = new Author("Socrates");
        Quote quote1 = new Quote(author1, "\"Don’t take criticism from someone you wouldn’t take advice from\".");
        Quote quote2 = new Quote(author2, "\"Pay attention to the things you are naturally drawn to. They are often connected to your path, passion, and purpose in life. Have the courage to follow them\".");
        Quote quote3 = new Quote(author3, "\"Strong minds discuss ideas, average minds discuss events, weak minds discuss people\".");
        Album album1 = new Album("Michael Jackson", "Thriller", 1982, 66.00, "Pop/Rock/R&B");

        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for (Quote quote : quotes) {
            System.out.printf("""
        %s - %s
        """, quote.getQuote(), quote.getAuthor().getName());
        }
            System.out.println(album1.getArtist());
    }
}
