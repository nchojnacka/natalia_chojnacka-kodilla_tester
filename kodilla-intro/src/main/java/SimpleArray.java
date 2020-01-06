public class SimpleArray {

    public static void main(String[] args) {

        String[] books = new String[5];
        int numberOfElements = books.length;

        books[0] = "Clean Code";
        books[1] = "Little Prince";
        books[2] = "Lord of the rings";
        books[3] = "Crime and punishment";
        String book = books[3];
        books[4] = "Harry Potter";

        System.out.println(book);
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");

    }

}
