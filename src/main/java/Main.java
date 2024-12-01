import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a letter: ");
    String userInput = input.next();
    if (userInput.length() != 1) {
      System.out.println(userInput + " is an invalid input.");
      return;
    }
  char letter = userInput.charAt(0);
  if (!Character.isLetter(letter)) {
      System.out.println(letter + "is an invalid input");
    } else {
   if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
      System.out.println(userInput + " is a vowel");
   } else {
      System.out.println(userInput + " is a consonant");
     }
    }
  }
}

   



