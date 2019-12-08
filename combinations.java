import java.util.Scanner;

public class combinations{

    public static void combination(int maxLength, char[] characters, String currentCombination){
        if (currentCombination.length() == maxLength){ //Checks If the character matches the length and not any high
            System.out.println(currentCombination); // If it reaches The length it print out the Characters
        }else{
            for (int x=0; x < characters.length; x++) { // This will Loop Through all the Characters 
                String oldCombination = currentCombination;
                currentCombination += characters[x];
                combination(maxLength, characters, currentCombination);
                currentCombination = oldCombination;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length: ");
        int characterlength = input.nextInt();// here it takes user input

        char[] character = {'a', 'b', 'c'}; // This are the Characters you can add more characters here
        combination(characterlength, character, ""); // The method starts here
    
    }
}