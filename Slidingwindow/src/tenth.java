import java.util.*;
public class tenth {
        public static int longestOnes(int[] nums, int k) {
            int l=0;
            int r=0;
            int cnt=0;
            int ans=0;
            while(r<nums.length){
                if(nums[r]==0){
                    cnt++;
                }
                if(cnt>k){
                    while(cnt>k){
                        if(nums[l]==0){
                            cnt--;
                        }
                        l++;
                    }}
                ans=Math.max(ans,r-l+1);
                r++;
            }
            return ans;
        }

    public static void main(String[] args) {

    }
}
