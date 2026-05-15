package collectionFramework.Problems.hashSet;

class DesignHashSet {
    class N { int k; N n; N(int k){this.k=k;} }
    N[] b = new N[1000];
    public void add(int k) {
        int i=k%1000; if(b[i]==null) b[i]=new N(k);
        else { N c=b[i]; while(c!=null){if(c.k==k)return; if(c.n==null){c.n=new N(k); return;} c=c.n;} }
    }
}