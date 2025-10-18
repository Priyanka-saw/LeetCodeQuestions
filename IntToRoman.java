public class IntToRoman {
    public static void main(String[] args) {
        int num = 34;
        System.out.println(intToRoman(num));
    }

    static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        String[] thousands = { "", "M", "MM", "MMM" };
        String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] units = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

        sb.append(thousands[num / 1000]);
        sb.append(hundreds[(num % 1000) / 100]);
        sb.append(tens[(num % 100) / 10]);
        sb.append(units[num % 10]);

        return sb.toString();
    }

}
