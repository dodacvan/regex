package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositiveBehide {
    public static void main(String[] args) {
        List<String> friendList = new ArrayList<>();
        friendList.add("Nguyễn Huy Hùng");
        friendList.add("Trần nguyễn Phi Long");
        friendList.add("Nguyễn Hoài Nam");
        friendList.add("Nguyễn Trần");
        friendList.add("Peter Nguyễn");
        Pattern pattern;
        Matcher matcher;
        String searchString;
        searchString = "(?<=^Nguyễn).*";
        
        pattern = Pattern.compile(searchString, Pattern.CASE_INSENSITIVE);
        for (String text : friendList) {
            matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println("Matched: " + text);
            }
        }
//         Nguyễn Huy Hùng
//
//        Từ đầu tiên  lấy ra để kiểm tra là từ “Nguyễn”.
//
//        Từ này không có từ “Nguyễn” nào trước đó, -> not ok
//
//        Từ kế tiếp được lấy ra để kiểm tra là từ “Huy”. Từ này có từ phía trước là “Nguyễn”, => ok
//        Từ kế tiếp được lấy ra để kiểm tra là “Hùng”. Từ này không có từ “Nguyễn” phía trước, => not ok
//
//        sau khi kiểm tra tên đầu tiên, chúng ta tìm được một lần trùng khớp tại vị trí chuỗi con “Huy”.

       
    }
}
