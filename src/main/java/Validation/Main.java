package Validation;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        final String str = "abv";
        System.out.println(addBrackets(str));
    }

    public static boolean isCorrect(String str) {
        final StringBuilder stringBuilder = new StringBuilder(str);
        int leftOpening;
        int rightClosing;
        do {
            leftOpening = stringBuilder.indexOf("(");
            rightClosing = stringBuilder.lastIndexOf(")");

            if (leftOpening > rightClosing) {
                return false;
            } else if (leftOpening == -1 && rightClosing == -1) {
                return true;
            } else if (leftOpening == -1 || rightClosing == -1) {
                return false;
            } else {
                stringBuilder.deleteCharAt(leftOpening);
                stringBuilder.deleteCharAt(rightClosing - 1);
            }
        } while (true);
    }

    public static String addBrackets(final String str) {
        final StringBuilder toReturn = new StringBuilder();

        int strLength = str.length();
        boolean is2 = strLength % 2 == 0;
        int fistCycleCount = is2 ? strLength / 2 : strLength / 2 + 1;

        for (int i = 0; i < fistCycleCount ; i++) {
            toReturn.append("(").append(str.charAt(i));
        }

        if (!is2) {
            toReturn.append(")");
        }

        for (int i = fistCycleCount; i < str.length(); i++) {
            toReturn.append(str.charAt(i)).append(")");
        }

        return toReturn.toString();
    }
}
