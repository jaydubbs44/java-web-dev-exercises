package exercises;

import java.util.Scanner;

public class Alice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String excerpt = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        System.out.println("Please enter a term to search for :");
        String searchTerm = input.nextLine();
        boolean answer = excerpt.contains(searchTerm);
        System.out.println("It is " + answer + " that the excerpt from Alice in Wonderland contains your search term.");

        int index = excerpt.indexOf(searchTerm);
        int length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = excerpt.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }

}
