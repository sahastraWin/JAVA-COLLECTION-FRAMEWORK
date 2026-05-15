package collectionFramework.Problems.queue;

import java.util.*;
public class RottenOranges {
    public int o(int[][] g) {
        Queue<int[]> q=new LinkedList<>(); int f=0, t=0;
        for(int i=0;i<g.length;i++)for(int j=0;j<g[0].length;j++){if(g[i][j]==2)q.add(new int[]{i,j}); if(g[i][j]==1)f++;}
        if(f==0)return 0; int[][] d={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){ int s=q.size(); boolean r=false; while(s-->0){ int[] c=q.poll(); for(int[] x:d){ int i=c[0]+x[0], j=c[1]+x[1]; if(i>=0&&i<g.length&&j>=0&&j<g[0].length&&g[i][j]==1){ g[i][j]=2; q.add(new int[]{i,j}); f--; r=true; } } } if(r)t++; } return f==0?t:-1;
    }
}