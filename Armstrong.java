public class Armstrong {
    public static void main(String[] args){
        int n,a=0,b=0;
        System.out.println("Armstrong no. from 1 to 1000 :");
        for(int i=1;i<=1000;i++)
        {
            n=i;
            while(n>0)
            {
                b=n%10;
                a=a+(b*b*b);
                n=n/10;
            }
        }if(a==i)
        {
            System.out.println(i+" ");
        }
        a=0;
    }
    
}
