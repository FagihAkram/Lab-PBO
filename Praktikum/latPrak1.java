import java.util.Scanner;

public class latPrak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int barang, harga, belanja, discount, total;

        System.out.print("Masukkan jumlah barang: ");
        barang = input.nextInt();

        System.out.print("Masukkan harga barang: ");
        harga = input.nextInt();

        belanja = barang * harga;
        discount = belanja*15/100;
        total = belanja - discount;
        
        System.out.println("Total belanja anda = " +total);
        input.close();
    } 
}
