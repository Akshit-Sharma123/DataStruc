//Max sum by picking 4 consec integers
import java.util.*;
public class constantwindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(n);
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter k:");
        int k=sc.nextInt();
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(i+k<=n) {
                int s=arr[i];
                for (int j = i+1; j < i + k; j++) {
                     s=s+arr[j];
                }
                ans=Math.max(ans,s);
            }
        }
        System.out.println("answer is "+ans);
    }
}
