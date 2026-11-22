import java.util.*;
public class ninth {
    public static int lengthOfLongestSubstring(String s) {
        int ans=0;
        int l=0;
        int r=0;
        HashSet<Character> ok=new HashSet<>();
        //ArrayList<Character> ok=new ArrayList<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            if(ok.contains(ch)){
                while(ok.contains(ch)){
                    char e=s.charAt(l);
                    ok.remove(e);
                    l++;
                }
            }
            ok.add(ch);
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
