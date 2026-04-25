public class Book {
    private String title;
    private int publishingYear;

    public Book(String title, int publishingYear) {
        this.title = title;
        this.publishingYear = publishingYear;
    }

    public String getTitle() { return title; }
    public int getPublishingYear() { return publishingYear; }

    @Override
    public String toString() {
        return "\"" + title + "\" (" + publishingYear + ")";
    }
}
