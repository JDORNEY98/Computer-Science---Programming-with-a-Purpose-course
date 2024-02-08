public class RandomWalker {
    public static void main(String[] args) {
        int manhattanDistance = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int distance = 0;
        double randomnum = 0;
        int steps = 0;
        System.out.println("(" + x + ", " + y + ")");

        for (int i = 0; distance < manhattanDistance; i++) {
            randomnum = Math.random();
            if (randomnum <= 0.25) {
                x = x + 1;
            }
            if (randomnum > 0.25 && randomnum <= 0.5) {
                y = y + 1;
            }
            if (randomnum > 0.5 && randomnum <= 0.75) {
                x = x - 1;
            }
            if (randomnum > 0.75 && randomnum <= 1.0) {
                y = y - 1;
            }
            System.out.println("(" + x + ", " + y + ")");
            distance = Math.abs(x) + Math.abs(y);
            steps = i + 1;
        }
        System.out.println("Steps = " + steps);
    }
}
