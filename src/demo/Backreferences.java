package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Backreferences {
    public static void main(String[] args) {
        // cơ chế backreference để so trùng với một mẫu trước đó mà không cần phải viết lại toàn bộ mẫu.
        // được chỉ định thông qua kí tự \\x ngay sau một group nào đó. Giá trị x chính là chỉ số của group.
        Pattern pattern;
        Matcher matcher;
        boolean flag = false;
        String searchString;
        
               
            String searchPattern = "(\\w\\w)(\\d\\d)\\2";
            pattern = Pattern.compile(searchPattern);           
            
            searchString = "This is2323is2323 a string";  // This isis a string // This is abab string
            matcher = pattern.matcher(searchString);
            while(matcher.find()) {
                System.out.println("Found duplicate: " + matcher.group());
                flag = true;
            }
            if (!flag) System.out.println("Not found duplicate word");
       
            
          //  String searchPattern = "(\\w\\w)(\\d\\d)\\2"; This is23 a string --- This is2323 a string
            // Bắt đầu bằng 2 kí tự từ (a-z, 0-9) - Theo sau là 2 số - Theo sau chính xác là 2 số trước đó
            
            //String searchPattern = "\\b(\\w+)\\s+\\1\\b";
            // This string contains contains some duplicate word word
    }
}
