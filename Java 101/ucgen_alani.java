import java.util.Scanner;
public class ucgen_alani {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1. kenar: "); double a = sc.nextInt();
        System.out.print("2. kenar: "); double b = sc.nextInt();
        System.out.print("3. kenar: "); double c = sc.nextInt();

        double u = (a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan : " + alan);

        sc.close();
    }
}
