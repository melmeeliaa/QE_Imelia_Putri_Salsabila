import java.util.Scanner;
public class SoalPrioritas1no1 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            //Luas Segitiga
            System.out.print("Masukkan nilai alas segitiga: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan nilai tinggi segitiga: ");
            double tinggi = input.nextDouble();
            double luas = 0.5*alas*tinggi;
            System.out.print("luas segitiga adalah : " + luas);
            System.out.print("\n");

            //Luas Persegi Panjang
            System.out.print("Masukkan nilai panjang persegi panjang: ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan nilai lebar persegi panjang: ");
            double lebar = input.nextDouble();
            double luas2 = panjang*lebar;
            System.out.print("luas persegi panjang adalah : " + luas2);
            System.out.print("\n");

            //Luas Lingkaran
            float phi = 3.14F;
            System.out.print("Masukkan nilai jari-jari: ");
            float jari2 = (float) input.nextFloat();
            double luas3 = phi * jari2 * jari2 ;
            System.out.println("Luas lingkaran tersebut adalah: " + luas3);
        }
    }
