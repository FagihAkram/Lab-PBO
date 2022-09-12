import java.util.Scanner;

public class Latihan1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num1, num2, hasil;

        System.out.print("Masukkan Angka pertama: ");
        num1 = input.nextInt();

        System.out.print("Masukkan Angka kedua: ");
        num2 = input.nextInt();

        hasil = num1 + num2;
        System.out.println("num1 + num2\t="+ hasil);
        hasil = num1 - num2;
        System.out.println("num1 - num2\t="+ hasil);
        hasil = num1 * num2;
        System.out.println("num1 * num2\t="+ hasil);
        float hasil2 = (float)num1 / (float)num2;
        System.out.println("num1 / num2\t="+ hasil2);
        hasil = num1 % num2;
        System.out.println("num1 % num2\t="+ hasil);
        
        input.close();
    }
    
}
