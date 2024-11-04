import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
    }

    public int hIndex(int[] citations) {
        int hIndex = 0;
        Integer[] autoBoxedArray = new Integer[citations.length];
        for (int i = 0; i < citations.length; i++) {
            autoBoxedArray[i] = citations[i]; // int to Integer
        }
        Arrays.sort(autoBoxedArray, Collections.reverseOrder());
        for(int i=autoBoxedArray.length; i>0; i-- ) {
            int count = 0;
            for (int citation: autoBoxedArray) {
                if (citation >= i) {
                    count++;
                } else {
                    break;
                }
            }
            if (count >= i) {
                return i;
            }
        }

        return hIndex;
    }
}