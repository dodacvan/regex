package demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Boundary {
    public static void main(String[] args) {
        Pattern pattern;
        Matcher matcher;
        boolean flag;
        String searchString;
                   
            String searchPattern = "^is$";
            pattern = Pattern.compile(searchPattern);           
            searchString = "this is a string"; //is a string // is
            matcher = pattern.matcher(searchString);
            flag = matcher.find();
            if (!flag) System.out.println("Not found in the input string!");
            if (flag) System.out.println("Found: " + matcher.group());
       
            
            // String searchPattern = "^is[\\s\\w]*"; --  A string   --  is a string
            // String searchPattern = "[\\s\\w]*is$"; -- This is a string -- This is
            // String searchPattern = "\\bis\\b"; --- This does not have the one -- This is a string
            // Điều này có nghĩa là trong chuỗi trùng phải chứa chuỗi con độc lập, có thể xem là một từ, là “is”.
            
            // String searchPattern = "\\Bis\\b"; -- This does not have the one
            // trong chuỗi đầu vào chỉ cần có từ nào kết thúc là “is”, còn bắt đầu bằng kí tự nào cũng được.
    }
}
