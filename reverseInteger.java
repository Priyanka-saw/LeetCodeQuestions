public class reverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int remainder = x % 10;
            rev = rev * 10 + remainder ;
            x /= 10;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}
