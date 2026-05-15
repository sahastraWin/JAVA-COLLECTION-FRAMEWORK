package collectionFramework.Problems.queue;

class Node{int d;Node n;Node(int x){d=x;}}
class LLQueue { Node f, r; void enq(int x){Node t=new Node(x); if(r==null)f=r=t; else{r.n=t;r=t;}} int getF(){return f!=null?f.d:-1;} }