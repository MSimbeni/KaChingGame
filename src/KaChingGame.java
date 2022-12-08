public class KaChingGame {
    public static void main(String[] args) {

        for (int x = 1; x < 177; x++)

            if (x % 11 == 0 && x % 5 != 0 && x % 3 != 0) {
                System.out.println(" \"" + x + "\",");

            } else if (x % 3 == 0 && x % 5 == 0 && x % 11 == 0) {
                System.out.println(" \"ka-ching!\",");

            } else if (x % 3 == 0 && x % 5 == 0) {
                System.out.print(" \"ka-ching!\",");

            } else if (x % 3 == 0 && x % 11 == 0) {
                System.out.println(" \"ka\",");

            } else if (x % 3 == 0) {
                System.out.print(" \"ka\",");

            } else if (x % 5 == 0 && x % 11 == 0) {
                System.out.println(" \"ching!\",");

            } else if (x % 5 == 0) {
                System.out.print(" \"ching!\",");

            } else {
                System.out.print(" \"" + x + "\",");
            }
            }
}
