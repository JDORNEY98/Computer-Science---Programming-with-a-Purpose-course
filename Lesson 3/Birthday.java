public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] count = new int[n];
        for (int j = 1; j < trials; j++) {
            boolean[] Birthday = new boolean[n];
            for (int i = 0; i < n; i++) {
                int r = (int) ((n) * Math.random());
                if (Birthday[r]) {
                    count[i] = count[i] + 1;
                    break;
                } else {
                    Birthday[r] = true;
                }
            }
        }
        int day = 1;
        int running_count = 0;
        double fraction = 0.000000;
        while(fraction <= 0.5){
            fraction = (double)running_count/trials;
            System.out.println(day+"\t"+count[day-1]+"\t"+fraction);
            running_count = running_count + count[day];
            day++;
        }
    }
}
