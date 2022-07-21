package exercises.class2;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int sumOfEvens = sumEven(numbers);
        System.out.println(sumOfEvens);
    }

    private static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
