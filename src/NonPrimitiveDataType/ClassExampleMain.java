package NonPrimitiveDataType;

public class ClassExampleMain {
    public static void main(String args[]) {
        ClassExample empObj = new ClassExample();

        empObj.setEmpId(10);
        System.out.println("Employee ID: " + empObj.getEmpId());

        modify(empObj);
        System.out.println("Employee ID: " + empObj.getEmpId());

        ClassExample newEmp = empObj;
        newEmp.setEmpId(30);
        System.out.println("Employee ID: " + empObj.getEmpId());
    }

    public static void modify(ClassExample empObj) {
        empObj.setEmpId(20);
    }
}
