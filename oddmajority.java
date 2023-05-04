public class oddmajority {
    public static void main(String[]args){
        int a[]={1,1,1,2,2,3,3,3,3,3};
        int count=0;
        for(int i=a[count];i<=a.length-1;i++){
            
            for(int j=a[count];j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
            }
           /* else{
                break;
            }*/
        }
        if(count%2!=0){
            System.out.println(a[count]);
        }


        
    }
    
}
}
