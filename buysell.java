public class buysell{
    public static void main(String[]args){
        int arr[]={7,1,5,3,6,4};
        int max[]=new int[arr.length];
        int i;
        int diff;
        int s=arr[0];
        System.out.println("we buy on that"+s);
        for(i=1;i<arr.length;i++){
            diff=arr[0]-arr[i];
            max[i]=diff;
            System.out.println(max[i]);

        }




       
    }
    
}
