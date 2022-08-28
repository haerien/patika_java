import java.util.Scanner;

/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilo?gram
değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/
public class manav_kasa_programi {
    public static void main(String[] args) {
      double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.00 ;
      double kg, toplam = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Armut kac kilo? : "); kg = sc.nextDouble();
        toplam += armut * kg;
      System.out.println("Elma kac kilo? : "); kg = sc.nextDouble();
        toplam += elma * kg;
      System.out.println("Domates kac kilo? : "); kg = sc.nextDouble();
        toplam += domates * kg;
      System.out.println("Muz kac kilo? : "); kg = sc.nextDouble();
        toplam += muz * kg;
      System.out.println("Patlican kac kilo? : "); kg = sc.nextDouble();
        toplam += patlican * kg;
       System.out.println("toplam tutar : "+toplam);
    }
}