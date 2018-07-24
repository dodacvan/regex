package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greedy {
    public static void main(String[] args) {
        String regex = "(.*?)(\\d+)";       
        Pattern pattern = Pattern.compile(regex);
        String text = "The order number is 8983";
        //String text = "The order 8983 number is";
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            
        }
        
//        ta muốn group 2 lấy được toàn bộ số 8983, thì chúng ta cần:
//
//        Chỉ định cho group 1 so trùng các kí tự ở mức tối thiểu nhất
//
//        Chỉ định cho group 2 so trùng các kí tự ở mức tối đa nhất
//
//        Để chỉ định group 1 so trùng các kí tự ở mức tối thiểu nhất, 
//        chúng ta cần áp dụng kỹ thuật reluctant quantifier cho group 1, thay vì greedy quantifier.
        
//        reluctant quantifier
//        String regex = "(.*?)(\\d+)";
    }
}
