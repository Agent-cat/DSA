package Dsajava.BasicMaths.Prime;

class Prime {
    public boolean isprime(int n){
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)return false;
        }
        return true;
    }
    public int countPrimes(int n) {
      int count=0;
      for(int i=2;i<n;i++){
        if(isprime(i)){
            count++;
        }
      }
        return count;
    }
}
