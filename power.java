public class power {
    public static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xpow1=power(x , n-1);
        int xpow2 = x * xpow1;
        return xpow2;

        }
    public static void main(String[] args){
        int x = 2,n =5;
        int ans = power(x , n);
        System.out.println(ans);

    }
}

        
    
    
    
    
    
    
    
    
