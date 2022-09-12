import java.util.Scanner;

public class Latihan2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan nilai anda = ");
        nilai = input.nextInt();

        if(nilai <= 100 && nilai >=87) {
            System.out.print("\nGrade anda adalah A");
        } 
        else if (nilai < 87 && nilai >= 78) {
            System.out.print("\nGrade anda adalah AB");
        }
        else if (nilai < 78 && nilai >= 69) {
            System.out.print("\nGrade anda adalah B");
        }
        else if (nilai < 69 && nilai >= 60) {
            System.out.print("\nGrade anda adalah BC");
        }
        else if (nilai < 60 && nilai >= 51) {
            System.out.print("\nGrade anda adalah C");
        }
        else if (nilai < 51 && nilai >= 41) {
            System.out.print("\nGrade anda adalah D");
        }
        else if (nilai < 41 && nilai >= 0) {
            System.out.print("\nGrade anda adalah E");
        }
        else {
            System.out.print("\nNilai yang anda masukkan salah!");
        }

        input.close();
    }

}
