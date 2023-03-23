public class frequency {
    public static void main(String[]args){
        int arr[]={ 10,10,10,25,31,31,32};
        int n=arr.length;
        int i;
        int count=0;
        int k=0;
        for(i=0;i<n;i++){
            if(arr[0]==arr[i+1]){
                k=count++;

             }
             System.out.println(arr[i]+"="+k);
           
            
                
                
            
        }
        
    }
}
    
