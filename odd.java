import java.util.*;
public class odd {
    public static void oddSum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        return;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        oddSum(n);
        
    }
    
}
