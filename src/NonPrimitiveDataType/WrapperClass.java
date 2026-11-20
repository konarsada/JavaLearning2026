package NonPrimitiveDataType;

import java.util.concurrent.atomic.AtomicInteger;

public class WrapperClass {
    public static void main(String args[]) {
        int i1 = 10;
        Integer i2 = 20;
        AtomicInteger i3 = new AtomicInteger(30);

        System.out.println("before- i1: " + i1 + " i2: " + i2 + " i3: " + i3);

        modify(i1, i2, i3);

        System.out.println("after- i1: " + i1 + " i2: " + i2 + " i3: " + i3);
    }

    public static void modify(int i1, Integer i2, AtomicInteger i3) {
        i1 = 40;
        /**
         * Reassigning a reference inside a method does not change the caller's reference.
         * Java performs autoboxing, effectively creating/referencing an Integer object containing 40 and assigning its reference to the local variable i2
         */
        i2 = 50;
        i2 = Integer.valueOf(50); // same as i2 = 50
        i3.set(60);
    }
}