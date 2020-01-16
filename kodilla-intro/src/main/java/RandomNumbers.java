import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        int maxSum = 5000;
        int sum = 0;
        int min = 0;
        int max = 0;

            while(sum < maxSum){
            Random random = new Random();
            int number = random.nextInt(31);
            sum = sum + number;
            if(sum > maxSum){
                System.out.println("Wylosowane liczby " + sum);
                break;
            }

            if(number < min){
                min = number;
            }

            if(number > max) {
                max = number;
            }
            System.out.println("Suma kolejnych wylosowanych liczb " + sum);
        }
        System.out.println("Liczba minimalna " + min);
        System.out.println("Liczba maksymalna " + max);
    }
}
