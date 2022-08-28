import java.util.Scanner;

public class kullanici_girisi {
    public static void main(String[] args) {
        String kullaniciAdi, sifre, yeniSifre, cevap;
        Scanner sc = new Scanner(System.in);

        System.out.print("Hesap adini giriniz: "); kullaniciAdi = sc.nextLine();

        System.out.print("Sifrenizi giriniz: "); sifre = sc.nextLine();

        if (kullaniciAdi.equals("emre") && (sifre.equals("123456"))){
            System.out.println("Tekrar hos geldiniz");
        }
        else {
            System.out.println("Kullanici adi veya sifre yanlis.");
            System.out.println("Sifrenizi mi unuttunuz?");
        }

        cevap = sc.nextLine();
        if (cevap.equals("yes")){
            System.out.println("Lutfen yeni sifrenizi giriniz: ");
            yeniSifre = sc.nextLine();

            if (yeniSifre.equals("123456"))
                    System.out.println("Yeni sifreniz eskisiyle ayni olamaz");
            else
                System.out.println("Sifreniz basariyla degistirildi.");
        }

        sc.close();
    }
}
