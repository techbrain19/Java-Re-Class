import java.util.Scanner;

class Chapter2 {
    public static void main(String[] args) { 
        //String line;
        //Scanner in = new Scanner(System.in);
        //System.out.print("Type something: "); 
        //line = in.nextLine();
        //System.out.println("You said: " + line);
        //System.out.print("Type something else: ");
        //line = in.nextLine();
        //System.out.println("You also said: " + line);
        int inch = 100;
        final double CM_PER_INCH = 2.54;
        double cm = inch * CM_PER_INCH;
        System.out.printf("%d in = %.2f cm\n", inch, cm);
    } 
}