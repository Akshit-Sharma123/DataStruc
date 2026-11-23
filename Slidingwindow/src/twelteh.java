import java.util.*;
public class twelteh {
    public static int totalFruit(int[] f) {
        int l=0;
        int r=0;
        int ans=0;
        HashMap<Integer,Integer> ok=new HashMap<>();
        while(r<f.length){
            if(ok.containsKey(f[r])){
                ok.put(f[r],ok.get(f[r])+1);
            }
            else{
                ok.put(f[r],1);
            }
            while(ok.size()>=3){
                int x=ok.get(f[l]);
                if(x==1){
                    ok.remove(f[l]);
                }
                else{
                    ok.put(f[l],ok.get(f[l])-1);
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;

    }
    public static void main(String[] args) {

    }
}
