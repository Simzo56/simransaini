public class R1 {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.println("hello");
    }
    public static void main(String[]args){
        int n=5;
        printNum(n);
    }
    
}
