public class Uniform_Random {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        double temp1 = Math.min(a,b);
        temp1 = Math.min(temp1,c);
        temp1 = Math.min(temp1,d);
        temp1 = Math.min(temp1,e);
        double temp2 = Math.max(a,b);
        temp2 = Math.max(temp2,c);
        temp2 = Math.max(temp2,d);
        temp2 = Math.max(temp2,e);
        double temp3 = (a+b+c+d+e)/5;
        System.out.println("Numbers:"+a+" "+b+" "+c+" "+d+" "+e);
        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
    }
}
