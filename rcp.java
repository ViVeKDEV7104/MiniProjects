import java.util.Random;
import java.util.Scanner;
public class rcp{
    public static void main(String[]args){
        int userChoice, computerChoice;
        final int ROCK=0, PAPER=1, SCISSOR=2;
        final int TOTAL_ROUNDS= 5;
        int round=1;
       

        Scanner input = new Scanner(System.in);
        Random rnd= new Random();
        System.out.println("Welcome to the Game\n ROCK-PAPER-SCISSOR");
        while (round<= TOTAL_ROUNDS){
            System.out.println("Round"+round+ ":Enter your choice(0=rock, 1=paper, 2=scissors):");
            userChoice= input.nextInt();
        
           
            while(userChoice < 0 || userChoice > 2){
                System.out.println("Please enter a number between 0 and 2:");
                userChoice=input.nextInt();
              }
            computerChoice= rnd.nextInt(3);

            switch (userChoice){
                case ROCK:
                System.out.println("User chose ROCK");
                break;
                case SCISSOR:
                System.out.println("user chose SCISSOR:");
                break;
                case PAPER:
                System.out.println("user chose PAPER:");
                break;          
            }
            switch(computerChoice){
               case ROCK:
               System.out.println("Computer chose ROCK");
               break;
               case PAPER:
               System.out.println("Computer chose PAPER");
               break;
               case SCISSOR:
               System.out.println("Computer chose SCISSOR");
               break;
                }
            if(userChoice == computerChoice){
                System.out.println("It's a DDRAW!! Try AGAin!!");
            }
            else if((userChoice == ROCK && computerChoice== SCISSOR)||
            (userChoice== PAPER && computerChoice== ROCK)||
            (userChoice== SCISSOR && computerChoice== PAPER)){
                System.out.println("USER WINS!!!");
            

            }
            else{
                System.out.println("COMPUTER WINS!!!!");
            }
         
            round++;
            }
            System.out.println("GAmE OVER!!! Thanks For Playing");
            }
        }

    
