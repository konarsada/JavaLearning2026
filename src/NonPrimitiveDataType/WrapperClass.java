package NonPrimitiveDataType;

public class WrapperClass {
    public static void main(String args[]) {
        int i1 = 10;
        Integer i2 = 20;

        System.out.println("before- i1: " + i1 + " i2: " + i2);

        modify(i1, i2);

        System.out.println("after- i1: " + i1 + " i2: " + i2);
    }

    public static void modify(int i1, Integer i2) {
        i1 = 30;
        i2 = 40;
    }
}