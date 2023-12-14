import java.util.Scanner;

class Convertion {
    public static void main(String[] args){
        double line;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the Celsius: ");
        line = in.nextDouble();
        double F;
        final double first =9.0;
        final double decom = 5.0;
        F = line * (first/decom) + 32.0;
        System.out.printf("%.1f c = %.1f F", line, F);
    }
}