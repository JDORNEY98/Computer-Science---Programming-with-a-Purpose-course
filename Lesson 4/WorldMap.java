// - In terminal paste any of the following
// java-introcs WorldMap < usa.txt
// java-introcs WorldMap < usa-all-counties.txt
// java-introcs WorldMap < russia.txt
// java-introcs WorldMap < world.txt
// java-introcs WorldMap < world-low-resolution.txt
// java-introcs WorldMap < india.txt

public class WorldMap {
    public static void main(String[] args) {

        // get map size
        int width = StdIn.readInt();
        int height = StdIn.readInt();

        // set map size
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        StdDraw.enableDoubleBuffering();

        // add data to array using text file
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int numvertex = StdIn.readInt();
            double[] xvertex = new double[numvertex];
            double[] yvertex = new double[numvertex];

            for (int i = 0; i < numvertex; i++) {
                xvertex[i] = StdIn.readDouble();
                yvertex[i] = StdIn.readDouble();
            }

            // plot map
            StdDraw.polygon(xvertex, yvertex);
        }
        StdDraw.show();
    }
}
