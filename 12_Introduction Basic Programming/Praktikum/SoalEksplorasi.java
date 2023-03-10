import java.util.Scanner;

public class SoalEksplorasi {
    public static void main(String[] args) {
        //deklarasi variabel
        String kata;
        // input enkripsi
        Scanner input = new Scanner(System.in);
        System.out.println("Input : ");
        kata = input.nextLine();
        //  variable
        int key = 10;
        String[] huruf = new String[26];


        //  isi array huruf
        for(char c = 'A'; c <= 'Z'; c++)
            huruf[c - 65] = String.valueOf(c);

        //  Proses Enkripsi
        String cipher = "";
        loop1:
        for(int a = 0; a < kata.length(); a++)
        {
            //  cari nomor dari tiap huruf variable kata
            int index_plain = -1;
            for(int b = 0; b < huruf.length; b++)
            {
                // Teknik Penulisan Short Hand If Else
                index_plain = (String.valueOf(kata.charAt(a)).equals(huruf[b])) ? b : -1;
                // Jika Ketemu Karakternya
                if(index_plain != -1)
                {
                    // Rumus Enkripsi --> C = (nomor_karakter_plain + key) mod 26
                    cipher += huruf[(index_plain + key) % 26];
                    continue loop1;
                }
            }


            //  Jika plain text tidak mengandung huruf maka, langsung dimasukkan ke variable cipher
            //  Misal, spasi atau angka
            cipher += kata.charAt(a);
        }

        //  Tampilkan hasil cipher
        System.out.println("Output : "+cipher);

    }
}
