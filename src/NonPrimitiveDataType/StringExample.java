package NonPrimitiveDataType;

public class StringExample {
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1 == str3); // == compares memory location / reference
        System.out.println(str1.equals(str3)); // equals matches content / the actual string value

        int[][] arr2D = {{1,2,3},{4,5,6}};
        arr2D[0][0] = 10;
        System.out.println(arr2D[0][0]);
    }
}
