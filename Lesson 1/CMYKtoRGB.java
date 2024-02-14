public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);
        double Dred = 1-cyan;
        double Dgreen = 1-magenta;
        double Dblue = 1-yellow;
        double white = 1-black;
        double Dwhite = 255*white;
        int red = Math.toIntExact(Math.round(Dwhite*Dred));
        int green = Math.toIntExact(Math.round(Dwhite*Dgreen));
        int blue = Math.toIntExact(Math.round(Dwhite*Dblue));
        System.out.println("red = "+red);
        System.out.println("green = "+green);
        System.out.println("blue = "+blue);
    }
}
