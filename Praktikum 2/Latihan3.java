public class Latihan3 {
    public static void main (String args[]) {
        int y, z;

        for (y = 5; y > 0; y--) {

            for (z = y; z <= y && z > 0; z--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
