package collectionFramework.Problems.priorityQueue;

import java.util.*;
public class TaskCooldown {
    public int leastInterval(char[] t, int n) {
        int[] c=new int[26]; for(char x:t) c[x-'A']++; Arrays.sort(c);
        int m=c[25]-1, s=m*n; for(int i=24;i>=0;i--) s-=Math.min(m, c[i]); return s>0?s+t.length:t.length;
    }
}