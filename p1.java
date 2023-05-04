import java.util.*;
public class p1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        row(1,n);
    }
    public static void row(int i,int n)
    {
        if(i<=n){
            col(1,i);
            System.out.println();
            row(i+1,n);
        }
    }
    public static void col(int j,int i){
        if(j<=i){
            System.out.print("*");
            col(j+1,i);
        }
    }
}
