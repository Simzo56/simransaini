import java.util.*;
public class rotate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i;
        int size=sc.nextInt();
        int number[]=new int[size];
        for( i=0; i<size; i++){
            number[i]=sc.nextInt();
        }
        int a=number[0];
        int b=number[size-1];
        number[0]=b;
        number[size-1]=a;
        for(i=0; i<size; i++){
            System.out.println("rotated array:"+number[i]);
        }

    
}
}
