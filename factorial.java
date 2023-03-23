import java.util.*;
public class factorial {
    public static int factNum(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_num=factNum(n-1);
        int fact_num1=n*fact_num;
        return fact_num1;
    }

    public static void main(String[]args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        n=sc.nextInt();
        int ans=factNum(n);
        System.out.println(ans);
    }
}
