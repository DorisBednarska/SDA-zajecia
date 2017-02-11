package zajecia.Zajecia9;

/**
 * Created by RENT on 2017-02-11.
 */
public class Book {
    private String title;
    private Author author;
    private int numberOfPages;
    private int releaseDate;
    private String description;
    private String[] content;
    private String category;


    //konstruktory


    public Book(String title, Author author, int releaseDate, String[] content) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.content = content;
        this.numberOfPages = content.length;
    }

    public Book(String title, Author author, int releaseDate, String description, String[] content, String category) {
        this(title, author, releaseDate, content);
        this.description = description;
        this.category = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", releaseDate='" + releaseDate + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getPage(int index) {
        int actualIndex = index - 1;
        if (actualIndex >= 0 && actualIndex < this.numberOfPages) {
            return content[actualIndex];
        } else {
            return "Brak strony";
        }
//        return (actualIndex >= 0 && actualIndex < this.numberOfPages) ?
//                content[actualIndex] : "Brak strony";
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public String[] getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //    public void print(){
//        System.out.println(title + " " + author + " " + numberOfPages + " " + releaseDate + " " + description +  " " + content + " " + category);
//        if (??? != null) {
//            ???.print();
//        }
//    }
}
