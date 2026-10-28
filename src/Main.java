import java.util.Scanner;
import java.util.Stack;

class main {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter s: ");
        String s = input.next();
        RADC r = new RADC();
        TRADC r2 = new TRADC();
        String result2 = r2.TripleRemoveDuplicate(s);
        String result = r.RemoveDuplicate(s);
        System.out.println("Pair output:" + result);
        System.out.println("Triple output:" + result2);
    }
}
