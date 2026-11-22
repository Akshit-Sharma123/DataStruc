import java.util.*;
public class eighth {
    public static int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int ans=0;
        String g="";
        while(r<s.length()){
            String x=""+s.charAt(r);

            if(g.contains(x)){

                while(g.contains(x)){
                    g=g.substring(1);
                    //l++;
                }
            }
            g=g+x;
            //System.out.println("g string is "+g);
            ans=Math.max(ans,g.length());
            r++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


    }
}
