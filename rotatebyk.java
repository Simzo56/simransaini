import java.util.*;
public class rotatebyk {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i;
        int size=sc.nextInt();
        int number[]=new int[size];
        for( i=0; i<size; i++){
            number[i]=sc.nextInt();
        }
        
         
        
        int k=sc.nextInt();
        if(k>size){
            System.out.println("out of bound");
        }
        else{
            int j=size-1;
            for(i=0;i<k;i++){
            
                int temp=number[i];
                number[i]=number[j];
                number[j]=temp;
                j--;
                
            }
            for(i=0;i<size;i++){
                System.out.print(number[i]);
        }
    }
    
    }
    
}

