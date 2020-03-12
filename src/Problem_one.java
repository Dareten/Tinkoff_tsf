import java.util.Scanner;

public class Problem_one {
    public static int resolution(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), len = 100, min_len = 100;
        for(int i=0;i<n;i++){
            len += scan.nextInt();
            if(len < min_len){ min_len = len;}
        }
        return min_len;
    }
}
