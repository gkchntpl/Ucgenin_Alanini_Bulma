// kenar verilerini kişilerden alacağımız için ilk başta veri çekmek için scanner sınıfı oluturuyoruzz.

import java.util.Scanner;
public class ucgeninAlani {
    public static void main(String[] args) {

// sonra kenar uzunluklarının değişkenlerini oluşturuyoruz. ben değişkenlerin kusüratlı olabileceğini düşünerek double oluşturuyorum. */

        double a, b, c;

// şimdi scanner sınıfını kullanabilmek için bir nesne oluşturalım.

        Scanner girdi = new Scanner(System.in);

        System.out.print("a kenarının uzunluğunu giriniz: ");
        a = girdi.nextDouble();

        System.out.print("b kenarının uzunluğunu giriniz" );
        b = girdi.nextDouble();

        System.out.print("c kenarının uzunluğunu giriniz: ");
        c = girdi.nextDouble();

        double u;
        u = (a+b+c)/2;

        double Alan;
        Alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.print("Üçgenin Alanı: " + Alan);


    }




}
