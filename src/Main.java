import java.util.Random;
import java.util.Scanner;

public class Main {
    public static  void game(int randomNumber,int tryCount){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

            int playerguess = scanner.nextInt();



            randomNumber = rand.nextInt(100) + 1;
            System.out.println("Random number is " + randomNumber);
            if (playerguess == randomNumber) {
                System.out.println(" Correct! You Win!");
                System.out.println(" Your Score is : " + tryCount * 20);
                System.out.println(" It took you " + tryCount + " tries");

            } else if (randomNumber > playerguess) {
                System.out.println("Nope! the number is higher. Guesss again.");
            } else if (randomNumber < playerguess) {
                System.out.println("Nope! the number is lower. Guesss again.");
            }
        }

    public static void main(String[] args) {
        int randomNumber = 0;
        Scanner scanner = new Scanner(System.in);

        int tryCount = 0;
        while (tryCount<3) {
            System.out.println("Enter your guess (1-100):");
            game(randomNumber, tryCount);
            tryCount++;
        }
        if(tryCount==3){
            System.out.println("You are Lost!!!");
            System.out.println("are you added more rounds??\n Choose Option \n 1 .Yes \n 2. No  ");
            int userinput=scanner.nextInt();
            if (userinput==1){
                tryCount=0;
                while (tryCount<3) {
                    System.out.println("Enter your guess (1-100):");
               game(randomNumber,tryCount );
                    tryCount++;
                }
            }
            else if(userinput==2){
                System.out.println("You are Exit!!");
            }

        }

            scanner.close();
        }
    }
