package find_vowels_consonant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Alphabet: ");
        String input = scanner.nextLine();

        switch (input) {
            case "A":
            case "a":
                System.out.println("Vowel");
                break;
            case "E":
            case "e":
                System.out.println("Vowel");
                break;
            case "I":
            case "i":
                System.out.println("Vowel");
                break;
            case "O":
            case "o":
                System.out.println("Vowel");
                break;
            case "U":
            case "u":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonent");
                break;
        }

        scanner.close();
    }
}
