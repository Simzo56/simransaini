public class R12 {
    static void Space(int numberofSpace){
        if(numberofSpace==0){
            return;
        }
        System.out.print(" ");
        Space(numberofSpace-1);

    }
    static void number(int number){
        if(number==0){
            return;
        }
        System.out.print(number);
        number(number-1);
        

    }
    static void Line(int numberofLines,int totalnumberofLines){
        if(numberofLines==0){
            return;
        }
        Line(numberofLines-1,totalnumberofLines);
        Space(totalnumberofLines);
        number(numberofLines-1);
        System.out.println();
    }
    static void pattern(int numberofLines){
        Line(numberofLines,numberofLines);
    }
    public static void main(String[]args){
        pattern(8);
    }
    
}








