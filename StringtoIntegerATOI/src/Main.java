public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int myAtoi(String s) {
        String trimmedS = s.trim();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < trimmedS.length(); i++) {
            Character ch = trimmedS.charAt(i);

            if (i == 0 && !Character.isDigit(ch) && !ch.toString().equals("-")) {
                sb.append("0");
                break;
            } else if (i == 0 && ch.toString().equals("-")) {
                sb.append("-");
                continue;
            }

            if (Character.isDigit(ch)) {
                if (ch.toString().equals("0")) {
                    continue;
                }

                sb.append(ch.toString());
            } else {
                break;
            }
        }
        if (sb.length() == 0) {
            return 0;
        }

        return Integer.parseInt(sb.toString());
    }
}