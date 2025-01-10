package prototype;

public class Main {
    public static void main(String[] args) {
        // Original Document
        Document originalDoc = new Document("My First Document", "This is the content of the document.", "John Doe");
        System.out.println("Original: " + originalDoc);

        // Clone Document
        Document clonedDoc = (Document) originalDoc.clone();
        System.out.println("Cloned: " + clonedDoc);

        // Modify cloned document
        clonedDoc = new Document("My Second Document", "This is the content of the second document.", "Jane Doe");
        System.out.println("Modified Cloned: " + clonedDoc);
    }
}

