public class SimpleArray {

    public static void main(String[] args) {

        String[] books = new String[5];
        String book = books[3];
        int numberOfElements = books.length;

        books[0] = "Clean Code";
        books[1] = "Little Prince";
        books[2] = "Lord of the rings";
        books[3] = "Crime and punishment";
        books[4] = "Harry Potter";

        System.out.println(book);
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");

    }

}
