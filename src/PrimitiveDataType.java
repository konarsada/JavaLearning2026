public class PrimitiveDataType {
    public static void main (String args[]) {
        int i = 128;
        byte b = (byte) i;
        System.out.println("value of b is " + b);

        int i2 = 140;
        byte b2 = (byte) i2;
        System.out.println("value of b2 is " + b2);

        byte b3 = 1;
        byte b4 = 127;
        int i3 = b3 + b4;
        System.out.println("value of i3 is " + i3);

        // byte b5 = b3 + b4;
        /**
         * gives error as byte range is -128 to 127
         * we can explicitely type cast it (lossy)
         */
        byte b5 = (byte) (b3 + b4);
        System.out.println("value of b5 is " + b5);

        int i4 = 20;
        double d1 = 30d;
        // int i5 = i4 + d1; // gives error
        double d2 = i4 + d1;
        System.out.println(d2);
    }
}
