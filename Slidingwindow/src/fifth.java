import java.util.*;
public class fifth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k:");
        int k=sc.nextInt();
        int l=0;
        int r=0;
        int ans=0;
        int sum=0;
        while(r<n){
            sum=sum+arr[r];
            if(sum>k){
                sum=sum-arr[l];
                l++;
            }
            if(sum<=k){
                ans=Math.max(ans,r-l+1);
            }
            r++;
        }
        System.out.println(ans);
    }
}
