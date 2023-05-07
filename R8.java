public class R8 {
    static void Space(int numberofSpace){
        if(numberofSpace==0){
            return;
        }
        System.out.print(" ");
        Space(numberofSpace-1);

    }
    static void Star(int numberofStar){
        if(numberofStar==0){
            return;
        }
        System.out.print("*");
        Star(numberofStar-1);
        

    }
    static void Line(int numberofLines,int totalnumberofLines){
        if(numberofLines==0){
            return;
        }
        Line(numberofLines-1,totalnumberofLines);
        Space(numberofLines);
        Star(totalnumberofLines-numberofLines);
        System.out.println();
    }
    static void pattern(int numberofLines){
        Line(numberofLines,numberofLines);
    }
    public static void main(String[]args){
        pattern(8);
    }
    
}



 

