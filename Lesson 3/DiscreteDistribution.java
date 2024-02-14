import java.util.Random;

public class DiscreteDistribution {
    public static void main(String[] args) {
        int tests = Integer.parseInt(args[0]);
        int length = args.length;
        int[] a = new int[length];
        for(int i = 0; i < length; i++){
            a[i] = Integer.parseInt(args[i]);
        }

        int[] s = new int[length];
        s[0]=0;
        for(int i = 1; i < length; i++) {
            s[i] = s[i-1] + a[i];
        }
        for(int j =0; j < tests; j++){
            int index = 1;
            Random random = new Random();
            int r = random.nextInt(s[length-1]);
            for(int i =1; i < length; i++) {
                if (s[i-1] <= r && r < s[i]){
                    index = i;
                }
                System.out.print(index + " ");
            }
        }
    }
}
