import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Main main = new Main();
        main.letterCombinations("789");
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits.isEmpty()) {
            return res;
        }
        String[] d = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        res.add("");
        for (char i : digits.toCharArray()) {
            String str = d[i - '2'];
            char[] chars = str.toCharArray();
            List<String> temp = new ArrayList<>();
            for (char ch : chars) {
                for (String s : res) {
                    temp.add(s + ch);
                }
            }
            res = temp;
        }

        return res;
    }
}