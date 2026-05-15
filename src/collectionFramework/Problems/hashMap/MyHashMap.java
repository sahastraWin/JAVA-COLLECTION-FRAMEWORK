package collectionFramework.Problems.hashMap;

class MyHashMap {
    class N { int k, v; N n; N(int k, int v){this.k=k;this.v=v;} }
    N[] b = new N[1000];
    public void put(int k, int v) {
        int i=k%1000; if(b[i]==null) b[i]=new N(k,v);
        else { N c=b[i]; while(c!=null){ if(c.k==k){c.v=v; return;} if(c.n==null) break; c=c.n; } c.n=new N(k,v); }
    }
}