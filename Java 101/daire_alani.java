import java.util.Scanner;

public class daire_alani {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double pi=3.14, area;
      
        System.out.print("Yari cap giriniz ="); int r = sc.nextInt();
        System.out.print("Merkez acisinin olcusunu giriniz = "); int a = sc.nextInt();

        area = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin alani  = " + area);
        sc.close();
    }
}
