package collectionFramework.Problems.queue;

class ArrayQueue {
    int[] a; int f=0, r=-1, c, s=0;
    ArrayQueue(int k){c=k; a=new int[c];}
    void enq(int x){if(s!=c){r=(r+1)%c; a[r]=x; s++;}}
    int deq(){if(s==0)return -1; int x=a[f]; f=(f+1)%c; s--; return x;}
}