//Longest subarray/substring where <condition>
//Longest consecutive subarray with sum<=k
//arr 2,5,1,7,10   k=14
import java.util.*;
public class third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k : ");
        int k=sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
              s=s+arr[j];
              if(s<=k){
                  ans=Math.max(ans,j-i+1);
              }
              else{
                  break;
              }
            }
        }
        System.out.println(ans);
    }
}
