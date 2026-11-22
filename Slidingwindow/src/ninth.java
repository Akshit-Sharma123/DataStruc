import java.util.*;
public class ninth {
    public static int lengthOfLongestSubstringg(String s) {
        int l=0;
        int r=0;
        int ans=0;
        HashMap<Character,Integer> ok=new HashMap<>();
        while(r<s.length()){
            char ch=s.charAt(r);
            //int w=0;
            if(ok.containsKey(ch)){
                while(ok.containsKey(ch)){
                    char h=s.charAt(l);
                    ok.remove(h);
                    l++;
                }
                //w=9;
            }
            ans=Math.max(ans,r-l+1);
            ok.put(ch,1);
            r++;
        }
        return ans;
    }
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
