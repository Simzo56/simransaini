public class p2 {
    public static void col(int i,int n){
        if(n==i){
            return;
        }
        col(i+1);
        System.out.print("*");
    }
    public static void row(int i,int j){
            if(i==j){
                return;
            }
            row(1,j);
            col(1,i);
            System.out.println();
        
    }

public static void main(String[]args){
    int n=7;
    int i;
    int j;
    row(1,j);
    col(1,i);

    }
}
