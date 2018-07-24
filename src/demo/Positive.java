package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Positive {
    public static void main(String[] args) {
        //  kiểm tra chuỗi đầu vào xem có trùng khớp với một mẫu nào đó hay không, 
        //trước khi quyết định có kiểm tra phần còn lại của chuỗi ban đầu. Điều này cho 
        //phép tiết kiệm nhiều thời gian và tăng hiệu suất vì không phải kiểm tra toàn
        //bộ chuỗi nếu không thỏa mãn một số điều kiện ban đầu.
        Pattern pattern;
        Matcher matcher;
        String searchString;
        String isbn = "ISBN-123-4567";
        searchString = "(?=ISBN)\\w{4}-\\d{3}-\\d{4}";
        pattern = Pattern.compile(searchString, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(isbn);
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
        
        // passwordPattern = "^(?=.*\\d+.*)(?=.*[A-Z]+.*)\\w{4,8}$";
        // (?=.*\\d+.*): phần look ahead này qui định chuỗi đầu vào phải có ít nhất 1 kí tự số từ 0 đến 9
        // (?=.*[A-Z]+.*): phần look ahead này qui định chuỗi đầu vào phải có ít nhất một kí tự IN HOA từ a đến z
        // ajkd3, Akijj, 8Aj, 8abCd
    }
}
