import java.util.*;
public class revers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i;
        int size=sc.nextInt();
        int number[]=new int[size];
        for( i=0; i<size; i++){
            number[i]=sc.nextInt();
        }
    
    int j=0;
    int s=number.length;

    int arr[]=new int[size];
    for(i=s-1;i>=0;i--){
        arr[j]=number[i];
        j++;
    }
    for(i=0;i<s;i++){
        System.out.print(arr[i]);
    }



    
}
}

