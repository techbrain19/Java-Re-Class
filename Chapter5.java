import java.util.Scanner;

class Chapter5{
     public static void printLogarithm(double x) {
        if(x<=0.0){
            System.err.println("Error: x must be positive.");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
    }

    public static void scanDouble() { 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        }
        double x = in.nextDouble(); printLogarithm(x);
    }

    public static void main(String[] args){
        int x;
        int y;
        scanDouble();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = in.nextInt();
        System.out.print("Enter the value of y: ");
        y = in.nextInt();
        if(x>0){
        System.out.println(x + " is positive");
        }
        if(x%2==0){ System.out.println(x + " is even");
        }else{
        System.out.println(x + " is odd");
        }
        if(x%2==0) System.out.println(x + " is even");
        else
        System.out.println(x + " is odd");
        if(x>0){
        System.out.println("x is positive");
        }
        System.out.println("x is not zero");
        if(x>0){
        System.out.println("x is positive");
        }
        else if(x<0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }
        if(x==0){
            System.out.println("x is zero");
        }else{ 
            if(x>0){
                System.out.println("x is positive"); 
            } else {
                System.out.println("x is negative");
            }
        }
        printLogarithm( x );
    }
}