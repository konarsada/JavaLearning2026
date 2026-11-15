public class KindOfVariables {
    int memberVariable; // member variable
    static int staticVariable = 10; // static variable

    KindOfVariables() {} // default constructor

    KindOfVariables(int a) {} // parameterized constructor

    public void dummyMethod () {
        byte localVariable = 100; // local variable
        System.out.println(localVariable);
    }

    // method parameter
    public int dummyMethod2 (int a, int b) {
        return a + b;
    }
}
