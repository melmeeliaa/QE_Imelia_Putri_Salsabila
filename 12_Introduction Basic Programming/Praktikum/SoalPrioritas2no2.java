import java.util.Scanner;

public class SoalPrioritas2no2 {
    public static void main(String[] args) {
        //Deklarasi Variabel
        int tinggi;
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        tinggi = input.nextInt();
        input.close();


        //Membuat tinggi segitiga
        int jum = 1;
        for(int i=1;i<=tinggi;i++){
            //Membuat spasi
            for(int s=tinggi-i;s>0;s--){
                System.out.print(" ");
            }
            //Membuat bintang
            for(int b=1;b<=jum;b++){
                if (b%2==0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            jum+=2; //Sama dengan jum = jum + 2
            System.out.print("\n");
        }


    }
}
