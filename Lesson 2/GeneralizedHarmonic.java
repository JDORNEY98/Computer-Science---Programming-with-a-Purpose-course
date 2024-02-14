public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double calc = 0.0;
        double denom = 0.0;
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            denom = Math.pow((i + 1), r);
            calc = 1 / denom;
            total = total + calc;
        }
        System.out.println(total);
    }
}
