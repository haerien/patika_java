import java.util.Scanner;
public class manav_kasa_programi {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  

      double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.00 ;
      double kg, toplam = 0;

      
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
        sc.close();
    
       System.out.println("toplam tutar : "+toplam);
    }
}
