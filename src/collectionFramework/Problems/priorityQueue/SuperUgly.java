package collectionFramework.Problems.priorityQueue;

public class SuperUgly {
    public int nthSuperUglyNumber(int n, int[] p) {
        long[] u=new long[n]; int[] idx=new int[p.length]; long[] v=new long[p.length];
        u[0]=1; for(int i=0; i<p.length; i++) v[i]=p[i];
        for(int i=1; i<n; i++){ long min=Long.MAX_VALUE; for(long x:v) min=Math.min(min, x); u[i]=min; for(int j=0; j<p.length; j++) if(v[j]==min) v[j]=u[++idx[j]]*p[j]; }
        return (int)u[n-1];
    }
}