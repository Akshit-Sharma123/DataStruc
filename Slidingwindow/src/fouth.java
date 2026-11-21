//var size sliding widnow
//longest subarray which has sum<=k
import java.util.*;
public class fouth {
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
        int ans=0;
        int s=0;

        while(r<n){
            s=s+arr[r];
            if(s<=k){
                ans=Math.max(ans,r-l+1);
            }
            else{
                while(s>k){
                    s=s-arr[l];
                    l++;
                }
            }
            r++;
        }
        System.out.println("answer is "+ans);
    }
}
