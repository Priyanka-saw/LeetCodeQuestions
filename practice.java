public class practice {
    public static void main(String[] args) {

        System.out.println(Palind(434));
    }

    static boolean Palind(int n) {
        int xo = n, xR = 0;

        while (n > 0) {
            int rm = n % 10;
            xR = xR * 10 + rm;
            n = n / 10;
        }
        if (xo == xR) {
            return true;
        }
        return false;
    }
}
