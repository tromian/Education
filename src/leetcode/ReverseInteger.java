package leetcode;

public class ReverseInteger {

    public static void main(String[] args) {

        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(1534236469);
        System.out.println(result);

    }

    public int reverse(int n){
        if (n != 0){
            int result = 0;
            boolean ifNotReversed = true;
            while (ifNotReversed){
                int checkOutOfInt = result;
                result = result*10 + n%10;
                if (result/10 != checkOutOfInt) return 0;
                n = n / 10;
                if (n == 0) ifNotReversed = false;
            }

            return result;

        }
        return 0;
    }

}
