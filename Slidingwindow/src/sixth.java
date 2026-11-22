import java.util.*;
//1423 leetcode
public class sixth {
    public static int maxScore(int[] c, int k) {
        int ans=0;
        int s=k-1;
        int e=c.length-1;
        // int ans=0;
        for(int i=0;i<k;i++){
            ans=ans+c[i];
        }
        int f=0;
        f=Math.max(f,ans);
        while(s!=-1 && e!=s){

            ans=ans-c[s];
            ans=ans+c[e];
            f=Math.max(f,ans);
            e--;
            s--;
        }
        return f;
    }
    public static void main(String[] args) {

    }
}
