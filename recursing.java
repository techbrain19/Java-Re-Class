import java.util.Scanner;

class recursing {
    public static void nLines(int n) { 
        if(n>0){
            System.out.println();
            nLines(n - 1);
        }
    }
    public static void main(String[] args){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("the value of space Needed ");
        num = in.nextInt();
        nLines(num);
        System.out.println("end");
    }
}