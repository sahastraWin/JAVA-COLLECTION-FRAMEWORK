package collectionFramework.Problems.queue;

class CircularQueue {
    int[] a; int f=-1, r=-1, s;
    CircularQueue(int k){s=k; a=new int[k];}
    void enq(int x){if((r+1)%s==f)return; if(f==-1)f=0; r=(r+1)%s; a[r]=x;}
    int deq(){if(f==-1)return -1; int x=a[f]; if(f==r)f=r=-1; else f=(f+1)%s; return x;}
}