//gfg Longest Substring with K Uniques
import java.util.*;
public class thirtheenth {
    public static int longestKSubstr(String s, int k) {
        // code here
        int l=0;
        int r=0;
        int ans=-1;
        HashMap<Character,Integer> ok=new HashMap<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            if(ok.containsKey(ch)){
                ok.put(ch,ok.get(ch)+1);
            }
            else{
                ok.put(ch,1);
            }
            while(ok.size()>k){
                char h=s.charAt(l);
                int g=ok.get(h);
                if(g==1){
                    ok.remove(h);
                }
                else{
                    ok.put(h,g-1);
                }
                l++;

            }
            //System.out.println("l "+l+" r "+r);
            if(ok.size()==k)ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
