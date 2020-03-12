import java.util.Scanner;

public class Problem_two {
    public static String resolution(){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(Math.abs(str.length() - s.length()) > 1){
            str.append(s.charAt(i + s.length()/2));
            str.append(s.charAt(i++));
        }
        if(str.length() != s.length()){
            str.append(s.charAt(s.length()-1));
        }
        return str.toString();
    }
}
