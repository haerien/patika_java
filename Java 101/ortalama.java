import java.util.Scanner;
public class ortalama {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int mat, fizik, kimya, turkce, tarih, muzik;
            //Not girdileri
            System.out.print("Matematik: "); mat = input.nextInt();
            System.out.print("Fizik : "); fizik = input.nextInt();
            System.out.print("Kimya: "); kimya = input.nextInt();
            System.out.print("Turkce: "); turkce = input.nextInt();
            System.out.print("Tarih: "); tarih = input.nextInt();
            System.out.print("Muzik: "); muzik = input.nextInt();
            input.close();
          
            //Ortalama 60'tan büyükse geçti, küçükse kaldı yazdırır
            int toplam = mat + muzik + tarih + kimya + fizik + turkce;
            double ortalama = toplam/6.0;
            System.out.print(ortalama > 60 ? "Sinifi Gecti" : "Sinifta Kaldi");
        }
    }
