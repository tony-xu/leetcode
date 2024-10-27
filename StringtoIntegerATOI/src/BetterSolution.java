public class BetterSolution {
    public int myAtoi(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();
        if (s.isEmpty()) return 0;

        // Step 2: Check for optional sign
        int sign = 1;
        int index = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: Convert numeric characters to integer
        long result = 0;
        while (index < s.length()) {
            char ch = s.charAt(index);
            if (!Character.isDigit(ch)) break;

            result = result * 10 + (ch - '0');
            // Step 4: Handle integer overflow
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            index++;
        }

        return (int) (result * sign);
    }
}
