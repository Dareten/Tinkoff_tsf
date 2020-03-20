public class Spring_one {
    public static long resolution(long x){
        long c = 0;
        String s;
        for(long i=1;i<=x;i++){
            s = Long.toString(i);
            for(int j=0;j<=s.length()/2;j++) {
                if(s.charAt(j) != s.charAt(s.length() - 1 - j)) {break;}
                if(j == s.length()/2){c++;}
            }
        }
        return c;
    }
}