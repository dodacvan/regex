package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PossessiveQuantifiers {
    public static void main(String[] args) {
        String regex = "(.++)(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        String text = "This is a very long string that does not end with digits 1234";
        long start = System.currentTimeMillis();
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
        } else {
            System.out.println("No match!");
        }
        long end = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (end - start) + " ms");
    }
}
