import java.util.*;
public class array  {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i;
        int size=sc.nextInt();
        int number[]=new int[size];
        for( i=0; i<size; i++){
            number[i]=sc.nextInt();
        }
        
        for(i=0; i<size-1; i++){
            if(number[i]>number[i+1]){
                System.out.println("array is sorted");
            }
            else{
                System.out.println("array not sorted");
            }

        }
        
        
        
    }
    
}
