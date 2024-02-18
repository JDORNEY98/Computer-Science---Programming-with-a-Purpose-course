public class LongestRun {
    public static void main(String[] args) {

        // error check to see if the user has input any data
        if (StdIn.isEmpty()) {
            StdOut.println("Need more data!");
            return;
        }

        int previousnum = StdIn.readInt();
        int count = 1;
        int bestnum = previousnum;
        int bestlength = count;

        while (!StdIn.isEmpty()) {
            int currentnum = StdIn.readInt();
            // checks if equal to previous number then increases sequence count
            if (currentnum == previousnum) {
                count++;
            }
            // change once sequence is stopped
            else {
                previousnum = currentnum;
                count = 1;
            }
            // set best length
            if (count > bestlength) {
                bestlength = count;
                bestnum = currentnum;
            }
        }
        // output longest run number
        StdOut.println("Longest run: " + bestlength + " consecutive " + bestnum + "s");
    }
}
