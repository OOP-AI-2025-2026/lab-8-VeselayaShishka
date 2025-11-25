package ua.opnu;

public class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }
    public String getTitle() {
        return title;
    }

    public double getRating() {
        return this.total/this.reviews;
    }

    @Override
    public int compareTo(BookData bookData) {
        if(this.getRating() > bookData.getRating()) {
            return -1;
        }
        else if(this.getRating() < bookData.getRating()) {
            return 1;
        }
        if(this.getTitle().compareTo(bookData.getTitle()) < 0) {
            return -1;
        }
        else if(this.getTitle().compareTo(bookData.getTitle()) > 0) {
            return 1;
        }
        return 0;
    }
}
