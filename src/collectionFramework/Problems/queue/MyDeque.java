package collectionFramework.Problems.queue;

class MyDeque {
    int[] a; int f=-1, r=0, s, c;
    MyDeque(int k){c=k; a=new int[k];}
    boolean insF(int v){if(s==c)return false; if(f==-1){f=0;r=0;} else if(f==0)f=c-1; else f--; a[f]=v; s++; return true;}
}