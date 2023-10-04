import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        if(str.length()>= 1 && str.length()<=10){ // 제한사항 1
            if(n>=1 && n<=5){ // 제한사항 2
                for(int x=1; x<=n; x++){
                    System.out.print(str);
                }
            }
        }
        
    }
}