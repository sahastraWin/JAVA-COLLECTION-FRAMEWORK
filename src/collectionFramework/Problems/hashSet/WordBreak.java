package collectionFramework.Problems.hashSet;

import java.util.*;
public class WordBreak {
    public static boolean wordBreak(String s, HashSet<String> d) {
        boolean[] dp = new boolean[s.length()+1]; dp[0]=true;
        for(int i=1; i<=s.length(); i++) for(int j=0; j<i; j++) if(dp[j] && d.contains(s.substring(j, i))) dp[i]=true;
        return dp[s.length()];
    }
}