import java.util.Scanner;

public class guessnumber {
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);

        int count = 0, floor = 0 , ceil = 100 ,guess;
        double rand1 , rand2;
        boolean keepgoing = true;

        rand1 = Math.random();
        rand2 = rand1 * 100;
        int result = (int)rand2;

        while(keepgoing) {

            System.out.println("Guess a number between " + floor + " and " + ceil + ": ");

            guess = numScanner.nextInt();

            if (guess == result) {
                count ++;
                System.out.println("Bingo! you guess " + count + " times");
                System.out.println("Game Over!");
                numScanner.close();
                keepgoing = false;
            } else if (guess <= result) {
                count ++;
                floor = guess;
            } else  {
                count ++;
                ceil = guess;
            }
        }
    }
}
