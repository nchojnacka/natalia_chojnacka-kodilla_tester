import java.util.Random;

import static java.lang.Math.*;

public class RandomNumbers {

    int max = 30;
    int min = 0;

    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 5001 ; i++) {
            System.out.println(random.nextInt(30));
        }
    }

    public void maxRandom() {
        Random random = new Random();
        int[] tab = new int[5001];
        for(int i = 0; i<tab.length; i++){
            tab[i] = random.nextInt(30);
            System.out.println("Maksymalna wylosowana liczba to "+ Math.max(min, max));
        }
    }

    public void minRandom() {
        Random random = new Random();
        int[] tab = new int[5001];
        for(int i = 0; i<tab.length; i++){
            tab[i] = random.nextInt(30);
            System.out.println("Minimalna wylosowana liczba to "+ Math.min(min, max));
        }
    }
}
