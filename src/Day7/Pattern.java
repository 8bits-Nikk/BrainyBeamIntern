package Day7;

public class Pattern {

    public static void main(String[] args) {
        int value = 4;
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if (j == 1) {
                    System.out.print("*");
                } else if (j == 3) {
                    System.out.print("#");
                } else {
                    System.out.print(j);
                }
            }
            for (int j = 2; j <= i; j++) {
                if (j == 1) {
                    System.out.print("*");
                } else if (j == 3) {
                    System.out.print("#");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        for (int i = value - 1; i >= 1; i--) {
            for (int j = 1; j <= value - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if (j == 1) {
                    System.out.print("*");
                } else if (j == 3) {
                    System.out.print("#");
                } else {
                    System.out.print(j);
                }
            }

            for (int j = 2; j <= i; j++) {
                if (j == 1) {
                    System.out.print("*");
                } else if (j == 3) {
                    System.out.print("#");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
