import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetterSolution {
    public List<Integer> sequentialDigits(int low, int high) {
        // Initialize the answer list to hold sequential digit numbers
        List<Integer> sequentialNumbers = new ArrayList<>();
        for (int i = 1; i<9; i++) {
            int sequentialNum = i;
            for (int j = i + 1; j < 10; j++) {
                sequentialNum = sequentialNum*10 + j;
                if (sequentialNum >= low && sequentialNum <=high) {
                    sequentialNumbers.add(sequentialNum);
                }
            }
        }

        // Sort the list of sequential numbers
        Collections.sort(sequentialNumbers);

        // Return the list containing all valid sequential digit numbers in the range
        return sequentialNumbers;
    }
}
