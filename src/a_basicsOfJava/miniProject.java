package a_basicsOfJava;
import java.util.Scanner;
public class miniProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random()*100);
      int userInput;;
      do {
          System.out.print("Enter Number between 0 - 100: ");
          userInput = input.nextInt();
          if (userInput==number){
              System.out.println("WOHOO... You Guess the Number....");
              break;
          } else if (userInput < number) {
              System.out.println("Number is too small");
          }
          else {
              System.out.println("Number is too long");
          }
      }while(userInput >=0);

        System.out.println("Number was "+number);
    }

}
