public class RumusMath {
    public static void main(String[] args) {
        double x = 2.0;
        double y = 3.0;
        double z = 5.0;

        double a = Math.sqrt(Math.pow(x, 5) - 6) / 4.0;
        double b = Math.pow(x, y) - Math.pow(6, x);
        double c = 4.0 * Math.cos(z / 5.0) - Math.sin(Math.pow(x, 2));
        double d = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3));
        double e = 1.0 / (y - 1.0 / (x - Math.pow(2, y)));
        double f = 7.0 * Math.cos(Math.sqrt(5.0 - Math.sin(Math.sqrt(3 * x - 4))));

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}