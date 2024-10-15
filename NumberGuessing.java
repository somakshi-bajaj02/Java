import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberofAttempts = 0;
        int maxAttempt = 10;
        int score =0;
        boolean hasGuessNumbered = false;
        boolean playagain;

        do {
            int randomNum = rand.nextInt(100) + 1;
            System.out.println("Guess The number you have "+ maxAttempt + " max Attempts" );
            while(numberofAttempts < maxAttempt  && !hasGuessNumbered)
            {
                System.out.println("Enter Your Guess");
                int userGuess = sc.nextInt();
                numberofAttempts++;

                if(userGuess == randomNum)
                {
                    System.out.println("Congratulations! You have Guessed the number Correctly");
                    hasGuessNumbered = true;
                    score = score + maxAttempt -numberofAttempts + 1;

                    if(userGuess > randomNum)
                    {
                        System.out.println("Too High, Try Again");
                    }
                    else
                    {
                        System.out.println("Too Low Try again");
                    }
                }
            }
            if(!hasGuessNumbered)
            {
                System.out.println("Sorry! You have used all your Attempts");
            }
            System.out.println("Your score: "+score);

            System.out.println("Do you want playagain? (yes/no): ");
            String response = sc.next();
            playagain = response.equalsIgnoreCase("yes");

        }
         while(playagain);

         /*System.out.println("Do you want playagain? (yes/no): ");
            String response = sc.next();
            playagain = response.equalsIgnoreCase("yes");*/
        
     System.out.println("Thank you for playing! Your score final is: "+ score);
    sc.close();
        


    }
}