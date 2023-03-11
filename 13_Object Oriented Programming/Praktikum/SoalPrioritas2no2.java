import java.util.Scanner;

public class SoalPrioritas2no2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka1, angka2 = 0, Operasi, hasil=0;
        //input data
        System.out.println("KALKULATOR SEDERHANA");
        System.out.print("Masukkan angka pertama    : ");
        angka1=input.nextInt();
        System.out.print("Masukkan angka kedua    : ");
        angka2=input.nextInt();
        System.out.println("------------------------");
        System.out.println("Pilih Operasi   : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("-------------------------");
        //Pilihan Operasi
        System.out.println("Masukkan operasi    :");
        Operasi = input.nextInt();

        switch (Operasi) {
            case 1: hasil =angka1+angka2; break;
            case 2: hasil =angka1-angka2; break;
            case 3: hasil =angka1*angka2; break;
            case 4: hasil =angka1/angka2; break;
        }
        if (Operasi==1) {
            System.out.println("Penjumlahan: " + hasil);
        } else if (Operasi==2) {
            System.out.println("Pengurangan: " + hasil);
        } else if (Operasi==3) {
            System.out.println("Perkalian: " + hasil);
        } else if (Operasi==4) {
            System.out.println("Pembagian: " + hasil);
        }
        else {
            System.out.println("Tidak dapat menampakkan hasil");

        }

    }

}