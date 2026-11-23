import java.util.*;
public class eleventh {
        public int kDistinctChar(String s, int k) {

            int l=0;
            int r=0;
            int ans=0;
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
                        ok.put(h,1);
                    }
                    l++;

                }
                ans=Math.max(ans,l-r+1);
                r++;
            }
            return ans;
        }

    public static void main(String[] args) {

    }
}
