import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main mainInstance = new Main();
        List<Integer> result = mainInstance.sequentialDigits(100, 300);
        System.out.println(result);
    }

    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=low; i<=high; i++) {
            if(isSequential(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean isSequential(int num) {
        boolean isSequential = true;
        List<Integer> digits = new ArrayList<>();
        String numberStr = String.valueOf(num);
        for (int i=0; i<numberStr.length(); i++) {
            if (i == 0) {
                digits.add(Character.getNumericValue(numberStr.charAt(i)));
            } else {
                if (Character.getNumericValue(numberStr.charAt(i)) == (Character.getNumericValue(numberStr.charAt(i-1)) +1)) {
                    digits.add(Character.getNumericValue(numberStr.charAt(i)));
                } else {
                    isSequential = false;
                    break;
                }
            }
        }

        return isSequential;
    }
}