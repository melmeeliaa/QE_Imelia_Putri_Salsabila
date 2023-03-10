import java.util.Scanner;

public class SoalPrioritas1no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Harga Jual   : ");
        int hargaJual = input.nextInt();

        System.out.print("Masukkan Harga Beli   : ");
        int hargaBeli = input.nextInt();

        int selisih = hargaJual - hargaBeli;

        if (selisih > 0) {
            System.out.println("Untung sebesar  : " + selisih);
        }
        else if (selisih == 0) {
            System.out.println("Sama Saja");
        }
        else {
            System.out.println("Rugi sebesar    : "+ selisih);
        }

    }
}