import java.util.Scanner;
public class kdv_hesaplama{
    public static void main(String[] args) {
        double kdvsizFiyat, kdvTutari, kdvliFiyat ;

        Scanner sc = new Scanner(System.in);
        
        //KDVsiz fiyat değerini alır, KDV tutarını ve KDV'li fiyatı hesaplar
        System.out.print("KDVsiz fiyati giriniz :");
        kdvsizFiyat = sc.nextDouble() ;
        kdvTutari = (kdvsizFiyat <= 1000) ? 0.18 : 0.08 ;
        kdvliFiyat = kdvsizFiyat * kdvTutari + kdvsizFiyat ;
    
        System.out.println("KDV tutari : " + kdvTutari);
        System.out.println("KDVsiz fiyat : " + kdvsizFiyat);
        System.out.println("KDVli fiyat :"  + kdvliFiyat);

        sc.close(); 
    }
}
