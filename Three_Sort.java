public class Three_Sort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int temp1 = Math.min(a, Math.min(b,c));
        int temp2 = Math.max(a, Math.max(b,c));
        int temp3 = a + b + c- temp1 - temp2;
        System.out.println(temp1+","+temp3+","+temp2);
    }
}
