import java.util.Scanner;

public class UpperLowerCaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet character: ");
        char character = scanner.next().charAt(0); 
        switch (character) {
            case 'A': case 'B': case 'C': case 'D': case 'E': case 'F': case 'G':
            case 'H': case 'I': case 'J': case 'K': case 'L': case 'M': case 'N':
            case 'O': case 'P': case 'Q': case 'R': case 'S': case 'T': case 'U':
            case 'V': case 'W': case 'X': case 'Y': case 'Z':
                System.out.println(character + " is an uppercase letter.");
                break;
            case 'a': case 'b': case 'c': case 'd': case 'e': case 'f': case 'g':
            case 'h': case 'i': case 'j': case 'k': case 'l': case 'm': case 'n':
            case 'o': case 'p': case 'q': case 'r': case 's': case 't': case 'u':
            case 'v': case 'w': case 'x': case 'y': case 'z':
                System.out.println(character + " is a lowercase letter.");
                break;
            default:
                System.out.println(character + " is not a valid alphabet character.");
        }
        scanner.close();
    }
}
