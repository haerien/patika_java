import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ilk degeri giriniz: "); double number1 = sc.nextDouble();
        System.out.print("Ikinci degeri giriniz: "); double number2 = sc.nextDouble();

        String sonuc = "Islemin sonucu = ", islem ="Secilen islem = ";

        System.out.println("Yapmak istediğiniz islemi seciniz:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        int select = sc.nextInt();

        sc.close();
        
        switch (select){
            case 1 : System.out.println(islem+"Toplama");break;
            case 2 : System.out.println(islem+"Cikarma");break;
            case 3 : System.out.println(islem+"Carpma");break;
            case 4 : System.out.println(islem+"Bolme");break;
        }
        switch (select) {
            case 1: System.out.println(sonuc + (number1 + number2));break;
            case 2: System.out.println(sonuc + (number1 - number2));break;
            case 3: System.out.println(sonuc + (number1 * number2));break;
            case 4:
                if (number2 == 0) {
                    System.out.println("Bir sayi sifira bolunemez.");
                } else {
                    System.out.println(sonuc + (number1 / number2));
                }
                break;

            default:
                System.out.println("Yanlis bir deger girdiniz. ");

        }
    }
}