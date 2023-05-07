public class R6 {
    static void star(int numberofStar){
        if(numberofStar==0){
            return;
        }
        System.out.print("*");
        star(numberofStar-1);

    }
    static void line(int numberofLines){
        if(numberofLines==0){
            return;
        }
        line(numberofLines-1);
        star(numberofLines);
        System.out.println();
    }
    static void pattern(int numberofLines){
        line(numberofLines);
    }
    public static void main(String[]args){
        pattern(8);
    }
    
}

