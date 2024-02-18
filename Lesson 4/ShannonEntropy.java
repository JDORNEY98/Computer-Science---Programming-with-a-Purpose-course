/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] data = new int[m + 1];
        double shan = 0;
        double count = 0;

        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            data[value] += 1;
            count += 1;
        }

        for (int i = 1; i <= m; i++) {
            // calculate amount of x integer
            double p = 0;
            if (data[i] != 0) {
                p = -(data[i] / count * (Math.log(data[i] / count) / Math.log(2)));
            }
            shan += p;
        }

        StdOut.printf("%.4f", shan);
    }
}
