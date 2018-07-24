package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        boolean b = Pattern.matches("[[a-e][i-u]]", "b");
        boolean b1 = Pattern.matches("([0-9]{3}-?[0-9]{2}-?[0-9]{4})", "123222222");
        boolean b3 = Pattern.matches("^geeks$", "geeksgeeks");
        boolean b4 = Pattern.matches("I study \\w+", "I studY java");
        System.out.println(b4);
        
        System.out.println("I study English".matches("I study \\w+"));
        System.out.println("I study Programming".matches("I study \\w+"));
        System.out.println("I study: Java".matches("I study \\w+"));
        
        System.out.println("I study Java".matches("I study [a-zA-Z_0-9]+"));
        System.out.println("I study: Java".matches("I study [a-zA-Z_0-9]+"));
        
        
        System.out.println("I study Java".matches("I study:? [a-zA-Z_0-9]+"));
        System.out.println("I study: Java".matches("I study:? [a-zA-Z_0-9]+"));
        
        System.out.println("i study Java".matches("(?i)I study [a-zA-Z_0-9]+"));
        System.out.println("I StUdY Java".matches("(?i)I study [a-zA-Z_0-9]+"));
        
        System.out.println("I study Java".matches("I study (Java|HTML)"));
        System.out.println("I study HTML".matches("I study (Java|HTML)"));
        System.out.println("I study CSS".matches("I study (Java|HTML)"));
        
        
//        Extracting / Capturing
        String text = "Adu Daiman with univercity ID of 20202 is trying to demonstrate for oxus20 member";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
        
    }
}
