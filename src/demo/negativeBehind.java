package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class negativeBehind {
     public static void main(String[] args) {
         List<String> friendList = new ArrayList<>();
         friendList.add("David Anderson");
         friendList.add("Jonathan David San");
         friendList.add("David Gorge");
         friendList.add("David M. Sandre");
         friendList.add("Peter Tran");
         Pattern pattern;
         Matcher matcher;
         String searchString;
         searchString = "(?<![rs])an";
         pattern = Pattern.compile(searchString, Pattern.CASE_INSENSITIVE);
         for (String text : friendList) {
             matcher = pattern.matcher(text);
             while (matcher.find()) {
                 System.out.println("Matched: " + text);
             }
         }
    }
}
