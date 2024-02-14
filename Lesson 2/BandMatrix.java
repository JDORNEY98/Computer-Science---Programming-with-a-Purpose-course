public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int diagonal = 0;

        for (int rows = 0; rows < n; rows++) {
            for (int column = 0; column < n; column++) {
                if (column == diagonal || Math.abs(diagonal - column) <= width) {
                    System.out.print("*" + "  ");
                }
                else {
                    System.out.print("0" + "  ");
                }
            }
            System.out.print("\n");
            diagonal++;
        }
    }
}
