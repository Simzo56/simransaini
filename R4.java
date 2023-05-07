public class R4 {
    public static void printsum(int i,int n,int sum){
        if(i==n){
            sum+=1;
            System.out.println(sum);
            return;
        }
        sum+=1;
        printsum(i+1, n, sum);
    }
    public static void main(String[]args){
        printsum(1, 5, 0);
    }
    
}
