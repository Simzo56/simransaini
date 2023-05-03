import java.util.*;
public class missing {
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,7};
        int n=arr.length;
        int s=0;
        
        for(int i=0;i<n;i++){
            if(((arr[i]-arr[i+1])==-1) || ((arr[i]-arr[i+1])==0)){
               s++;
               
               
            }

            else{
                int j=arr[i+1]-arr[i];
                for(int k=1;k<j;k++){
                System.out.println(arr[i]+k);
                }
            }
        }
    



    
                
                
                
                
                
                
    
            

        }
    

    }


        
         
