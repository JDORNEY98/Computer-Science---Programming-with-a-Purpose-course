public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isPositive = a>0 && b>0 && c>0;
        a = a*a;
        b = b*b;
        c=c*c;
        boolean isRightTriangle = isPositive && (a+b==c || a+c==b || b+c==a);
        System.out.println(isRightTriangle);
    }
}
