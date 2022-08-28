import java.util.Scanner;
public class kutle_indeksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz: "); double boy = sc.nextDouble();

        System.out.println("Kilonuzu giriniz: "); double kilo = sc.nextDouble();

        double indeks = kilo / (boy*boy);
        System.out.println("Vücut indeksiniz :" + indeks);

        sc.close();
    }
}
