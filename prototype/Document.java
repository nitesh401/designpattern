package prototype;
class Document implements Cloneable {
    private String title;
    private String content;
    private String author;

    public Document(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    // Cloning method
    @Override
    public Document clone() {
        try {
            return (Document) super.clone(); // Properly cloning the object
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported"); // This shouldn't happen because we implement Cloneable
        }
    }

    @Override
    public String toString() {
        return "Document{title='" + title + "', content='" + content + "', author='" + author + "'}";
    }
}
