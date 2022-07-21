package exercises.class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apples","apple","george",
                "symphony","legal","books","book"));

        ArrayList<String> fiverCollection = printFivers(words);
        System.out.println(fiverCollection);
    }
    private static ArrayList<String>  printFivers(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        ArrayList<String> fivers = new ArrayList<>();
        for (String word: arr) {
            if (word.length() == numChars) fivers.add(word);
        }
        return fivers;
    }


}
