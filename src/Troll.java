public class Troll {
    public static int digital_root(int n) {

        if (n < 10)
            return n;
        else {
            return digital_root(Integer.sum(n % 10, n / 10));
        }
    }
}
