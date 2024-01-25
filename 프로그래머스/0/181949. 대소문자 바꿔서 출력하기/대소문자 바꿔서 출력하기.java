import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        
        for(int i = 0; i < a.length(); i++){
            char splitA = a.charAt(i); // 원하는 위치의 문자를 가져오는 charAt 함수
            if(splitA == Character.toUpperCase(splitA)){
                str += Character.toLowerCase(splitA);
            } else if(splitA == Character.toLowerCase(splitA)){
                str += Character.toUpperCase(splitA);
            }
        }
        System.out.print(str);
    }
}