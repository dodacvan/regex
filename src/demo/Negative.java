package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Negative {
    public static void main(String[] args) {
        // kỹ thuật này kiểm tra sự không tồn tại, hay không trùng khớp,
        // của một chuỗi con trước khi có tiếp tục kiểm tra phần còn lại trong chuỗi.
        // nó ngược với Positive một tẹo
        List<String> documentList = new ArrayList<>();
        documentList.add("My sex is female");
        documentList.add("Sex education can be taught in high school");
        documentList.add("This sentence contain a porn word");
        documentList.add("These are sex and porn websites");
        Pattern pattern;
        Matcher matcher;
        String searchString;
        searchString = "(?!.*porn).*sex.*";
        pattern = Pattern.compile(searchString, Pattern.CASE_INSENSITIVE);
        for (String text : documentList) {
            matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println("Matched: " + matcher.group());
            }
        }
        // đặt trong một group và bắt đầu là dấu chấm hỏi (?), 
        //theo sau là dấu chấm than (!), và theo sau là mẫu mà ta KHÔNG muốn tồn tại trong chuỗi.
        
    }
}
