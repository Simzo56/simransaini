public class binary2 {
    public static void main(String[]args){
        int arr[]={20,40,10,30,50};
        int k=2;
        int add=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<k;j++){
                add=arr[i]+add;
            }
        }
        System.out.println(add);

    }
    
}
