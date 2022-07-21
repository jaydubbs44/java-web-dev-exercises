package exercises.class2;
import java.util.Arrays;
public class StringToArrayPractice {
    public static void main(String[] args) {
        String greenEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] gEArray = greenEggs.split("\\.");
        System.out.println(Arrays.toString(gEArray));
    }
}
