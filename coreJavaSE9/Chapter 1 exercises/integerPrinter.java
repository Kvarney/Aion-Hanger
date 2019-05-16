import java.util.*;
public class integerPrinter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        String binaryNumber = Integer.toBinaryString(number);
        System.out.println("binary: " + binaryNumber);
        System.out.printf("octal: %o\n", number);
        System.out.printf("hexadecimal: %x\n", number);
        System.out.printf("hexadecimal floating-point: %a\n", 1.0 / number); //not sure if this is working correctly
        in.close();
    }
}