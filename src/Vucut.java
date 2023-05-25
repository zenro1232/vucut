import  java.util.Scanner;
public class Vucut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kg;
              double  boy;

                System.out.print("Lütfen Kilonuzu Giriniz : ");
                kg = input.nextInt();
                System.out.print("lütfen Boy uzunlugunuzu virgül ile giriniz örneğin 1,50  :");
                boy = input.nextDouble();

         double sonuc =  boy * boy ;
        double bitis = kg / sonuc;
         System.out.print("Vucut kitle indeksiniz : " + bitis);
    }
}

