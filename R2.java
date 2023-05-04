public class R2 {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        system.out.println(n);
        printNum(n-1);
        
    }
    public static void main(String[]args){
        int n=5;
        printNum(n);
    }
    
    
}
