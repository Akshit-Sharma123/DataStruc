//constant window pattern of sliding window
import java.util.*;
public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k");
        int k=sc.nextInt();
        int l=0;
        int r=0;
        int ans=Integer.MIN_VALUE;
        int s=0;
        while(r<n){
            s=s+arr[r];
            if(r-l+1==k){
                ans=Math.max(ans,s);
                s=s-arr[l];
                l++;
            }
            r++;

        }
        System.out.println(ans);
    }
}
