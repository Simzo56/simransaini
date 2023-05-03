public class occurrence {
    public static void main(String[]args){
        int arr[]={1,1,2,2,3,4,5,5,5,6,7};
        int n=arr.length;
        int k=5;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==k){
                
                System.out.println(i);
                continue;
                
            }
        
        }

    }
    
}
