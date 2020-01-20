public class User {

    private String imie;
    private int wiek;

    public User(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public static void main(String[] args) {

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};
        int[] numbers = {anna.wiek, betty.wiek, carl.wiek, david.wiek, eva.wiek, frankie.wiek};

        for(User user : users){
            System.out.println(user.imie + " " +user.wiek);
        }

        for(int i = 0; i < users.length; i++){
            System.out.println(users[i].imie);
        }

        for(User user : users){
            int average = averageAge(numbers);
            if(user.wiek < average){
                System.out.println(user.imie + " " + user.wiek);
            }
        }
    }

    public static int averageAge(int[] numbers){
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        result = result/numbers.length;
        return result;
    }
}

