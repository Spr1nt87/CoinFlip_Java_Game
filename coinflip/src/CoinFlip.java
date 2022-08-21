import java.util.Scanner;
public class CoinFlip {

    public static void delay() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }


    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        String heads = "Heads";
        String tails = "Tails";
        String result;

        System.out.println("Welcome to CoinFlip! Please enter 'heads' or 'tails' to start");

        while (true){
            String userInput = scanner.nextLine();

            if (userInput.equals("heads")) {
                System.out.println("You've chosen "+userInput);
                delay();
                System.out.println("Flipping...");
                userInput = heads;
            } if (userInput.equals("tails")) {
                System.out.println("You've chosen "+userInput);
                delay();
                System.out.println("Flipping...");
                userInput = tails;
            } int random = (int) (Math.random() * 2 );
            if (random < 1) {
                result = heads;
            } else {
                result = tails;
            }
            delay();
            if (userInput == result) {
                System.out.println("Congrats! It landed on "+result+" you've won!");
            } else {
                System.out.println("Sorry, it landed on "+result+", you lost.");
            }
            delay();
            System.out.println("If you wish to play again, please type 'heads' or 'tails'");
        }
    }
}
