import java.util.Random;
import java.util.Scanner;

// The PasswordGenerator class is a simple Java application that generates a random password based on user-defined length. 
// The program ensures that the password is at least 8 characters long and uses a mix of lowercase letters, 
// uppercase letters, numbers, and special characters for enhanced security.

public class PasswordGenerator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the password generator!");
        System.out.println("Choose amount of characters (minimum 8): ");
        int userInput = input.nextInt();
        while (userInput < 8){
            System.out.println("Password must be at least 8 characters: ");
            userInput = input.nextInt();
        }
        String generatedPassword = generatePassword(userInput);
        System.out.println(generatedPassword);

    }

    public static String generatePassword(int length){
     char[] lowerCaseLetters = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z'
        };
     char[] upperCaseLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
                                 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                                 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                                     'V', 'W', 'X', 'Y', 'Z'};
     char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
     char[] specialCharacters = {'!', '@', '#', '$', '&'};

    String password = "";

    for (int i = 0; i < length; i++){
        Random random = new Random();

        int randomArray = random.nextInt(3);
        if (randomArray == 0){
            int randomIndex = random.nextInt(lowerCaseLetters.length);
            // Get the random item
            char randomItem = lowerCaseLetters[randomIndex];
            password = password + randomItem;
        }
        else if (randomArray == 1){
            int randomIndex = random.nextInt(upperCaseLetters.length);
            // Get the random item
            char randomItem = upperCaseLetters[randomIndex];
            password = password + randomItem;
        }
        else if (randomArray == 2){
            int randomIndex = random.nextInt(numbers.length);
            // Get the random item
            char randomItem = numbers[randomIndex];
            password = password + randomItem;
        }
        else {
            int randomIndex = random.nextInt(specialCharacters.length);
            // Get the random item
            char randomItem = specialCharacters[randomIndex];
            password = password + randomItem;
        }

    }
    return password;



    }


}
