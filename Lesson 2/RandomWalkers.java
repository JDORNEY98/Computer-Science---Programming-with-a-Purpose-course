public class RandomWalkers {
    public static void main(String[] args) {
        int manhattanDistance = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        int distance = 0;
        double randomnum = 0;
        int steps = 0;
        double average = 0;

        for (int j = 0; j <= trials; j++) {
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
                distance = Math.abs(x) + Math.abs(y);
                steps = i + 1;
            }
            x = 0;
            y = 0;
            distance = 0;
            if (trials > 1) {
                average = (average + steps) / 2;
            }
            else {
                average = steps;
            }
        }
        System.out.println("average number of steps = " + Math.round(average * 100000d) / 100000d);
    }
}


