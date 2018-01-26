
/*
 *   Created by Igor Konovalov on 26/01/2018
 */
public class HugeInt {

    private int [] digits;
    private final int size = 40;
    private int sign;

    HugeInt() {
        digits = new int[size];
        sign = 1;
    }

    HugeInt(long number) {
        this();
    }

    HugeInt(char[] number) {
        this();
    }

    HugeInt add(HugeInt other) {
        return null;
    }

    HugeInt substract(HugeInt other) {
        return null;
    }
}
