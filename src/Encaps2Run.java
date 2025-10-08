public class Encaps2Run {
    public static void main(String[] args) {
        Encaps2 obj = new Encaps2();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSsn(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSn: " + obj.getEmpssn());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}
