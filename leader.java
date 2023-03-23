public class leader {
    public static void main(String[]args){
        int arr[]={5,2,8,9,7,2};
        int n=arr.length;
        int i;
        int max=arr[n-1];
        System.out.println(max);
        for(i=n-1;i>=0;i--){
            
            if(max<arr[i-1] ){
                max=arr[i-1];
                System.out.println(max);
            }

        }
    }
    
}
