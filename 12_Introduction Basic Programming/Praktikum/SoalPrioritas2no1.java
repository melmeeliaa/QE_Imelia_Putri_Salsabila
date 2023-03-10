import java.util.Scanner;

public class SoalPrioritas2no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka   : ");
        int inputAngka = input.nextInt();
        int i,j,k = 0;
        int a = inputAngka;
        for(i=1; i<=a; i++) {
            for(j=1; j<=a; j++) {
                k++;
                if (k % 3 == 0) {
                    System.out.print("X");
                }
                else if (k % 2 == 0) {
                    System.out.print("Z");
                }
                else {
                    System.out.print("Y");
                }
            }
            System.out.println();
        }
    }
}