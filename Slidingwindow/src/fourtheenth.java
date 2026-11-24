import java.util.*;
public class fourtheenth {
    public int numberOfSubstrings(String s) {
        int l=0;
        int r=0;
        int cnt=0;
        HashMap<Character,Integer> ok=new HashMap<>();
        int n=s.length();
        while(r<s.length()){
            char ch=s.charAt(r);
            int h=8;
            if(ok.containsKey(ch)){
                ok.put(ch,ok.get(ch)+1);
                h=86;
            }
            if(h==8){
                ok.put(ch,1);
            }

            while(ok.size()==3){
                cnt=cnt+(n-r);
                char u=s.charAt(l);
                int g=ok.get(u);
                int f=8;
                if(g==1){
                    ok.remove(u);
                    f=7;

                }
                if(f==8){
                    ok.put(u,g-1);
                }
                l++;

            }


            r++;
        }
        return cnt;
    }
    public static void main(String[] args) {

    }
}
