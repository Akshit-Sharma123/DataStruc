import java.util.*;
public class seventh {
    public static int lengthOfLongestSubstring(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            HashSet<Character> p=new HashSet<>();

            for(int j=i;j<s.length();j++){
                p.add(s.charAt(j));
                if(j-i+1==p.size()){
                    ans=Math.max(ans,j-i+1);
                }

                else{
                    break;
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    }
}
