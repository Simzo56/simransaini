public class R14 {
    static void Space1(int numberofSpace1){
        if(numberofSpace1==0){
            return;
        }
        System.out.print(" ");
        Space1(numberofSpace1-1);

    }
     static void Star1(int numberofStar1){
        if(numberofStar1==0){
            return;
        }
        System.out.print("*");
        Star1(numberofStar1-1);
        
    }
    static void Star2(int numberofStar2 ){
        if(numberofStar2==0){
            return;
        }
        System.out.print("*");
        Star2(numberofStar2-1);
        
    static void Line(int numberofLines,int totalnumberofLines){
        if(numberofLines==0){
            return;
        }
        Line(numberofLines-1,totalnumberofLines);

        Space1(totalnumberofLines-numberofLines);
       Star2(11-2*numberofLines);
        Star1(2*numberofLines-1);
        
        System.out.println();
    }
    static void pattern(int numberofLines){
        Line(numberofLines,numberofLines);
    }
    public static void main(String[]args){
        pattern(5);
    }
    
}




